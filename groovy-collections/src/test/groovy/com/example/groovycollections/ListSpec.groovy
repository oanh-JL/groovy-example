package com.example.groovycollections

import spock.lang.Specification


class ListSpec extends Specification {
    final List<Integer> LIST = [2, 4, 7, 9, 1, 10]

    void " trả về kích cỡ của list "() {
        expect:
        LIST.size() == 6
    }

    void " setup data cho list"() {
        List<Integer> list2 = list
        when:
        list2[2] = 9
        list2.set(1, 5)
        list2.putAt(1, 2)
        then:
        list2 == [2, 3, 9, 9, 1, 10]
    }

    void " lấy max list"() {
        expect:
        LIST.max() == 10
        LIST.min() == 1
    }

    void " thêm bớt list "() {

        List list1, list2

        when:
        list1 = LIST + [1, 2, 5]
        list2 = LIST - 10 // remove all elem = 10

        then:
        list1 == [2, 4, 7, 9, 1, 10, 1, 2, 5]
        list2 == [2, 4, 7, 9, 1]
    }

    void " tính tong list "() {
        expect:
        LIST.sum() == 33
    }

    void " sắp xếp list "() {
        expect:
        LIST.sort() == [1, 2, 4, 7, 9, 10]

    }

    void " collect list "() {
        expect:
        LIST.collect { it * 2 } == [4, 8, 14, 18, 2, 20]
    }

}
