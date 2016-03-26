// each & eachWithIndex
List favNums = [2,21,44,35,8,4]

for(num in favNums) {
    println num
}

favNums.each { println it }

for( int i=0; i<favNums.size(); i++){
    println "$i:${favNums[i]}"
}

favNums.eachWithIndex { num, idx ->
    println "$idx:$num"
}

// findAll
List days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
List weekend = days.findAll { it.startsWith("S") }

println days
println weekend

// collect
List nums = [1,2,2,7,2,8,2,4,6]

List numsTimesTen = []
nums.each { num ->
    numsTimesTen << num * 10
}

List newTimesTen = nums.collect { num -> num * 10 }

println nums
println numsTimesTen
println newTimesTen


