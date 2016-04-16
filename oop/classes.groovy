class Person {

    String firstName, lastName
    def dob
    // private | protected | public
    protected String f1,f2,f3
    private Date createdOn = new Date() 
    
    static welcomeMsg = 'HELLO'
    public static final String WELCOME_MSG = 'HELLO'    

    // local variables
    def foo() {
        String msg = "Hello"
        String firstName = "Dan"
        println "$msg, $firstName"
    }
    
    

}

def person = new Person()
println person.foo()