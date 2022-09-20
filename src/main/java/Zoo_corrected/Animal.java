package Zoo_corrected;

public class Animal implements GeneralProperties{

    static int counterAnimals;

    protected String name;

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

    // below methods


    @Override
    public String animalBreathes() {
        // nothing yet
        return "nothing yet";
    }

    @Override
    public String animalMoves() {
        // nothing yet
        return "nothing yet";
    }

    public String animalSleeping(){
        // nothing yet
        return "nothing yet";
    }

    public String animalEating() {
        // nothing yet
        return "nothing yet";
    }


}
