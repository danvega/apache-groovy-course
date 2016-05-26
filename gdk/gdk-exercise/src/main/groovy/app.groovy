import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = "twitter"
String password = "password"

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/twitter", username,password, "com.mysql.jdbc.Driver")

println "Connected to db."

// create schema
sql.execute('DROP TABLE IF EXISTS users')
sql.execute '''
CREATE TABLE users (
      id INT NOT NULL,
      username VARCHAR(45) NOT NULL,
      name VARCHAR(45) NULL,
      PRIMARY KEY (id)
  );
'''

// create some data
sql.execute '''
    INSERT INTO users (id,username,name)
    VALUES
    (1,'therealdanvega','Dan Vega'),
    (2,'glaforge','Guillaume Laforge'),
    (3,'aalmiray','Andres Almiray'),
    (4,'pledbrook','Peter Ledbrook'),
    (5,'kenkousen','Ken Kousen');
'''

// create a new file to hold our users in and put in the header values
def file = new File('twitter.csv')
file.write("id,username,name\n")

sql.eachRow('select * from users') { row ->
    file.append("${row.id},${row.username},${row.name}\n")
}


// close the connection
sql.close()
println "Completed!"
