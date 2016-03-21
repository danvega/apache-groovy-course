import groovy.transform.*

@ToString
@Sortable
class Person {

    String first
    String last

}

def p1 = new Person(first:"Joe",last:"Vega")
def p2 = new Person(first:"Dan",last:"Vega")

def people = [p1,p2]
println people

def sorted = people.sort(false /* do not mutate original collection */ )
println sorted