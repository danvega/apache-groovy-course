import groovy.text.SimpleTemplateEngine
import groovy.text.Template

//String text = new File('dynamic-email.txt').text
//println text

// 3 components to building a dynamic template

// 1. Engine (SimpleTemplateEngine)
// 2. Template (the email)
// 3. Data Bindings (The Data to insert into the dynamic portions of our email)

// new SimpleTemplateEngine(true)
SimpleTemplateEngine engine = new SimpleTemplateEngine(true)
Template template = engine.createTemplate( new File('dynamic-email.txt') )

// show error if properties are missing
Map bindings = [
        firstName: "Dan",
        lastName: "Vega",
        commits: 27,
        repositories: [
            [name:'Apache Groovy Course',url:'https://github.com/cfaddict/apache-groovy-course'],
            [name:'Spring Boot REST',url:'https://github.com/cfaddict/spring-boot-rest'],
            [name:'Learn Spring Boot',url:'https://github.com/cfaddict/learnspringboot']
        ]
]

println template.make(bindings)