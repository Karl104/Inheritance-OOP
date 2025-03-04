
interface Animal {
    void eat();
}


interface Sound {
    void makeSound();
}


class Multiple implements Animal, Sound {
    public void eat() {
        System.out.println("Chicken is eating");
    }

    public void makeSound() {
        System.out.println("Chicken Clucks");
    }
}
