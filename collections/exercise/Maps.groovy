/*
    Maps
    
    Create a map of days of the week
        1: Sunday, 2:Monday, etc...
    Print out the map
    Print out the class name of the map
    Print the size of the map
    Is there a method that would easily print out all of the days (values)? 
    Without closures you may have to look at the Java API for LinkedHashMap
*/

Map map = [1:"Sunday",2:"Monday",3:"Tuesday",4:"Wednesday",5:"Thursday",6:"Friday",7:"Saturday"]

println map
println map.getClass().getName()
println map.size()
println map.values()