package com.example.groovycollections.list

class Map {
    public static void main(String[] args) {
        def map = ['name':"oanh pham", 'likes':'Onepiece', 'age': 21]
       // assert map.get('name') =='oanhpham'  // check false expect: oanh pham
        println map.get('name').toString().contains('oanh') // done

        //-----------------------------------------------
        def ob1 = [:]
        ob1.put("mark", 10)
        println ob1

        def a = 'oanh'
        def ages = [(a): 47]
        assert  ages['oanh'] == 47

        def messObj = [
                simple: [1,4,7],
                complex: [age:24, mark:5]
        ]
        println messObj
        def map1 = messObj.get('simple').clone()
        def map2 = messObj.get('complex').clone()

        println map1
        println map2
        def student1 = [
                name: 'oanh',
                age : 21,
                mark : 10
        ]
        def student2 = [
                name: 'ly',
                age : 21,
                mark : 8
        ]
        def student3 = [
                name: 'trang',
                age : 21,
                mark : 10
        ]
        def student = [student1, student2, student3]
        student1.each { key, val -> println " $key  - $val "
        }
        def entries = student.each { i->
            def entry = i.entrySet()
            entry.each {
                it -> println it.key + "\t" + it.value

            }
        }

        def listStudent = [
                1 : [name: 'oanh', age : 21, mark: 10],
                2 : [name: 'ly', age : 20, mark: 10],
                3: [name: 'bin', age : 5, mark: 9],
                4 : [name: 'Ba', age : 45, mark: 8]
        ]
        println listStudent.findAll {
            it.value.mark == 10
        }

        def nameOfStudent = listStudent.findAll {it, st ->
            st.mark == 10
        }.collect {
            it, st -> println st.get("name")
        }
        // group by
        def arr = ['a', 'b', 1, 2, 4, [5, 6, 7]]
        arr.groupBy {
            it ->  it.class
        }
        println listStudent.groupBy {it -> it.value.mark}
        def entriesStudent = listStudent.entrySet()
        entriesStudent.each {
            it -> println it.value
        }
        String ab = "oanhpham 21 10"
        List<String> list = ab.split(" ")
        println list
    }
}
