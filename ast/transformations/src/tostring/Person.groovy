package tostring

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ["email"])
class Person {

    String first
    String last
    String email

}
