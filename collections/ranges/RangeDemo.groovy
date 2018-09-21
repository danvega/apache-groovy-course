Range r = 1..10
println "range"
println r
println "range class name"
println r.class.name
println "range from"
println r.from
println "range to"
println r.to

assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

println today
println oneWeekAway

Range days = today..oneWeekAway
println days

Range letters = 'a'..'z'
println letters
letters.each {print it}
println ""
'A'..'z'.each {
    print it
}