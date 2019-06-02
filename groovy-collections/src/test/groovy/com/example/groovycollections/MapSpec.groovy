package com.example.groovycollections

import com.example.groovycollections.list.Map
import spock.lang.Specification
import java.util.stream.Collectors

class MapSpec extends Specification {

    Map student = [name: 'oanh', age: 21, mark: 9]

      Map mapStudent = [
            1: [name: 'oanh', age: 21, mark: 10],
            2: [name: 'ly', age: 20, mark: 10],
            3: [name: 'bin', age: 5, mark: 9],
            4: [name: 'Ba', age: 45, mark: 8]
    ]

    List<Student> lstStudent = new ArrayList<>()

    void " so sánh tên "() {

        expect:
        student.get('name') == 'oanh'
    }

    void " map hỗn tạp "() {

        Map messObj = [
                simple : [1, 4, 7],
                complex: [age: 24, mark: 5]
        ]
        expect:
        messObj.simple == [1, 4, 7]
        messObj.complex == [age: 24, mark: 5]
    }

    void " tìm kiếm trong list "() {

        Map findAll
        List<String> nameStudent
        when:
        findAll = mapStudent.findAll { it.value.mark == 10 }
        nameStudent = mapStudent
                .findAll { it, st -> st.mark == 10 }
                .collect { it, st -> st.get('name') }
        then:
        findAll == [1: [name: 'oanh', age: 21, mark: 10], 2: [name: 'ly', age: 20, mark: 10]]
        nameStudent == ['oanh', 'ly']
    }

    void " group by student "() {

        Map groupByStudent
        when:
        groupByStudent = mapStudent.groupBy { it.value.mark }
        then:
        groupByStudent == [
                10: [
                        1: [name: 'oanh', age: 21, mark: 10],
                        2: [name: 'ly', age: 20, mark: 10]
                ],
                9 : [3: [name: 'bin', age: 5, mark: 9]],
                8 : [4: [name: 'Ba', age: 45, mark: 8]]
        ]

    }

    void " split student "() {

        given:
        String Student = " name:oanh mark:10 "
        expect:
        Student.split(" ") == ["name:oanh", "mark:10"]
    }

    void " collect entries "() {

        Map collectEntries
        when:
        collectEntries = mapStudent.collectEntries([:]) { id, student ->
            [(student.name.toString().toUpperCase()): student.mark * 0.4]
        }
        then:
        collectEntries ==
                ['OANH': 4.0, 'LY': 4.0, 'BIN': 3.6, 'BA': 3.2]
    }


}
