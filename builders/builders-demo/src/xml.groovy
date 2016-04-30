import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitNullAttributes = true
builder.omitEmptyAttributes = true

builder.people {
    person(id:1){
        name 'Dan'
    }
    person(id:2){
        name 'Joe'
    }
    person(id:null){
        name 'null test'
    }
}
