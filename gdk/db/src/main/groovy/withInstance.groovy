import groovy.sql.Sql

String url = "jdbc:mysql://localhost:3306/twitter"
String username = "twitter"
String password = "password"

Sql.withInstance(url,username,password){
    // use sql instance

    // no need to close it
}
