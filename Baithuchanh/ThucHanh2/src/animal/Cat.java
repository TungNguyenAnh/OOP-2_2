package animal;

import edible.Edible;

public class Cat extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cat: meow meow!";
    }

    @Override
    public String howToEat() {
        return "Mouth";
    }
}
