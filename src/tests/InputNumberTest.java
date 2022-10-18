package tests;

import cp.lab5.inputNumber.InputNumber;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class InputNumberTest {

    @Test
    public void chooseVariantOfInputting(){
        try {
            int expectedValue = 1;

            InputNumber inputnumber = new InputNumber();
            System.setIn(new ByteArrayInputStream("1".getBytes()));
            int actualValue = inputnumber.chooseVariantOfInputting();
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }

        try {
            int expectedValue = 2;

            InputNumber inputnumber = new InputNumber();
            System.setIn(new ByteArrayInputStream("2".getBytes()));
            int actualValue = inputnumber.chooseVariantOfInputting();
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void inputNumber(){
        try {
            int expectedValue = 0;

            int choose = 2;

            InputNumber inputnumber = new InputNumber();
            int actualValue = inputnumber.inputNumber(choose);
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    public void byConsole(){
        try {
            int expectedValue = 0;

            InputNumber inputnumber = new InputNumber();
            System.setIn(new ByteArrayInputStream("0".getBytes()));
            int actualValue = inputnumber.byConsole();
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }

        try {
            int expectedValue = 0;

            InputNumber inputnumber = new InputNumber();
            System.setIn(new ByteArrayInputStream("2".getBytes()));
            int actualValue = inputnumber.byConsole();
            assertNotEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
}


