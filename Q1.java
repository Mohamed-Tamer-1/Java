interface Animal {
    void animaltype();
}

class Dog implements Animal {
    @Override
    public void animaltype() {
        System.out.println("Animal is Dog");
    }
}

class Cat implements Animal {
    @Override
    public void animaltype() {
        System.out.println("Animal is Cat");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.animaltype();
        cat.animaltype();
    }
}
