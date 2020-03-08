package pl.sdacademy.tarr2019java4.tdd;

/**
 * Calculator - interfejs do obsługi kalkulatora
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 08.03.2020
 **/
public interface Calculator {

    /**
     * Metoda odpowiedzialna za wcisniecie przycisku z cyfrą
     * @param number
     */
    void pressNumber(int number);

    /**
     * Metoda odpowiedzialna za pobranie zawartości wyświetlacza
     * @return
     */
    String display();

    /**
     * Metoda dodaje numberA do numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     */
    public void add(int numberA, int numberB);

    /**
     * Metoda odejmuje numberA od numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     */
    public void sub(int numberA, int numberB);

    /**
     * Metoda dzieli numberA przez numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     */
    public void div(int numberA, int numberB);

    /**
     * Metoda mnoży numberA przez numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     */
    public void multi(int numberA, int numberB);

    /**
     * Metoda czyści zawartość wyświetlacza
     */
    void clear();
}
