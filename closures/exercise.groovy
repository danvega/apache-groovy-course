/*
Closure Basics
-------------------
- Locate the class java.lang.Closure and spend a few minutes looking through documentation.
- Create a Method that accepts a closure as an argument
- Create a closure that performs some action
- Call the method and pass the closure to it.
- Create a list and use the each to iterate over each item in the list and print it out
    Hint - You can use the implicit it or use your own variable
- Create a map of data and iterate over it using the each method. 
    This method can take a closure that accepts 1 or 2 arguments. 
    Use 2 arguments and print out the key and value on each line.
- Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture. 
*/


def mymethod(Closure c) {
   c()
}

def foo = {
    println "foo..."
}

mymethod(foo)

List names = ["Dan Vega","Joe Vega","Andy Vega","Katie Vega"]
names.each { name ->
    println name
}

Map teams = [baseball:"Cleveland Indians",basketball:"Cleveland Cavs",football:"Cleveland Browns"]
teams.each { k,v ->
    println "$k = $v"
}

def greet = { String greeting, String name ->
    println "$greeting, $name"
}

greet("Hello","Dan")
def sayHello = greet.curry("Hello")
sayHello("Joe")

/*
Explore the GDK
----------------------
- Search for the find and findAll methods.
    What is the difference between the two? 
    Write some code to show how they both work.
- Search for the any and every methods.
    What is the difference between the two? 
    Write some code to show how they both work. 
- Search for the method groupBy that accepts a closure
    What does this method do? 
    Write an example of how to use this method.
*/

List people = [
    [name:'Jane',city:"New York City"],
    [name:'John',city:"Cleveland"],
    [name:'Mary',city:"New York City"],
    [name:'Dan',city:"Cleveland"],
    [name:'Tom',city:"New York City"],
    [name:'Frank',city:"New York City"],
    [name:'Jason',city:"Cleveland"]    
]

println people.find { person -> person.city == "Cleveland" }
println people.findAll { person -> person.city == "Cleveland" }

println people.any { person -> person.city == "Cleveland" }
println people.every { person -> person.city == "Cleveland" }
println people.every { person -> person.name.size() >= 3 }

def peopleByCity = people.groupBy { person -> person.city } 
println peopleByCity
def newyorkers = peopleByCity["New York City"]
def clevelanders = peopleByCity.Cleveland 

clevelanders.each {
    println it.name
}


