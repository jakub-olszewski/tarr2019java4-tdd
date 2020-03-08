package pl.sdacademy.tarr2019java4.tdd;


import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test kawiarni podstawowy test z wykorzystaniem prostych asercji
 *
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 07.03.2020
 **/
public class CafeTest {

    Cafe cafe;

    @Before
    public void before(){
        // given
        cafe = new Cafe();
    }

    @Test
    public void shouldServeCoffee() {

        // when
        cafe.serveCoffee();

        // then
        assertTrue(cafe.canServeCoffee());//
    }

    @Test
    public void shouldNotServeCoffee() {

        // when
        //cafe.serveCoffee();

        // then
        assertFalse(cafe.canServeCoffee());
    }

}