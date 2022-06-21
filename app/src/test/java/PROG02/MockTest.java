package PROG02;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

public class MockTest {
    Motor motor = new Motor();


    @Test
    void appHasAGreeting() throws IllegalArgumentException  {

        Auto automock = mock(Auto.class);
        when(automock.getPedalPosition()).thenReturn(5);
        motor.motorlauft(automock.getPedalPosition());
        assertEquals(true,motor.getstatus());
           verify(automock).getPedalPosition();
    }
    @Test
void testMock(){
// mock creation
        List mockedList = mock(List.class);

// using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");
        mockedList.clear();

// selective, explicit, highly readable verification
        verify(mockedList).add("one");
        verify(mockedList).clear();

    }

}
