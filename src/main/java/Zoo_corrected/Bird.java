package Zoo_corrected;

public class Bird extends Animal {

    public Bird(String name, Double age, Double weight){
        super(name, age, weight);
    }

    @Override
    public void animalBreathes() {
        System.out.println("I can breathe at a height of 100 meters");
    }

    @Override
    public void animalMoves() {
        System.out.println("I can fly");
    }

    @Override
    public void animalSleeping() {
        System.out.println("I can sleep sitting on a tree");
    }

    @Override
    public void animalEating() {
        System.out.println("I love eating bugs");
    }

    // this is methods of class


    public void birdSound() {
        System.out.println("I can sing beautifully");
    }

    public void birdJump() {
        System.out.println("I can jump on branches\n");
    }
}

