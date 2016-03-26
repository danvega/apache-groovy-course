/* 
 List Exercise 
 ---------------------------------

    Create a list days (Sun - Sat)
    Print out the list
    Print the size of the list
    Remove Saturday from the list
    Add Saturday back by appending it to the list
    Print out the Wednesday using its index
    
*/

def days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]

println days
println days.size()
days.pop()
println days
days << "Saturday"
println days
println days[3]