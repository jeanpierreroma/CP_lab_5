package tests;


import cp.lab5.workSpace.WorkPlace;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class WorkPlaceTest {


    @Test
    public void getText(){
        try {
            String expectedValue = "";

            String textc = "";
            int wordSizec = 0;

            WorkPlace workplace = new WorkPlace(textc, wordSizec);
            String actualValue = workplace.getText();

            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void getWordSize(){
        try {
            int expectedValue = 0;

            String textc = "";
            int wordSizec = 0;

            WorkPlace workplace = new WorkPlace(textc, wordSizec);
            int actualValue = workplace.getWordSize();

            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void changeWordSize(){
        try {
            int expectedValue_1 = 0;
            int expectedValue_2 = 5;

            int newSize = 5;

            String textc = "";
            int wordSizec = 0;

            WorkPlace workplace = new WorkPlace(textc, wordSizec);
            int actualValue = workplace.getWordSize();
            assertEquals(expectedValue_1, actualValue);

            workplace.changeWordSize(newSize);
            actualValue = workplace.getWordSize();
            assertEquals(expectedValue_2, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void devideText(){
        try {
            List<String> expectedValue = Arrays.asList(
                    "Hi Celia, I am writing to you in order to thank you for your letter.",
                    "Sorry, that haven`t been writing to you so long.",
                    "How are you?",
                    "Was me very busy at university since you have a lot of homeworks?"
            );

            String textc = "Hi Celia, I am writing to you in order to thank you for your letter. Sorry, that haven`t been writing to you so long. How are you? Was me very busy at university since you have a lot of homeworks?";
            int wordSizec = 0;

            WorkPlace workplace = new WorkPlace(textc, wordSizec);
            List<String> actualValue=workplace.devideText();

            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void onlyQuestions(){
        try {
            List<String> expectedValue = Arrays.asList(
                    "How are you?",
                    "Was me very busy at university since you have a lot of homeworks?"
            );

            String textc = "Hi Celia, I am writing to you in order to thank you for your letter. Sorry, that haven`t been writing to you so long. How are you? Was me very busy at university since you have a lot of homeworks?";
            int wordSizec = 0;

            WorkPlace workplace = new WorkPlace(textc, wordSizec);
            List<String> actualValue = workplace.onlyQuestions();

            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void wordsOfGivenLenth(){
        try {
            Set<String> expectedValue = new HashSet<>();

            String textc = "Hi Celia, I am writing to you in order to thank you for your letter. Sorry, that haven`t been writing to you so long. How are you? Was me very busy at university since you have a lot of homeworks?";
            int wordSizec = 0;

            WorkPlace workplace = new WorkPlace(textc, wordSizec);
            Set<String> actualValue = workplace.wordsOfGivenLenth();

            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }

        try {
            Set<String> expectedValue = new HashSet<>(Arrays.asList("How", "are", "you", "Was", "lot"));

            String textc = "Hi Celia, I am writing to you in order to thank you for your letter. Sorry, that haven`t been writing to you so long. How are you? Was me very busy at university since you have a lot of homeworks?";
            int wordSizec = 3;

            WorkPlace workplace = new WorkPlace(textc, wordSizec);
            Set<String> actualValue = workplace.wordsOfGivenLenth();

            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            exception.printStackTrace();
            assertFalse(false);
        }
    }
}