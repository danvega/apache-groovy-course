import groovy.json.JsonSlurper

JsonSlurper slurper = new JsonSlurper()

def httpConnection = new URL('http://www.therealdanvega.com').openConnection()

println httpConnection.responseCode
//println slurper.parse(httpConnection.inputStream.newReader())


