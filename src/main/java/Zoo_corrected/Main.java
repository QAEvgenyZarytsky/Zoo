package Zoo_corrected;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // я изменил свой проект, теперь он работает. Жду Ваших комментраиев!

    public static void main(String[] args) {

        // collections for our data

       ArrayList<Animal> listOfAnimals = new ArrayList<>();


        // ------------------TheFirstElement-----------------------------------
        Animal animal0 = new Animal("Exit", 0.0, 0.0);
        listOfAnimals.add(animal0);

        // -----------animal1----------------------------------

        Animal animal1 = new Animal("Mr.Bulbozavrik", 2.3, 99.5);
        listOfAnimals.add(animal1);

        // -----------animal2----------------------------------

        Animal animal2 = new Animal("Govroshik", 3.4, 145.3);
        listOfAnimals.add(animal2);

        // -----------animal3----------------------------------

        Animal animal3 = new Animal("Nafanya", 15.9, 35.9);
        listOfAnimals.add(animal3);

        // -----------beast1----------------------------------

        Animal animal4 = new Beast("Medvogonok", 9.6, 345.1);
        listOfAnimals.add(animal4);

        // -----------beast2----------------------------------

        Animal animal5 = new Beast("Egik", 1.7, 2.6);
        listOfAnimals.add(animal5);

        // -----------beast3----------------------------------

        Animal animal6 = new Beast("Enotik", 4.6, 17.4);
        listOfAnimals.add(animal6);

        // -----------bird1----------------------------------

        Animal animal7 = new Bird("Zazu", 2.1, 1.3);
        listOfAnimals.add(animal7);

        // -----------bird2----------------------------------

        Animal animal8 = new Bird("Zmey Gorynych", 46.3, 3124.3);
        listOfAnimals.add(animal8);

        // -----------bird3----------------------------------

        Animal animal9 = new Bird("Donald Dak", 33.1, 67.6);
        listOfAnimals.add(animal9);

        // -----------fish1----------------------------------


        Animal animal10 = new Fish("Rusalochka", 19.1, 65.4);
        listOfAnimals.add(animal10);

        // -----------fish2----------------------------------

        Animal animal11 = new Fish("Nemo", 4.3, 5.1);
        listOfAnimals.add(animal11);

        // -----------fish3----------------------------------

        Animal animal12 = new Fish("Zolotaya rybka", 999.99, 1.2);
        listOfAnimals.add(animal12);

        // ------------------sizeOfCollections-------------------------------

        int sizeCollection =  listOfAnimals.size();
        System.out.println("Objects in our collection: " + sizeCollection + ";");

        // ---------------------showOurCollections-------------------------------


        Scanner input = new Scanner(System.in);
         int number = 0;

        do {
            System.out.println("Choose animals and get information about it!\n");
            for (int i = 0; i < listOfAnimals.size(); i++) {
                String nameOfAnimals = listOfAnimals.get(i).getName();

                System.out.println(i + ". " + nameOfAnimals + ";");

            }
            try {
                number = input.nextInt();
            } catch (Exception e) {
                System.out.println("The input field accepts numbers from 0 to 12!");
                //System.out.println ("Please enter value!");
            }

            for (int j = 1; j < listOfAnimals.size(); j++) {
                String nameOfAnimals = listOfAnimals.get(j).getName();
                double ageOfAnimals = listOfAnimals.get(j).getAge();
                double weightOfAnimals = listOfAnimals.get(j).getWeight();

                if(j == number) {
                    System.out.println("My name: " + nameOfAnimals);
                    System.out.println("My age: " + ageOfAnimals);
                    System.out.println("My weight: " + weightOfAnimals);

                    showAbilities(listOfAnimals.get(number));

                    if (number > 3 && number <= 6) {
                        showUniqueAbilitiesForBeast((Beast) listOfAnimals.get(number));
                    } else if (number > 6 && number <= 9) {
                        showUniqueAbilitiesForBird((Bird) listOfAnimals.get(number));

                    } else if (number > 9 && number <= 12) {
                        showUniqueAbilitiesForFish((Fish) listOfAnimals.get(number));

                    }

                }
            }

        } while (number != 0);


    }

    // below methods

    public static void showAbilities(Animal animal) {
        System.out.println("Animal abilities!");
        animal.animalBreathes();
        animal.animalMoves();
        animal.animalSleeping();
        animal.animalEating();
        System.out.println("Oops... it's all!\n");
    }

    public static void showUniqueAbilitiesForBeast(Beast beast) {
        System.out.println("It's unique abilities of beast!");
        beast.beastSound();
        beast.beastJump();
    }

    public static void showUniqueAbilitiesForBird(Bird bird) {
        System.out.println("It's unique abilities of bird!");
        bird.birdSound();
        bird.birdJump();
    }

    public static void showUniqueAbilitiesForFish(Fish fish) {
        System.out.println("It's unique abilities of fish!");
        fish.fishSound();
        fish.fishJump();
    }



}
