package Zoo_corrected;

public class Fish extends Animal {

    public Fish(String name, Double age, Double weight){
        super(name, age, weight);
    }

    @Override
    public String animalBreathes() {
        return  "I can breathe underwater";
    }

    @Override
    public String animalMoves() {
        return "I can swim underwater";
    }

    @Override
    public String animalSleeping() {
        return "I only sleep at night";
    }

    @Override
    public String animalEating() {
        return "I like to eat worms";
    }

    // this is methods of class

    public void fishSound() {
        System.out.println("I cannot make sounds");
    }

    public void fishJump() {
        System.out.println("I cannot jump\n");
    }

}
