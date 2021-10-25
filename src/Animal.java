interface IAnimal {
    String run(int value);
    String swim(int value);
}

abstract class Animal implements IAnimal {
    private int animalDistanceRun, animalDistanceSwim;

    private String animalType;

    Animal(String animalType, int animalDistanceRun, int animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
        this.animalType = animalType;
    }

    @Override
    public String run(int value) {
        return ( getAnimalDistanceRun() > value )
                ? getAnimalType() + " пробежала " + value + " м "
                : getAnimalType() + " не может пробежать больше " + getAnimalDistanceRun() + " м ";
    }

    @Override
    public String swim(int value) {
        return ( getAnimalDistanceSwim() > value )
                ? getAnimalType() + " проплыла " + value + " м "
                : getAnimalType() + " не может проплыть больше " + getAnimalDistanceSwim() + " м ";
    }

    int getAnimalDistanceRun() {

        return animalDistanceRun;
    }

    int getAnimalDistanceSwim() {

        return animalDistanceSwim;
    }
    String getAnimalType() {
        return animalType;
    }
}

class Cat extends Animal {
    Cat( ) {
        super("Кошка",200, 0);
    }
}

class Dog extends Animal {

    Dog() {
        super( "Собака",500, 10);
    }
}



