package pl.sdacademy.tarr2019java4.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 10.05.2020
 **/
public class MockitoAnnotationCaptorTest {

    @Mock
    List mockedListObject;

    @Captor
    ArgumentCaptor argumentCaptor;

    @Before
    public void before(){
        // inicjalizacja atrap wykorzystanych w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseCaptorAnntationInjectTest(){
        mockedListObject.add("one");

        // konfiguracja przechwytywacz
        verify(mockedListObject).add(argumentCaptor.capture());

        // getValue() zwróć co przechwyciłeś
        assertEquals(argumentCaptor.getValue(),"one");
    }

    @Test
    public void whenUseCaptorAnnotationInMethodTest(){
        // inicjalizacja mock listy
        List mockListHere = mock(List.class);

        // konfiguracja przechwytywacz
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        mockListHere.add("two");

        // przechwycamy element
        verify(mockListHere).add(argumentCaptor.capture());

        // pobieramy i sprawdzamy wartość
        assertEquals("two",argumentCaptor.getValue());
    }

    /**
     * Zadanie!
     */
    @Test
    public void whenUseCaptorAnnotationCalcTest(){
        // inicjalizacja mock Calculatora

        // konfiguracja przechwytywacz

        // wywołanie pressNumber()

        // przechwycamy element

        // pobieramy i sprawdzamy wartość

    }

}
