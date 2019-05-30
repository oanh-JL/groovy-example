package com.example.groovycollections

import com.example.groovycollections.list.Map
import spock.lang.Shared
import spock.lang.Specification

class RangeSpec extends Specification{
    @Shared
    List<Map> listMap = [['a': 3, 'b': 4], ['a': 31, 'b': 1], ['a': 5, 'b': 4]]
    def persons = [["name":'Hugo', age:17], ["name":'Sandra',age:19]]

    def "tra ve list so"() {
        given:
        def list
        when:
        list = listMap.a
        then:
        list == [3,31,5]
    }
    def " tra ve tuoi cua obj"(){
        given:
        def ages
        when:
        ages = persons*.age
        then:
        ages == [17,19]
    }
}
