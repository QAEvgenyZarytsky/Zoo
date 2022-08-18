package Zoo_corrected;

public class Beast extends Animal {


    public Beast(String name, Double age, Double weight){
        super(name, age, weight);
    };


    @Override
    public void animalBreathes() {
        System.out.println("I can breathe");
    }

    @Override
    public void animalMoves() {
        System.out.println("I can run fast on the ground");
    }

    @Override
    public void animalSleeping() {
        System.out.println("I like sleeping after eat");
    }

    @Override
    public void animalEating() {
        System.out.println("I like eating");
    }

    // the methods this class

    public void beastSound() {
        System.out.println("I can make a sound");
    }

    public void beastJump() {
        System.out.println("I can jump\n");
    }
}
