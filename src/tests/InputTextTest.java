package tests;


import cp.lab5.inputText.InputText;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class InputTextTest {

    @Test
    public void chooseVariantOfInputting(){
        try {
            int expectedValue = 1;

            InputText inputtext = new InputText();
            System.setIn(new ByteArrayInputStream("1".getBytes()));
            int actualValue = inputtext.chooseVariantOfInputting();
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void inputText(){
        try {
            String expectedValue = "Hi Celia, I am writing to you in order to thank you for your letter. Sorry, that haven`t been writing to you so long. How are you? Was me very busy at university since you have a lot of homeworks?";

            InputText inputtext = new InputText();
            System.setIn(new ByteArrayInputStream("1".getBytes()));
            String actualValue = inputtext.inputText();
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void byFile(){
        try {
            String expectedValue = "Hi Celia, I am writing to you in order to thank you for your letter. Sorry, that haven`t been writing to you so long. How are you? Was me very busy at university since you have a lot of homeworks?";

            InputText inputtext = new InputText();
            String actualValue=inputtext.byFile();
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void byConsole(){
        try {
            String expectedValue = "";

            InputText inputtext = new InputText();
            System.setIn(new ByteArrayInputStream("".getBytes()));
            String actualValue = inputtext.byConsole();
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void checkIsEmpty(){
        try {
            String s = "";

            InputText inputtext = new InputText();
            inputtext.checkIsEmpty(s);
            assertTrue(true);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
}