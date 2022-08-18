package Zoo_corrected;

public class Animal implements GeneralProperties{

    static int counterAnimals;

    protected String name;

    protected String nameForInfo = name;
    protected double age;

    protected double weight;


    // below constructor

    public Animal(){};

    public Animal(String name, Double age, Double weight ) {
       setName(name);
       setAge(age);
       setWeight(weight);
   };



    // below getters and setters for variables

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Double age) {
        this.age = age;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public void getNameForInfo() {
        System.out.println("My name: " + nameForInfo);
    }


    // information about animal

//    public  String infoAboutAnimal() {
//        System.out.println("Hello my friend!\n");
//        getName();
//        getAge();
//        getWeight();
//        System.out.println();
//        return getName();
//
//    }

    // below methods


    @Override
    public void animalBreathes() {
        // nothing yet
        System.out.println("nothing yet");
    }

    @Override
    public void animalMoves() {
        // nothing yet
        System.out.println("nothing yet");
    }

    public void animalSleeping(){
        // nothing yet
        System.out.println("nothing yet");
    }

    public void animalEating() {
        // nothing yet
        System.out.println("nothing yet");
    }


}
