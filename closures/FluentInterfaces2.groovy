// Venkat Subramaniam
// https://www.youtube.com/watch?v=URkFOLywex4

// Java 8 
public class Mailer {

    def to(String address) {
        println('to')
    }

    def from(String address) {
         println('from')
    }
    
    def subject(String subject) {
         println('subject')
    }
    
    def body(String msg) {
         println('body')
    }
    
    def static send(closure){
        Mailer mailer = new Mailer()
        mailer.with closure
        println('sending...')
    }
}


Mailer.send {
    to("danvega@gmail.com");
    from("danvega@gmail.com");
    subject("Hello Dan");
    body("Message Body");
}
