package pl.sdacademy.tarr2019java4.tdd;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 08.03.2020
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJUnitParamsCSVTest {

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileAddTest.csv")
    public void testAdd(int numberA, int numberB, String expected) {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA,numberB);

        //then
        String message = String.format("Error %d + %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA+numberB);
        assertEquals(message, expected, calc.display());
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileMultiTest.csv")
    public void testMulti(int numberA, int numberB, String expected) {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.multi(numberA,numberB);

        //then
        String message = String.format("Error %d * %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA*numberB);
        assertEquals(message, expected, calc.display());
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileDivTest.csv")
    public void testDiv(int numberA, int numberB, String expected) {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.div(numberA,numberB);

        //then
        String message = String.format("Error %d / %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA/numberB);
        assertEquals(message,expected, calc.display());
    }
}