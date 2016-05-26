import groovy.xml.MarkupBuilder

/*
    <books>
        <book isbn="978-1935182443">
            <title>Groovy in Action 2nd Edition</title>
            <author>Dierk Koenig</author>
            <price>50.58</price>
        </book>
        <book isbn="978-1935182948">
            <title>Making Java Groovy</title>
            <author>Ken Kousen</author>
            <price>33.96</price>
        </book>
        <book isbn="978-1937785307">
            <title>Programming Groovy 2: Dynamic Productivity for the Java Developer</title>
            <author>Venkat Subramaniam</author>
            <price>28.92</price>
        </book>
    </books>
 */

MarkupBuilder builder = new MarkupBuilder()

builder.books {
    book(isbn: "978-1935182443") {
        title("Groovy in Action 2nd Edition")
        author("Dierk Koenig")
        price("50.58")
    }
    book(isbn: "978-1935182948") {
        title("Making Java Groovy")
        author("Ken Kousen")
        price("33.96")
    }
    book(isbn: "978-1937785307") {
        title("Programming Groovy 2: Dynamic Productivity for the Java Developer")
        author("Venkat Subramaniam")
        price("28.92")
    }
}

