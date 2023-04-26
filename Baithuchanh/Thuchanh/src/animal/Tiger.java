package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {//tao lop thuong tu lop truu tuong, sau do implement tu lop interface edible
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";// de, su dung makeSound tra ve "roarrr"
    }

    @Override
    public String howToEat() {//implement how to eat tra ve null
        return null;
    }
}
