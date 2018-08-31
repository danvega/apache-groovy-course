import groovy.transform.*

@ToString(includeNames = true, ignoreNulls = true)
@Sortable
class Person {
    //change order of fields around
    String firstName
    String lastName
    String gender
}

def p1 = new Person(firstName:"Joe",lastName:"Vega")
def p2 = new Person(firstName:"Kirsten",lastName:"Zaiga")
def p3 = new Person(firstName:"Dan",lastName:"Vega")
def p4 = new Person(firstName:"Daniel",lastName:"Satan")
def p5 = new Person(firstName:"Alan",lastName:"Junior")
def p6 = new Person(firstName:"William",lastName:"Nelson")
def p7 = new Person(firstName:"Geena",lastName: "Angel")
def p8 = new Person()

def people = [p1,p2,p3,p4,p5,p6,p7,p8]
println "unsorted: $people"

def sorted = people.sort(false /* do not mutate original collection */ )
println "sorted $sorted"

/*
when order of fields in class is lastName, firstName
[Person(Vega, Joe), Person(Zaiga, Kirsten), Person(Vega, Dan), Person(Satan, Daniel), Person(Junior, Alan), Person(Nelson, William), Person(Angel, Geena)]
[Person(Angel, Geena), Person(Junior, Alan), Person(Nelson, William), Person(Satan, Daniel), Person(Vega, Dan), Person(Vega, Joe), Person(Zaiga, Kirsten)]
 */

/*
when order of fields in class is firstName, lastName
[Person(Joe, Vega), Person(Kirsten, Zaiga), Person(Dan, Vega), Person(Daniel, Satan), Person(Alan, Junior), Person(William, Nelson), Person(Geena, Angel)]
[Person(Alan, Junior), Person(Dan, Vega), Person(Daniel, Satan), Person(Geena, Angel), Person(Joe, Vega), Person(Kirsten, Zaiga), Person(William, Nelson)]
 */