package Tests;

import Zoo_corrected.Animal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckWeightTest extends BaseTest{
    @Test(groups = "group3")
    public void checkWeightAnimal1() {
        Animal animal1 = new Animal("Mr.Bulbozavrik", 2.3, 99.5);
        Double weightOfAnimal1 = animal1.getWeight();

        Assert.assertEquals(weightOfAnimal1, 99.5);

    }

    @Test(groups = "group3")
    public void checkWeightAnimal2() {
        Animal animal2 = new Animal("Govroshik", 3.4, 145.3);
        Double weightOfAnimal2 = animal2.getWeight();

        Assert.assertEquals(weightOfAnimal2, 145.3);
    }

    @Test(groups = "group3")
    public void checkWeightAnimal3() {
        Animal animal3 = new Animal("Nafanya", 15.9, 35.9);
        Double weightOfAnimal3 = animal3.getWeight();

        Assert.assertEquals(weightOfAnimal3, 35.9);
    }

    @Test(groups = "group3")
    public void checkWeightAnimal4() {
        Animal animal4 = new Animal("Medvogonok", 9.6, 345.1);
        Double weightOfAnimal4 = animal4.getWeight();

        Assert.assertEquals(weightOfAnimal4, 345.1);;
    }

    @Test(groups = "group3")
    public void checkWeightAnimal5() {
        Animal animal5 = new Animal("Egik", 1.7, 2.6);
        Double weightOfAnimal5 = animal5.getWeight();

        Assert.assertEquals(weightOfAnimal5, 2.6);
    }

    @Test(groups = "group3")
    public void checkWeightAnimal6() {
        Animal animal6 = new Animal("Enotik", 4.6, 17.4);
        Double weightOfAnimal6 = animal6.getWeight();

        Assert.assertEquals(weightOfAnimal6, 17.4);
    }

    @Test(groups = "group3")
    public void checkWeightAnimal7() {
        Animal animal7 = new Animal("Zazu", 2.1, 1.3);
        Double weightOfAnimal7 = animal7.getWeight();

        Assert.assertEquals(weightOfAnimal7, 1.3);
    }

    @Test(groups = "group3")
    public void checkWeightAnimal8() {
        Animal animal8 = new Animal("Zmey Gorynych", 46.3, 3124.3);
        Double weightOfAnimal8 = animal8.getWeight();

        Assert.assertEquals(weightOfAnimal8, 3124.3);
    }

    @Test(groups = "group3")
    public void checkWeightAnimal9() {
        Animal animal9 = new Animal("Donald Dak", 33.1, 67.6);
        Double weightOfAnimal9 = animal9.getWeight();

        Assert.assertEquals(weightOfAnimal9, 67.6);
    }

    @Test(groups = "group3")
    public void checkWeightAnimal10() {
        Animal animal10 = new Animal("Rusalochka", 19.1, 65.4);
        Double weightOfAnimal10 = animal10.getWeight();

        Assert.assertEquals(weightOfAnimal10, 65.4);
    }

    @Test(groups = "group3", expectedExceptions = ArithmeticException.class)
    public void checkWeightAnimal11() {
        Animal animal11 = new Animal("Nemo", 4.3, 5.1);
        Double weightOfAnimal11 = animal11.getWeight();

        Assert.assertEquals(weightOfAnimal11, 5.1);
    }

    @Test(groups = "group3", enabled = false)
    public void checkWeightAnimal12() {
        Animal animal12 = new Animal("Zolotaya rybka", 999.99, 1.2);
        Double weightOfAnimal12 = animal12.getWeight();

        Assert.assertEquals(weightOfAnimal12, 1.2);
    }


}
