package InlämnigsUppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testIsStopLoop () {
        //Assign
        TextProcessor testProcessor = new TextProcessor();
        boolean actual = true;
        //Act
        testProcessor.processInput("stop");
        boolean expected = true;
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testLongestWord() {
        //Assign
        TextProcessor testProcessor = new TextProcessor();
        String actual = "krokodil";
        //Act
        testProcessor.processInput("hej" + " " + "krokodil");
        String expected = testProcessor.getLongestWord();
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testNumberLines() {
        //Assign
        TextProcessor testProcessor = new TextProcessor();
        int expected = 3;
        //Act
        testProcessor.processInput("hej");
        testProcessor.processInput("på");
        testProcessor.processInput("dig");
        int actual = testProcessor.getNumberLines();
        //Assert
        assertEquals(expected, actual);
    }
}


