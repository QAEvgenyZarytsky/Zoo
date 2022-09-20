package Zoo_corrected;

public class Beast extends Animal {


    public Beast(String name, Double age, Double weight){
        super(name, age, weight);
    };


    @Override
    public String animalBreathes() {
        return  "I can breathe";
    }

    @Override
    public String animalMoves() {
        return "I can run fast on the ground";
    }

    @Override
    public String animalSleeping() {
        return "I like sleeping after eat";
    }

    @Override
    public String animalEating() {
        return "I like eating";
    }

    // the methods this class

    public void beastSound() {
        System.out.println("I can make a sound");
    }

    public void beastJump() {
        System.out.println("I can jump\n");
    }
}
