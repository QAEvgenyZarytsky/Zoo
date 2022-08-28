package Tests;
import Zoo_corrected.Animal;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckNameTest extends BaseTest {
    @Test(groups = "group1")
    public void checkNameAnimal1() {
        Animal animal1 = new Animal("Mr.Bulbozavrik", 2.3, 99.5);
        String nameOfAnimal1 = animal1.getName();

        Assert.assertTrue(nameOfAnimal1.contains("Mr.Bulbozavrik"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal2() {
        Animal animal2 = new Animal("Govroshik", 3.4, 145.3);
        String nameOfAnimal2 = animal2.getName();

        Assert.assertTrue(nameOfAnimal2.contains("Govroshik"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal3() {
        Animal animal3 = new Animal("Nafanya", 15.9, 35.9);
        String nameOfAnimal3 = animal3.getName();

        Assert.assertTrue(nameOfAnimal3.contains("Nafanya"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal4() {
        Animal animal4 = new Animal("Medvogonok", 9.6, 345.1);
        String nameOfAnimal4 = animal4.getName();

        Assert.assertTrue(nameOfAnimal4.contains("Medvogonok"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal5() {
        Animal animal5 = new Animal("Egik", 1.7, 2.6);
        String nameOfAnimal5 = animal5.getName();

        Assert.assertTrue(nameOfAnimal5.contains("Egik"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal6() {
        Animal animal6 = new Animal("Enotik", 4.6, 17.4);
        String nameOfAnimal6 = animal6.getName();

        Assert.assertTrue(nameOfAnimal6.contains("Enotik"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal7() {
        Animal animal7 = new Animal("Zazu", 2.1, 1.3);
        String nameOfAnimal7 = animal7.getName();

        Assert.assertTrue(nameOfAnimal7.contains("Zazu"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal8() {
        Animal animal8 = new Animal("Zmey Gorynych", 46.3, 3124.3);
        String nameOfAnimal8 = animal8.getName();

        Assert.assertTrue(nameOfAnimal8.contains("Zmey Gorynych"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal9() {
        Animal animal9 = new Animal("Donald Dak", 33.1, 67.6);
        String nameOfAnimal9 = animal9.getName();

        Assert.assertTrue(nameOfAnimal9.contains("Donald Dak"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal10() {
        Animal animal10 = new Animal("Rusalochka", 19.1, 65.4);
        String nameOfAnimal10 = animal10.getName();

        Assert.assertTrue(nameOfAnimal10.contains("Rusalochka"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal11() {
        Animal animal11 = new Animal("Nemo", 4.3, 5.1);
        String nameOfAnimal11 = animal11.getName();

        Assert.assertTrue(nameOfAnimal11.contains("Nemo"));
    }

    @Test(groups = "group1")
    public void checkNameAnimal12() {
        Animal animal12 = new Animal("Zolotaya rybka", 999.99, 1.2);
        String nameOfAnimal12 = animal12.getName();

        Assert.assertTrue(nameOfAnimal12.contains("Zolotaya rybka"));
    }






}
