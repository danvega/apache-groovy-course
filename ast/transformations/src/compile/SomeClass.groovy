import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

@CompileStatic
class SomeClass {

    String foo(){
        "foo"
    }

    String bar(){
        "bar"
    }

    @CompileStatic(TypeCheckingMode.SKIP)
    void noReturn(){

    }

}