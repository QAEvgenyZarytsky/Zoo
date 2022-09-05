package Zoo_corrected;

public class Bird extends Animal {

    public Bird(String name, Double age, Double weight){
        super(name, age, weight);
    }

    @Override
    public String animalBreathes() {

        return  "I can breathe at a height of 100 meters";
    }

    @Override
    public String animalMoves() {
        return "I can fly";
    }

    @Override
    public String animalSleeping() {
        return "I can sleep sitting on a tree";
    }

    @Override
    public String animalEating() {
        return "I love eating bugs";
    }

    // this is methods of class


    public void birdSound() {
        System.out.println("I can sing beautifully");
    }

    public void birdJump() {
        System.out.println("I can jump on branches\n");
    }
}

