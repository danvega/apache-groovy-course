import groovy.transform.Immutable

@Immutable
class Customer {

    String first, last
    int age
    Date since
    Collection favItems

}