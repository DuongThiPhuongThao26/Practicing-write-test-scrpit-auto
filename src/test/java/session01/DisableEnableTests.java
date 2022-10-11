package session01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DisableEnableTests {

    @Test
    @Disabled(value = "Disabled for demo @Disabled")
    void firstTest(){
        System.out.println("this is the first test");
    }

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disable for demo @DisabledOnOs")
    void secondTest(){
        System.out.println("this is the second test");
    }

    @Test
    @DisabledIf(value = "provider")
    void fourthTest(){
        System.out.println("this is the fourth test method");
    }

    boolean provider(){
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.TUESDAY);
    }

    @Test
    @DisabledIfSystemProperty(named = "env", matches = "test")
    void thirdTest(){
        System.out.println("This is the third test");
    }
}
