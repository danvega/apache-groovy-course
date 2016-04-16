// if( boolean expression ) { //logic }

if( true ) {
    println "true"
}

if( true ) 
    println true
    
def age = 35
if( age >= 35 ){
    println "can run for president"
}

if( false ) {
    println "true"
} else { 
    println "false"
}

def yourage = 18
if( yourage >= 21 ) {
    println "buy beer"
} else {
    println "no beer for you"
}

def someage = 37

if( someage >= 21 && someage < 35 ) {
    println "buy some beer"
} else if( someage >= 35 ) {
    println "run for president"
} else {
    println "under 21..."
}  

// -------------------------------------------------------
// ternary operator (expression) ? true : false

def name = 'Dan'
def isitdan = (name.toLowerCase() == 'DAN') ? 'YES' : 'NO'
println isitdan

def msg 
def output = (msg != null) ? msg : 'default message...'

def elvisOutput = msg ?: 'default message...'

println msg
println output
println elvisOutput

// -------------------------------------------------------

def num = 12

switch( num ) {
    case 1 :
        println "1"
        break
    case 2 :
        println "2"
        break
    case 1..3 :
        println "in range 1..3"    
        break
    case [1,2,12] :
        println "num is in list [1,2,12]"
        break
    case Integer :
        println "num is an Integer"
        break
    case Float :
        println "num is a float"
        break
    default :
        println "default..."    
}

// in 
def validAges = 18..35
def someAge = 19
println someAge in validAges




  