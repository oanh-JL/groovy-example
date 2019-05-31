package com.example.groovycollections

import spock.lang.Shared
import spock.lang.Specification


class ListSpec extends Specification {
    @Shared
    List<Integer> list = [2, 4, 7, 9, 1, 10]

    void " trả về kích cỡ của list "() {
        expect:
        list.size() == 6
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
        list.max() == 10
        list.min() == 1
    }

    void " thêm bớt list "() {

        List list1, list2

        when:
        list1 = list + [1, 2, 5]
        list2 = list - 10 // remove all elem = 10

        then:
        list1 == [2, 4, 7, 9, 1, 10, 1, 2, 5]
        list2 == [2, 4, 7, 9, 1]
    }

    void " tính tong list "() {
        expect:
        list.sum() == 33
    }

    void " sắp xếp list "() {
        expect:
        list.sort() == [1, 2, 4, 7, 9, 10]

    }

}
