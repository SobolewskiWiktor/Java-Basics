
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class StudentTests {

    private StudentIndex student;

    @Before
    public void setUp() {
        student = new StudentIndex("Smith", 3);
    }

    @After
    public void tearDown() {
        student = null;
    }

    @Test
    public void testGetMarks() throws IOException {
        String input = "4\n3\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        student.getMarks();
        int[] expectedMarks = { 4, 3, 5 };
        assertTrue(Arrays.equals(expectedMarks, student.marks));
    }

    @Test
    public void testCheckGrades() {
        try {
            assertEquals("Dobry", StudentIndex.checkGrades(4));
        } catch (Exception e) {
            fail("Exception not expected");
        }
    }
    @Test
    public void testPrintMarks() {
        student.marks = new int[] { 3, 4, 5 };
        assertEquals("Student: Smith\nSubject nr: 0 : Dostateczny \nSubject nr: 1 : Dobry \nSubject nr: 2 : Bardzo Dobry \n",
                getOutput(student::printMarks));
    }

    @Test
    public void testGetHigherMark() {
        student.marks = new int[] { 3, 4, 5 };
        assertEquals("The highest mark is 5\n", getOutput(student::getHighermark));
    }

    @Test
    public void testGetSubjectWithNoMark() {
        student.marks = new int[] { 3, 4, 5 };
        assertEquals("all subjects have mark", getOutput(student::getSubjctWithNoMark));
    }

    @Test
    public void testAddGrades() {
        student.marks = new int[] { 3, 4, 5 };
        student.addGrades(4.5f, 3.2f);
        int[] expectedMarks = { 3, 4, 5, 4, 3 };
        assertTrue(Arrays.equals(expectedMarks, student.marks));
    }

    @Test
    public void testCalculateMean() {
        student.marks = new int[] { 3, 4, 5 };
        assertEquals(4.0f, student.calculateMean(), 0.01);
    }

    private String getOutput(Runnable action) {
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream("".getBytes()));
        try {
            return TestUtils.getSystemOut(action);
        } finally {
            System.setIn(originalIn);
        }
    }
}
