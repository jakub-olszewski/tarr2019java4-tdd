package pl.sdacademy.tarr2019java4.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 08.03.2020
 **/
@RunWith(value = Parameterized.class)
public class CalculatorParametersConstructorAddTest {

    int numberA;
    int numberB;
    String expectedResult;

    public CalculatorParametersConstructorAddTest(int numberA, int numberB, String expectedResult) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expectedResult = expectedResult;
    }

    //statyczna metoda z danymi do testów
    @Parameterized.Parameters(name = "Test {index}:  {0} + {1} = {2}")
    public static Collection<Object> data(){
        return Arrays.asList(new Object[][]{{1,2,"3"},{2,3,"5"},{7,3,"10"}});
    }

    @Test
    public void shouldAddSuccessedExcecuteTest(){

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA,numberB);

        //then
        String resultDisplay = calc.display();
        assertEquals(expectedResult, resultDisplay);
    }
}
