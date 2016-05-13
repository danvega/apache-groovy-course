// simple example


import groovyx.net.http.ContentType
@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')
import groovyx.net.http.RESTClient

String base = "http://api.icndb.com"

def chuck = new RESTClient(base)
def params = [firstName:"Dan",lastName:"Vega"]

chuck.contentType = ContentType.JSON
chuck.get( path: '/jokes/random', query: params ) { response, json ->
    println response.status
    println json
    println json.value.joke
}

// simple example passing parameters
