Expando e = new Expando()

e.first = "Dan"
e.last  = "Vega"
e.email = "danvega@gmail.com"

e.getFullName = {
    "$first $last"
}

println e.toString()
println e.getFullName()

@groovy.transform.ToString(includeNames = true)
class Person {
    String first, last
}

Person p = new Person(first: "Dan", last: "Vega")
p.metaClass.email = "danvega@gmail.com"
println p
println p.email
