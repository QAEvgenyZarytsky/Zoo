package Zoo_corrected;

public class Fish extends Animal {

    public Fish(String name, Double age, Double weight){
        super(name, age, weight);
    }

    @Override
    public void animalBreathes() {
        System.out.println("I can breathe underwater");
    }

    @Override
    public void animalMoves() {
        System.out.println("I can swim underwater");
    }

    @Override
    public void animalSleeping() {
        System.out.println("I only sleep at night");
    }

    @Override
    public void animalEating() {
        System.out.println("I like to eat worms");
    }

    // this is methods of class

    public void fishSound() {
        System.out.println("I cannot make sounds");
    }

    public void fishJump() {
        System.out.println("I cannot jump\n");
    }

}
