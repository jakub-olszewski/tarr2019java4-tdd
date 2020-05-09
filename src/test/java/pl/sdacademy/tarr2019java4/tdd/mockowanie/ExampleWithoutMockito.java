package pl.sdacademy.tarr2019java4.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 09.05.2020
 **/
public class ExampleWithoutMockito {

    List<String> mockedList;

    @Before
    public void before(){
        mockedList = new ArrayList<>();// tworzymy prawdziwą listę
    }

    @Test
    public void whenUseMockAnnotationMockInject(){
        mockedList.add("one");// dodajemy tylko jedna wartosc
        assertEquals(1,mockedList.size());
    }
}
