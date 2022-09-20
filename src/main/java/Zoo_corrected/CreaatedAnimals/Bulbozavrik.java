package Zoo_corrected.CreaatedAnimals;

import Zoo_corrected.Animal;

public class Bulbozavrik extends Animal {


    private String name = "Bulbozavrik";
    private double age = 2.3;
    private double weight =  99.5;


    public Bulbozavrik(String name, double age, double weight) {
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

//class check extends Animal{
//    public static void main(String[] args) {
//        Bulbozavrik one = new Bulbozavrik("name", 13, 13);
//        System.out.println(one.getName());
//    }


