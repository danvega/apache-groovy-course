println "Please Enter Your Favorite Sports Team"

String team
System.in.withReader { reader ->
    team = reader.readLine()
}

println "Your favorite team is: $team"