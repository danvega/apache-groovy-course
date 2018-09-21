def printMe(){
    return "from closure"
}
def elvis_false = false ?: printMe()
println elvis_false

def elvis_true = true ?: "elvise true"
println elvis_true

def elvis_negatedFalse = !false ?: printMe()
println elvis_negatedFalse



println "-"*80

println !false
println !true
println "-"*80



Boolean primary
Boolean working
statement = false
setTrue = true
setFalse = false

primary = statement
println "BEFORE ALL: $primary"

working = primary ?: setTrue
println "IN BEFORE BLOCK:"
println "primary: $primary"
println "working: $working"

working = primary
println "IN AFTER BLOCK:"
println "primary: $primary"
println "working: $working"