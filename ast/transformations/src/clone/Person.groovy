package clone

import groovy.transform.AutoClone

@AutoClone
class Person {

    String first
    String last
    List favItems
    Date since

}
