package com.therealdanvega

// Groovy supports the concept of propertyMissing for intercepting otherwise failing property resolution attempts.

class Foo {

    def propertyMissing(String name) {
        "caught missing property: $name"
    }

}

println new Foo().bar
