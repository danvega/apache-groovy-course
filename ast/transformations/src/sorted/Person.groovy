package sorted

import groovy.transform.Canonical
import groovy.transform.Sortable

@Canonical
@Sortable( includes = ['last', 'first'] )
class Person {

    String first
    String last

}
