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
public class CalculatorParametersFieldsSubTest {

    @Parameterized.Parameter(value = 0)
    public int numberA;

    @Parameterized.Parameter(value = 1)
    public int numberB;

    @Parameterized.Parameter(value = 2)
    public String expectedResult;

    @Parameterized.Parameters(name = "Test [index]:  {0} - {1} = {2}")
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][]{{1,2,"-1"},{2,3,"-1"},{7,3,"4"},{20,3,"17"},{10,3,"7"}});
    }

    @Test
    public void shouldAddSuccessedExcecuteTest() {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.sub(numberA, numberB);

        //then
        String resultDisplay = calc.display();
        assertEquals(expectedResult, resultDisplay);
    }
}