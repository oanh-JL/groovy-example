package com.example.groovycollections.list

class Range {

    static class Person{
        String name
        int age
        Person() {

        }
        Person( String name, int age) {
            this.name = name
            this.age = age
        }
    }
    public static void main(String[] args) {
        (1..10).each{ it -> it%2 ==0? println(it): null
        }
        List<Map> listMap = [['a': 3, 'b': 4], ['a': 31, 'b': 1], ['a': 5, 'b': 4]]
        println listMap.a
        println listMap*.a
        def persons = [["name":'Hugo', age:17], ["name":'Sandra',age:19]]
        println persons*.age

        Person person = new Person('Oanh', 21)
        List<Person> personList = new ArrayList<Person>()
        personList.add(person)
        personList += [new Person("Huan", 22), new Person("dung", 21)]
        personList.each {
            it -> println it.name +"\t"+ it.age
        }

    }
}
