package oop.abstract_demo

class AnimalAbstract  {

    static class Bird extends Animal {
        @Override
        void move() {
            println ("move is flying")

        }

        @Override
        void eat() {
            println ("eats seed")
        }

    }

    static class Fish extends Animal {

        @Override
        void move() {
            println "moving is swimming"

        }

        @Override
        void eat() {
            println "eats seafood"
        }
    }

    public static void main(String[] args) {
        Animal myBird = new Bird()
        println "i have a bird"
        myBird.eat()
        myBird.move()

        Animal myFish = new Fish()
        println " i have a fish"
        myFish.eat()
        myFish.move()
    }

}

