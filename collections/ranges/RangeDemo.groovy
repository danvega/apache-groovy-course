// this c style syntax for looping over a range has almost become second nature
// Range of * (numbers,letters,people,etc...)
// Groovy introduces the concept of ranges and makes working with these types of collections easier.
/*
for(int x = 1; x <= 10; ++x) {
    println x
}

for(int y = 10; y >= 1; --y) {
    println y
}

def letters = ['a','b','c']
for(int z = 0; z < letters.size(); ++z) {
    println letters[z]
}
*/

//Specifying Ranges 
//We can create a range by using the double-dot operator (..) between the left and right bounds. 

//left..right //double-dot operator
// left..<right // half exclusive range

// inclusive
assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

// half-exclusive ranges
assert (0..<10).contains(10) == false
assert (0..<10).contains(9)

 // reverse range
assert (10..0).contains(1)

def ageRange = 21..35
assert ageRange instanceof Range // IntRange

def ageRange2 = new IntRange(21,35)
assert ageRange2.contains(32)


// Date Ranges
Date today = new Date()
Date oneWeekAgo = today - 7 // thanks to the GDK

//println today
//println oneWeekAgo

(today..oneWeekAgo).each { day ->
    //println day
}

assert (today..oneWeekAgo).contains( today - 2 )

// String Ranges
assert ('a'..'f').contains('b')
assert ('a'..'f').contains('w') == false

// for in loop
for( index in 1..10 ) {
    //println index
}

// closures
(1..10).each { num ->
    println "num: $num"
}


//Ranges are objects

def alphabet = ('a'..'z')
alphabet.each { num ->
    print num
}

def age = 24
switch(age) {
    case 1..<18 : title ='minor'
    break
    case 18..99 : title = 'adult'
}

assert title == 'adult'

