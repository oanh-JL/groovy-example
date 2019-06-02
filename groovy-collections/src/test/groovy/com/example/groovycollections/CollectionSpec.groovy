package com.example.groovycollections

import com.example.groovycollections.list.Map
import spock.lang.Specification

class CollectionSpec extends Specification {
    void " collect entry parse list to map "() {
        given:
        List<Student> lstStudent = [new Student('Oanh', 21, 8),
                      new Student('Dung', 21, 9),
                      new Student('Huan', 22, 9)
        ]
        when:
        LinkedHashMap<String, Integer> studentMap = lstStudent.collectEntries{
           [(it.name):it.age]
        }
        then:
        studentMap == ['Oanh': 21, 'Dung': 21, 'Huan': 22]

    }


}
