// Arithmetic operators

assert 10 + 1 == 11
assert 10 - 1 == 9
assert 10 * 2 == 20
assert 10 / 5 == 2
assert 10 % 3 == 1
assert 10 ** 2 == 100

// The binary arithmetic operators we have seen above are also available in an assignment form:
// += -= *= /= %= **=

def a = 10
a += 5 // a = a + 5
assert a == 15


// Relational operators

assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2


// Logical Operators

assert !false           
assert true && true     
assert true || false 


// Conditional Operators

    // Ternary Operator
    String s = ""
    if( s != null && s.length() > 0 ) {
        result = 'Found'
    } else {
        result = 'Not found'
    }
    
    String s = ""
    result = ( s != null && s.length() > 0 ) ? 'Found' : 'Not Found'

    // Elvis Operator
    displayName = user.name ? user.name : 'Anonymous'   
    displayName = user.name ?: 'Anonymous'   

// Object Operators

    // Safe Navigation Operator

    // Java
    Person p = new Person()
    if( p.address != null ) {
        Address address = p.address
        address.first = "1234 Main"
    }
    
    // Groovy
    def address = p?.address
    assert address == null
   
// So Much More
println "http://groovy-lang.org/operators.html"


