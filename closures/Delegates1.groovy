class MyOtherClass {
    String myString = "I am over in here in myOtherClass"
}

class MyOtherClass2 {
    String myString = "I am over in here in myOtherClass2"
}

class MyClass {
    def closure = {
        println myString
    }
}


MyClass myClass = new MyClass()
def closure = new MyClass().closure
closure.delegate = new MyOtherClass()
closure()     // outputs: I am over in here in myOtherClass

closure = new MyClass().closure
closure.delegate = new MyOtherClass2()
closure()     // outputs: I am over in here in myOtherClass2