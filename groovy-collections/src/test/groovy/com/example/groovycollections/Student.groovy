package com.example.groovycollections

class Student {
    String name
    int age
    float mark

    Student() {
    }

    Student(String name, int age, float mark) {
        this.name = name
        this.age = age
        this.mark = mark
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    float getMark() {
        return mark
    }

    void setMark(float mark) {
        this.mark = mark
    }
}
