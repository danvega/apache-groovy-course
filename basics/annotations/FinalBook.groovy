import groovy.transform.Immutable

@Immutable
class Book {

    // final private String title;
    String title


    // it also adds a correct hash code implementation
}

def book = new Book(title:"Groovy in Action 1");
println book.title
book.title = "Groovy in Action 2"
println book.title