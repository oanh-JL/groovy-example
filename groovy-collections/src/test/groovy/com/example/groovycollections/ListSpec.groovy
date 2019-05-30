package com.example.groovycollections

import spock.lang.Shared
import spock.lang.Specification


class ListSpec extends Specification {
    @Shared
    def list = [2,4,7,9,1,10]
    def " tao 1 list moi tu 1 list da co san " () {
        when:
        List<Integer> list1 = new ArrayList<Integer>(list)
        List<String> list2 = list.clone() // it parses integer type to string
        then:
        list1 == list
        list2 == list

    }

    def " lay kich co cua list"() {
        when:
        def size = list.size()
        then:
        size == 6
    }
    def " cai dat data cho list" () {
        def list2 = list.clone()
        when:
        list2[2] = 9
        list2.set(1,5)
        list2.putAt(1,3)
        then:
        list2 == [2,3,9,9,1,10]
    }
    def "1 list co the hon tap bien"() {
        expect:
        a == b
        where:
        a           | b
        [1,2,false] | [1,2,false]
        ['a','c']   | ['a','b']
    }
    def " lay max list" () {
        def t, f
        when:
        Comparator mc = { a,b -> a==b ? 0 :(a<b? -1: 1)}
        t = list.max(mc)
        f = list.min(mc)
        then:
        t == 10
        f == 1
    }
    def " add sub list" () {
        def list1 , list2

        when :
        list1= list.clone()+ [1,2,5]
        list2 = list.clone() - 10 // remove all elem = 10

        then:
        list1 == [2,4,7,9,1,10,1,2,5]
        list2 == [2,4,7,9,1,]
    }

}
