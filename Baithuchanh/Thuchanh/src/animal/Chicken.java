package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {//tao lop thuong tu lop truu tuong, sau do implement tu lop interface edible
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";// de, su dung makeSound tra ve "cluck.."
    }

    @Override
    public String howToEat() {//implement how to eat tra ve could...
        return "Could be fried";
    }
}
