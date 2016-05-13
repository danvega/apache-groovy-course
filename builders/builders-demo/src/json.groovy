import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    currentBook {
        title 'The 4 Hour Work Week'
        isbn '978-0-307-46535-1'
        author( first:'Timothy', last:'Ferriss', twitter:'@tferriss')
        related 'The 4 Hour Body', 'The 4 hour chef'
    }

    nextBook {
        title '#AskGaryVee'
        isbn '978-0-06-227312-3'
        author(first: 'Gary', last: 'Vaynerchuck', twitter: '@garyvee')
        related 'Jab, Jab, Jab, Right Hook', 'Crush It!'
    }

}

println builder.toString()
println builder.toPrettyString()

new File('json/books.json').write(builder.toPrettyString())