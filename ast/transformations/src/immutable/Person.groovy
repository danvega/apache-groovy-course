package immutable

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
@Immutable
class Person {

    String first
    String last

}
