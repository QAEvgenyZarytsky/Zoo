package Zoo_corrected.CreaatedAnimals;

import Zoo_corrected.Beast;

public class Medvogonok extends Beast {


    private String name = "Medvogonok";
    private double age = 3.4;
    private double weight = 145.3;

    public Medvogonok(String name, double age, double weight) {
        super(name, age, weight);
        name = getName();
        age = getAge();
        weight = getWeight();

        this.name = name;
        this.age = age;
        this.weight = weight;

    }


    public void setName(String nameForConstructor) {
        this.name = nameForConstructor;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setWeight(double weightForConstrucor) {
        this.weight = weightForConstrucor;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getAge() {
        return this.age;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    //my methods for animals

    public void beastSound() {
        System.out.println("I can make a sound");
    }

    public void beastJump() {
        System.out.println("I can jump\n");
    }
}




