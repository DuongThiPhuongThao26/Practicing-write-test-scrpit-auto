package session01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;

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
    void csvSource_StringString(String param1, int param2, boolean param3){
        System.out.println("Param1 = " + param1 + ", Param2 = " + param2 + ", Param3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve?rogers", "captain?marvel", "bucky? true"}, delimiter = '?')
    void csvSource_StringWithDelimiter(String param1, String param2){
        System.out.println("Param1 = " + param1 + ", Param2 = " + param2 );
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Params/shoppinglist1.csv", numLinesToSkip = 1)
    void csvFileSource(String name, double price, int quantity, String unitOfMeasure, String provider){
        System.out.println("name = " + name + ", price = " + price + ", quantity = " + quantity + ", unit of measure = " + unitOfMeasure + ", provider = " + provider);
    }

    @ParameterizedTest
    @MethodSource(value = "sourceString")
    void methodSource_String(String param){
        System.out.println("Param = " + param);
    }

    static List<String> sourceString(){
        return Arrays.asList("tomato", "carrot", "cabbage");
    }

    @ParameterizedTest
    @MethodSource(value = "sourceStringDouble")
    void methodSource_StringDouble(String param1, double param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    static List<Arguments> sourceStringDouble(){
        return Arrays.asList(Arguments.of("carrot", 4.5), Arguments.of("tomato", 1.5));
    }


}
