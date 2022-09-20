package Tests;

import Zoo_corrected.Animal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAgeTest extends BaseTest {
    @Test(groups = "group2")
    public void checkAgeAnimal1() {
        Animal animal1 = new Animal("Mr.Bulbozavrik", 2.3, 99.5);
        Double ageOfAnimal1 = animal1.getAge();

        Assert.assertEquals(ageOfAnimal1, 2.3);

    }

    @Test(groups = "group2")
    public void checkAgeAnimal2() {
        Animal animal2 = new Animal("Govroshik", 3.4, 145.3);
        Double ageOfAnimal2 = animal2.getAge();

        Assert.assertEquals(ageOfAnimal2, 3.4);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal3() {
        Animal animal3 = new Animal("Nafanya", 15.9, 35.9);
        Double ageOfAnimal3 = animal3.getAge();

        Assert.assertEquals(ageOfAnimal3, 15.9);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal4() {
        Animal animal4 = new Animal("Medvogonok", 9.6, 345.1);
        Double ageOfAnimal4 = animal4.getAge();

        Assert.assertEquals(ageOfAnimal4, 9.6);;
    }

    @Test(groups = "group2")
    public void checkAgeAnimal5() {
        Animal animal5 = new Animal("Egik", 1.7, 2.6);
        Double ageOfAnimal5 = animal5.getAge();

        Assert.assertEquals(ageOfAnimal5, 1.7);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal6() {
        Animal animal6 = new Animal("Enotik", 4.6, 17.4);
        Double ageOfAnimal6 = animal6.getAge();

        Assert.assertEquals(ageOfAnimal6, 4.6);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal7() {
        Animal animal7 = new Animal("Zazu", 2.1, 1.3);
        Double ageOfAnimal7 = animal7.getAge();

        Assert.assertEquals(ageOfAnimal7, 2.1);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal8() {
        Animal animal8 = new Animal("Zmey Gorynych", 46.3, 3124.3);
        Double ageOfAnimal8 = animal8.getAge();

        Assert.assertEquals(ageOfAnimal8, 46.3);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal9() {
        Animal animal9 = new Animal("Donald Dak", 33.1, 67.6);
        Double ageOfAnimal9 = animal9.getAge();

        Assert.assertEquals(ageOfAnimal9, 33.1);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal10() {
        Animal animal10 = new Animal("Rusalochka", 19.1, 65.4);
        Double ageOfAnimal10 = animal10.getAge();

        Assert.assertEquals(ageOfAnimal10, 19.1);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal11() {
        Animal animal11 = new Animal("Nemo", 4.3, 5.1);
        Double ageOfAnimal11 = animal11.getAge();

        Assert.assertEquals(ageOfAnimal11, 4.3);
    }

    @Test(groups = "group2")
    public void checkAgeAnimal12() {
        Animal animal12 = new Animal("Zolotaya rybka", 999.99, 1.2);
        Double ageOfAnimal12 = animal12.getAge();

        Assert.assertEquals(ageOfAnimal12, 999.99);
    }

}
