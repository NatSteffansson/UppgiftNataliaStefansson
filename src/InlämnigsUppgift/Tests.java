package InlämnigsUppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testIsStopLoop () {
        //Assign
        TextProcessor testProcessor = new TextProcessor();
        boolean expected = true;
        //Act
        testProcessor.processInput("stop");
        boolean actual = testProcessor.isStopLoop();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testLongestWord() {
        //Assign
        TextProcessor testProcessor = new TextProcessor();
        String expected = "krokodil";
        //Act
        testProcessor.processInput("hej" + " " + "krokodil");
        String actual = testProcessor.getLongestWord();
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testNumberLines() {
        //Assign
        TextProcessor testProcessor = new TextProcessor();
        int expected = 2;
        //Act
        testProcessor.processInput("hej");
        testProcessor.processInput("på dig");
        testProcessor.processInput("stop");
        int actual = testProcessor.getNumberLines();
        //Assert
        assertEquals(expected, actual);
    }
}


