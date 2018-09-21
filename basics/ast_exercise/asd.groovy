class MyClass {

    def myMethod() {
        variable = "I am a variable"
    }

    def propertyMissing(String name) {
        println "Missing property $name"
    }

    def backingMap = [:]

    Object getProperty( String property ) {
        if( backingMap[ property ] == null ) {
            propertyMissing( property )
        }
        else {
            backingMap[ property ]
        }
    }

    void setProperty( String property, Object value ) {
        backingMap[ property ] = value
    }
}

MyClass myClass = new MyClass()
myClass.myProperty
myClass.myMethod()
println myClass.variable