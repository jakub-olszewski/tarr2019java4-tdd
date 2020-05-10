package pl.sdacademy.tarr2019java4.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 10.05.2020
 **/
public class MockitoAnnotationSpyTest {

    @Spy
    public List<String> spyList = new ArrayList<String>();

    @Before
    public void before(){
        //inicjowanie mockowania
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseSpyAnnotatationInjectTest(){
        spyList.add("one");
        spyList.add("two");

        assertEquals(2, spyList.size());

        when(spyList.size()).thenReturn(2020);
        assertEquals(2020, spyList.size());
    }
    
    @Test
    public void whenUseSpyAnnotatationInjectMethodTest(){
        // częsciowa atrapa spy widoczna tylko w tej metodzie
        List<String> spyListOnlyHere = spy(new ArrayList<String>());
    }
}