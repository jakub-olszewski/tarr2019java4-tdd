package pl.sdacademy.tarr2019java4.tdd;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 07.03.2020
 **/
public class Cafe {


    public Cafe() {
        hasCafe = false;
    }

    boolean hasCafe;
    public void serveCoffee() {
        hasCafe = true;
    }

    public boolean canServeCoffee() {
        return hasCafe;
    }
}
