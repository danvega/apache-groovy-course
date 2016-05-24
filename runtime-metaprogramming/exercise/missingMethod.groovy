class Person {

    def invokeMethod(String name, Object args) {
        println "invokeMethod called..."
    }

    def methodMissing(String name, args){
        println "methodMissing called..."
    }

}

Person p = new Person()
p.foo()