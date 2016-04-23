package com.therealdanvega.service

import com.therealdanvega.domain.Person

interface IPersonService {

    Person find()

    List<Person> findAll()

}