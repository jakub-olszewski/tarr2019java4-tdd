package pl.sdacademy.tarr2019java4.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 09.05.2020
 **/
public class MockitoAnnotationMockTest {

    /**
     * Mockowanie listy - tworzenie atrapy @Mock
     * nie zainicjalizowana przyszla atrapa
     */
    @Mock
    List<String> mockedList;

    @Before
    public void before(){
        //inicjowanie mockowania
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseMockAnnotationMockInject(){
        mockedList.add("one");// dodajemy tylko jedna wartosc
        assertEquals(0,mockedList.size());// mamy zero
        // atrapa nie ma zachowania na pobieranie rozmiaru
    }

    @Test
    public void whenUseMockAnnotationMockInject2(){
        mockedList.add("one");// dodajemy tylko jedna wartosc

        // weryfikujemy czy do mock listy zostala dodana wartosc "one"
        verify(mockedList).add("one");
        //verify(mockedList).add("two");

        Mockito.when(mockedList.size()).thenReturn(1);
        assertEquals(1,mockedList.size());
    }

    @Test
    public void whenUseMockAnnotationMockInject3(){
        //mockedList.add("one");// dodajemy tylko jedna wartosc

        Mockito.when(mockedList.size()).thenReturn(2020);
        assertEquals(mockedList.size(),2020);
    }
}
