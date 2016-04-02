// implicit parameter
def foo = {
    println it
}

foo('dan')

def noparams = { ->
    println "no params..."
}

noparams()

def sayHello = { String first, String last ->
    println "Hello, $first $last"
}

sayHello("Dan","Vega")

// default values
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

greet("Dan","Hello")
greet("Joe")

// var-arg
def concat = { String... args -> 
    args.join('')
}

println concat('abc','def')
println concat('abc','def','123','456')


def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)


