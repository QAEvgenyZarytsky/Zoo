package Zoo_corrected;

import Zoo_corrected.CreaatedAnimals.*;

import java.sql.SQLOutput;
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

        Animal animal1 = new Bulbozavrik("Bulbozavrik", 2.3,99.5);
        listOfAnimals.add(animal1);


        // -----------animal2----------------------------------

        Animal animal2 = new Govroshik("Govroshik", 3.4, 145.3);
        listOfAnimals.add(animal2);

        // -----------animal3----------------------------------

        Animal animal3 = new Nafanya("Nafanya", 15.9, 35.9);
        listOfAnimals.add(animal3);

        // -----------beast1----------------------------------

        Animal animal4 = new Medvogonok("ds", 9.6, 345.1);
        listOfAnimals.add(animal4);

        // -----------beast2----------------------------------

        Animal animal5 = new Egik("ds", 1.7, 2.6);
        listOfAnimals.add(animal5);

        // -----------beast3----------------------------------

        Animal animal6 = new Enotik("ds", 4.6, 17.4);
        listOfAnimals.add(animal6);

        // -----------bird1----------------------------------

        Animal animal7 = new Zazu("Zazu", 2.1, 1.3);
        listOfAnimals.add(animal7);

        // -----------bird2----------------------------------

        Animal animal8 = new ZmeyGorynych("Zmh", 46.3, 3124.3);
        listOfAnimals.add(animal8);

        // -----------bird3----------------------------------

        Animal animal9 = new DonaldDak("test", 1, 1);
        listOfAnimals.add(animal9);

        // -----------fish1----------------------------------


        Animal animal10 = new Rusalochka("Rusalochka", 19.1, 65.4);
        listOfAnimals.add(animal10);

        // -----------fish2----------------------------------

        Animal animal11 = new Nemo("Nemo", 4.3, 5.1);
        listOfAnimals.add(animal11);

        // -----------fish3----------------------------------

        Animal animal12 = new ZolotayaRybka("Zolotaya rybka", 999.99, 1.2);
        listOfAnimals.add(animal12);

        // ------------------sizeOfCollections-------------------------------

        int sizeCollection = listOfAnimals.size();
        System.out.println("Objects in our collection: " + sizeCollection + ";");

        // ---------------------showOurCollections-------------------------------

        //System.out.println(listOfAnimals.get(1).getName());
       // System.out.println(listOfAnimals.get(2).getName());
//        System.out.println(listOfAnimals.get(12).getName());
//        String breath = animal12.animalBreathes();
//        String eat = animal12.animalEating();
//        String move = animal12.animalMoves();
//        String sleep = animal12.animalSleeping();
//
//        System.out.println(breath);
//        System.out.println(eat);
//        System.out.println(move);
//        System.out.println(sleep);
//
        // -------------------------------------------------------------------------

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


                    System.out.println("\nIt's the ability of the animal:");
                    System.out.println(listOfAnimals.get(number).animalBreathes());
                    System.out.println(listOfAnimals.get(number).animalMoves());
                    System.out.println(listOfAnimals.get(number).animalEating());
                    System.out.println(listOfAnimals.get(number).animalSleeping());
                    System.out.println("\n");



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

    // я не знаю как прокинуть имя объекта в эти методы чтобы их можно было использовать
    // если сможите помочь как это сделать, я был бы очень Вам благодарен!

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

