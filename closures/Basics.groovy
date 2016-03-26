def c = { }

println c.class.name
println c instanceof Closure

def sayHello = { name ->
    println "Hello, $name"
}

sayHello('Dan')

List nums = [1,4,7,4,30,2]
nums.each { num ->
    println num
}

// closures are objects & last param

def timesTen(num,closure) {
    closure(num * 10)
}

timesTen(10, { println it })
timesTen(2) { 
    println it 
}

10.times { 
    println it
}

import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}