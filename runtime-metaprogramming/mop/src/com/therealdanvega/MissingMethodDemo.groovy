package com.therealdanvega

// Groovy supports the concept of methodMissing. This method differs from invokeMethod in that it is only
// invoked in case of a failed method dispatch, when no method can be found for the given name and/or the given arguments:

class MyEmployee {

    def methodMissing(String name, def args){

        if( name != 'someMethod' ) {
            throw new MissingMethodException(name,MyEmployee.class,args)
        }

        println "Method Missing called on: $name"
        println "with arguments ${args}"
    }

}

MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,3)
emp.someOtherMethod(4,5,6)
