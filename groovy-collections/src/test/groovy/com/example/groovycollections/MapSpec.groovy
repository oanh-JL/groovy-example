package com.example.groovycollections

import spock.lang.Shared
import spock.lang.Specification

class MapSpec extends Specification {
    @Shared
    Map student = [name:'oanh', age: 21, mark : 9]
    def listStudent = [
            1 : [name: 'oanh', age : 21, mark: 10],
            2 : [name: 'ly', age : 20, mark: 10],
            3: [name: 'bin', age : 5, mark: 9],
            4 : [name: 'Ba', age : 45, mark: 8]
    ]
    def "get key to compare" () {
        given:
        def name
        when:
        name = student.get('name')
        then:
        name == 'oanh'
    }
    def " mess map" () {
        given:
        def messObj = [
                simple: [1,4,7],
                complex: [age:24, mark:5]
        ]
        def sp, cp
        when:
        sp = messObj.simple.clone()
        cp = messObj.complex.clone()
        then:
        sp == [1,4,7]
        cp == [age:24, mark:5]
    }
    def " tim kiem trong list" () {
        def findAll, nameST
        when:
        findAll = listStudent.findAll {
            it.value.mark == 10
        }
        nameST = listStudent.findAll {it , st -> st.mark == 10 }.collect {it, st -> st.get('name') }
        then:
        findAll == [1:[name:'oanh', age:21, mark:10], 2:[name:'ly', age:20, mark:10]]
        nameST ==['oanh','ly']
    }
    def "group by student"(){
        def groupByST
        when:
        groupByST = listStudent.groupBy {
            it -> it.value.mark
        }
        then:
        groupByST ==  [10:[1:[name:'oanh', age:21, mark:10], 2:[name:'ly', age:20, mark:10]], 9:[3:[name:'bin', age:5, mark:9]], 8:[4:[name:'Ba', age:45, mark:8]]]

    }
    def " split student"() {
        given:
        def st = "name:oanh mark:10"
        when :
        st = st.split(" ")
        then:
        st == ["name:oanh","mark:10"]
    }


}
