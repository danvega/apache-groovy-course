import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = "twitter"
String password = "password"

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/twitter", username,password, "com.mysql.jdbc.Driver")

println "Connected!"


// create schema
sql.execute('DROP TABLE IF EXISTS users')

sql.execute '''
CREATE TABLE users (
      id INT NOT NULL,
      username VARCHAR(45) NOT NULL,
      bio VARCHAR(45) NULL,
      PRIMARY KEY (id)
  );
'''


// create data
sql.execute '''
    INSERT INTO users (id,username,bio) VALUES (1,'therealdanvega','Programmer.Blogger.YouTuber.Teacher.')
'''

// we could even create a list of maps here
Map twitterUser = [id:2,username: 'groovylang',bio:'Twitter feed of the Groovy Programming Language.']

sql.execute """
  INSERT INTO users (id,username,bio)
  VALUES
  (${twitterUser.id},${twitterUser.username},${twitterUser.bio})
"""


// query the data
// def rows = ...
List<GroovyRowResult> rows = sql.rows('select * from users')
println rows

sql.eachRow('select * from users') { row ->
    println "Tweet: @${row.username}"
}

// calling close manually
sql.close()