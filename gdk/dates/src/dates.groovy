
// create a date
Date today = new Date()
println today
println "-------------"

// pass a string into the constructor
Date bday = new Date('08/21/1978')
println bday

// format
println bday.format('M-d-Y')
println "-------------"

// add and subtract
// show the plus() and minus() methods first (operator overloading)
Date oneWeekFromToday = today.plus(7)
Date oneWeekAgo = today.minus(7)
println oneWeekAgo
println oneWeekFromToday
println "-------------"

// downto | upto
oneWeekFromToday.downto(today){
    println it
}
println "-------------"

// looping
// range (you can also do some kind of for loop here if you wanted)
Range twoWeeks = oneWeekAgo..oneWeekFromToday
twoWeeks.each {
    println it
}
println "-------------"


// next and previous
Date newyear = new Date('01/01/2017')
println newyear.next()
println newyear.previous()
println "-------------"

Date rightnow = new Date()
println rightnow.toTimestamp()