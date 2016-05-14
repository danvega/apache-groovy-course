@RestController
class GreetingController {
    
    @RequestMapping("/{name}")
    String home(@PathVariable String name){
        "Hello $name"
    }
    
}