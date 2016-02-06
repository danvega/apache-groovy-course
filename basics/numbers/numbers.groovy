// if we did this in Java it would fail
int x = 1;
println x.toString()

// primitives are autoboxed to their wrapper equivalents most of the time. 
println x.getClass().getName()

def y = 2
println y.toString()
println y.class

// x & y are objects of type Integer which inherits the method plus from java.lang.Number
println x.plus(y)
