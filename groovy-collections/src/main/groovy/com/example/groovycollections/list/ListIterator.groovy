package com.example.groovycollections.list

class ListIterator {
       public static void main(String[] args) {
           def list1= ['a', 'b', 'c']
           def list2 = new ArrayList<String>(list1)
                assert list2 == list1   // check 2 lists equal
            def list3 = list1.clone()
                assert list3 == list1   // check 2 lists equal

           // -----------------------------------------------------
           def list = [1, 3, 5, 7, 9]
           assert list.size() == 5

           assert  list[2] == 5
           assert  list.getAt(2) == 5
          //assert  list.get(2) == 1 // check false , expect == 5. simply [] ~ getAt() ~ get() give same result

           //----------------------------------------------------------
           list[2] = 10
           assert list == [1,3,10,7,9]
           list.set(2,9)
           assert  list == [1,3,9,7,9]
           list.putAt(2,8)
           assert list == [1,3,8,7,9]

           //------------------------------------------------------
           assert [-1, 2, "a", false ]
           //=-------------------------------------

           list.each {
               it -> print("item $it ")
           }

           list.eachWithIndex{ it,  i -> println "$i : $it"}

           //--------------------------------------

           assert list.collect {it*2} == [2,6,16,14,18]

           //--------------------------------------
           assert list.find{ it> 3} == 8 // get first elem in list

           assert list.findAll { it > 3} == [8,7,9] //get all elem in list

           //--------------------------------------------

           assert list.every{ it <10 }  // this case return true
          //  assert !list.every { it <10} this case false
           assert  list.any { it > 3} // true , at least 1 elem >3
          //  assert  !list.any { it > 3} case false , at least elem <3

           assert  list.sum() == 28
           assert ['a','a', false, 'c'].sum { it == 'a'?1: it == 'c'?2 : it == false?3: 0} == 7

           list.add(10) // add elem in last index
           list.add(3,10,) // it'll add elem 10 in position 3
           println(list)

           // assert list.remove(1) == [1, 8,10,7,9,10]
           list.removeElement(10)
           println list.join('-')
           // ------------------------------------------------------
           assert list.max() == 10
           Comparator mc = { a,b -> a==b ? 0 :(a<b? -1: 1)}
           assert list.max(mc) == 10
           assert list.min(mc) == 1
           //----------------------------------------
            list -= 10 // remove all elem value = 10
           println list
    }
}
