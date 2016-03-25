enum Days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

def dayRange = Days.SUNDAY..Days.SATURDAY

dayRange.each { day ->
    println day
}

println dayRange.size()
println dayRange.contains(Days.WEDNESDAY)

// Bonus: next() and previous() are equivalent to
// ++ and -- operators.
def wednesday = Days.WEDNESDAY
assert Days.THURSDAY == ++wednesday
assert Days.WEDNESDAY == --wednesday