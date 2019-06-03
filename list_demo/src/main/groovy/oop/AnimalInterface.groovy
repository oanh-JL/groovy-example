package oop

class AnimalInterface {

    interface Animal {
        public  void eat()
        public void sound()
    }

    interface Bird {
        int legs = 2
        String outerCovering = "feather"
        public void fly()
    }

   static class Eagle implements Animal, Bird {

        @Override
        void eat() {
            println "eats seed"
        }

        @Override
        void sound() {
            println "whisiting sound"

        }

        @Override
        void fly() {
            println "up to 1000000 feed"
        }
    }

    public static void main(String[] args) {
        Eagle myBird = new Eagle()
        myBird.eat()
        myBird.sound()
        myBird.fly()
        println "my bird have ${Bird.legs} legs"
        println "my bird have ${Bird.outerCovering}"

    }
}
