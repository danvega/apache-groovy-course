// if ( boolean expresson) { //logic }

// if
if( true ) {
    println "true"
}

if( true )
    println "true"

def age = 35
if( age >= 35 ) {
    println "can run for president"
}

// if / else

if( false ) {
    println "true"
} else {
    println "false"
}

def yourage = 21
if( yourage >= 21 ) {
    println "buy beer"
} else {
    println "no beer for you"
}

// else if
if( false ) {
    println "true"
} else if(true) {
    println "elseif"
} else {
    println "false"
}

def someage = 37

if( someage >= 21 ) {
    println "buy some beer"
} else if( someage >= 35 ) {
    println "run for president"
} else {
    println "under 21..."
}    

// -------------------------------------------------------
// ternary operator (expression) ? true : false

def name = 'Dan'
def isitdan = (name.toUpperCase() == 'DAN') ? 'YES' : 'NO'
println isitdan

// elvis operator ?:
def msg
def output = (msg != null) ? msg : 'default msg...'

def elvisOutput = msg ?: 'default msg...'

println output
println elvisOutput


// -------------------------------------------------------

def num = 5

switch( num ){
    case 1 : 
        println "1"
    case 2 :
        println "2"
    case 3 :
        println "3"
        break;
    case 4 : 
        println "4"
    case [5,10,15] :
        println "in list 5,10,15"
        break;
    case 1..5 :
        println "number falls in the range 1..5"
        break    
    case Integer :
        println "number is an integer"
        break;
    case Float :
        println "number is a Float"
        break;    
    default :
        println "default"
}


// -------------------------------------------------------

def validAges = 18..35
def someAge = 19
println someAge in validAges

