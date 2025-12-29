import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
    @Test
    public void testZero(){
        String input = "0 " + System.getProperty("line.separator");
        input += "0 " + System.getProperty("line.separator");
        input += "0 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
    @Test
    public void testNeg(){
        String input = "-3 " + System.getProperty("line.separator");
        input += "-6 " + System.getProperty("line.separator");
        input += "-4 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
    @Test
    public void testEqual(){
        String input = "1 " + System.getProperty("line.separator");
        input += "2 " + System.getProperty("line.separator");
        input += "3 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
    @Test
    public void testSame(){
        String input = "1 " + System.getProperty("line.separator");
        input += "1 " + System.getProperty("line.separator");
        input += "1 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
    @Test
    public void testGreater(){
        String input = "4 " + System.getProperty("line.separator");
        input += "7 " + System.getProperty("line.separator");
        input += "1 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
    @Test
    public void testBGreater(){
        String input = "4 " + System.getProperty("line.separator");
        input += "1 " + System.getProperty("line.separator");
        input += "7 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
    @Test
    public void testCGreater(){
        String input = "7 " + System.getProperty("line.separator");
        input += "1 " + System.getProperty("line.separator");
        input += "4 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
    @Test
    public void testPass(){
        String input = "3 " + System.getProperty("line.separator");
        input += "4 " + System.getProperty("line.separator");
        input += "5 " + System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);
//expected output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());

    }
        //check various inputs confirming 3 inputs that satisfy (a + b > c) && (a + c > b) && (b + c > a) is a triangle
        //or if they don't satisfy those is not a triangle
}
