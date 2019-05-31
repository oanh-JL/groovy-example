package com.example.groovycollections

import com.example.groovycollections.list.Map
import spock.lang.Specification

class RangeSpec extends Specification {
    List<Map> listMap = [['a': 3, 'b': 4], ['a': 31, 'b': 1], ['a': 5, 'b': 4]]
    List<Map> persons = [["name": 'Hugo', age: 17], ["name": 'Sandra', age: 19]]

    void " tra ve list so "() {
        expect:
        listMap.a == [3, 31, 5]
    }

    void " tra ve tuoi cua obj "() {
        expect:
        persons*.age == [17, 19]
    }
}
