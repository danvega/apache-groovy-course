package singleton

//DatabaseConnection dbConnection = new DatabaseConnection()
//println dbConnection

DatabaseConnection db = DatabaseConnection.instance
println db