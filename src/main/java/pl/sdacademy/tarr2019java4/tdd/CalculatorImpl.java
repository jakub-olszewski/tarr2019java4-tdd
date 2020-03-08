package pl.sdacademy.tarr2019java4.tdd;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 08.03.2020
 **/
public class CalculatorImpl implements Calculator {

    public CalculatorImpl() {
        clear();
    }

    private String display;

    @Override
    public void pressNumber(int number) {

    }

    @Override
    public String display() {
        return display;
    }

    @Override
    public void add(int numberA, int numberB) {

    }

    @Override
    public void sub(int numberA, int numberB) {

    }

    @Override
    public void div(int numberA, int numberB) {

    }

    @Override
    public void multi(int numberA, int numberB) {

    }

    @Override
    public void clear() {
        display = "";
    }
}
