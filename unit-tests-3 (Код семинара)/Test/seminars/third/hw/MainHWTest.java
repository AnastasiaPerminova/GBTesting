package seminars.third.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    MainHW hw = new MainHW();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    public void isEven(int number){
        assertTrue(hw.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 11,63,81,103})
    public void isOdd(int number){
        assertFalse(hw.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {26,47,69,89,99})
    public void isBetween25And100(int number){
        assertTrue(hw.isBetween25And100(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {24,25, 4,16,100,109,199})
    public void isNotBetween25And100(int number){
        assertFalse(hw.isBetween25And100(number));
    }

}
