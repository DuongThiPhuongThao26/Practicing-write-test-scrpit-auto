package session01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {
    @ParameterizedTest(name = "Run: {index} - Value: {arguments}")
    @ValueSource(ints = {1, 5, 6})
    void intValues(int theParam){
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest(name = "Run: {index} - Value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"firstString", "secondString"})
    void stringValue(String theParam){
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve, rogers", "captain, marvel"})
    void csvSource_StringString(String param1, String param2){
        System.out.println("Param1 = " + param1 + ", Param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve, 32, rogers", "captain, 21, marvel", "bucky, 5, true"})
    void csvSource_StringString(String param1, String param2, String param3){
        System.out.println("Param1 = " + param1 + ", Param2 = " + param2 + ", Param3 = " + param3);
    }
}
