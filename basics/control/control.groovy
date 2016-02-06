// if
if( true )
    println "This was true"

// null | empty strings | empty collections


// if else
def x = 10
if( x == 10 ) {
    println "x was 10"
} else {
    println "x was NOT 10"
}


// classic while
def i = 1
while( i <= 10 ){
    println i
    i++
}


// for in list
def list = [1,2,3,4]
for( num in list ){
    println num
}

// the each method with a closure
def list = [1,2,3,4]
list.each { println it }


// switch
// show if if if if
def myNumber = 10

if( myNumber == 1 ){
    println "number is 1"
}
// etc...

def myNumber = 1
switch(myNumber) {

    case 1:
       println "number is 1"
       break

    default:
        println "default"
}


