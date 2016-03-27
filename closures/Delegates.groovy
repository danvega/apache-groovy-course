class Nike {

    def justDoIt(String name){
        println "Just Do it $name"
    }

}

def c = { name ->
    justDoIt(name)
}

c.delegate = Nike
c('Dan')