import groovy.transform.ToString

// each & eachWithIndex
List favNums = [2,21,44,35,8,4]

for(num in favNums) {
    println num
}
println "favnums each"
favNums.each { println it }

for( int i=0; i<favNums.size(); i++){
    println "$i:${favNums[i]}"
}

println "favnums each with index"
favNums.eachWithIndex { num, idx ->
    println "$idx:$num"
}

// findAll
List days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
List weekend = days.findAll { it.startsWith("S") }

println days
println weekend

// collect
List nums = [1,2,2,7,2,8,2,4,6]

List numsTimesTen = []
println "nums tiems ten favs"
nums.each { num ->
    numsTimesTen << num * 10
}

List newTimesTen = nums.collect { num -> num * 10 }

println nums
println numsTimesTen
println newTimesTen

// map functions
def person = [first:"Dan",last:"Vega",email:"danvega@gmail.com"]

person.each { entry -> 
    println entry
}

person.each { k, v ->
    println "$k:$v"
}


// map | filter | reduce
@ToString
class Person {
    String name
    int age
}

List<Person> people = [
    new Person(name:"Joe", age:45),
    new Person(name:"Mary", age:35),
    new Person(name:"Andrew", age:25)
]

println people

assert people
    .findAll { it.age < 40 }
    .collect {it.name.toUpperCase() }
    .sort()
    .join(', ') == "ANDREW, MARY"
