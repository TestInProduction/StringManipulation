import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulatorTest {
    StringManipulator SM = new StringManipulator();
    String TEST_VALUE = "SuperCaliFragiListic";
    String TEST_VALUE_2 = "this is a sentence";
    String TEST_VALUE_3 = "Does it break with punctuation? Hopefully not!";

    @Test
    public void makeSnakeWithSingleWord(){
        String makeSnakeTest = SM.makeSnake(TEST_VALUE);
        assertEquals("SuPeRcAlIfRaGiLiStIc", makeSnakeTest);
    }

    @Test
    public void makeSnakeWithSentence(){
        String makeSnakeTest = SM.makeSnake(TEST_VALUE_2);
        assertEquals("ThIs Is A sEnTeNcE", makeSnakeTest);
    }

    @Test
    public void makeSnakeWithSentenceAndPunctuation(){
        String makeSnakeTest = SM.makeSnake(TEST_VALUE_3);
        assertEquals("DoEs It BrEaK wItH pUnCtUaTiOn? HoPeFuLlY nOt!", makeSnakeTest);
    }

    @Test
    public void swapCaseWithSingleWord(){
        String swapCaseTest = SM.swapCase(TEST_VALUE);
        assertEquals("sUPERcALIfRAGIlISTIC", swapCaseTest);
    }

    @Test
    public void swapCaseWithSentence(){
        String swapCaseTest = SM.swapCase(TEST_VALUE_2);
        assertEquals("THIS IS A SENTENCE", swapCaseTest);
    }

    @Test
    public void swapCaseWithSentenceAndPunctuation(){
        String swapCaseTest = SM.swapCase(TEST_VALUE_3);
        assertEquals("dOES IT BREAK WITH PUNCTUATION? hOPEFULLY NOT!", swapCaseTest);
    }
}