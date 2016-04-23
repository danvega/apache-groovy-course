package com.therealdanvega.service

import com.therealdanvega.domain.Person

class PersonService implements IPersonService {

    @Override
    Person find() {
        Person p = new Person(first:"Dan",last:"Vega")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first:"Dan",last:"Vega")
        Person p2 = new Person(first:"Joe",last:"Vega")
        [p1,p2]
    }
}
