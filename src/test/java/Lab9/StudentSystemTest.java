package Lab9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {
    static StudentSystem system;
    @BeforeEach
    void initializeStudentSystem(){
        system = new StudentSystem("students.csv");
    }
    @Test
    public void testifStudentisPresent(){
        assertTrue(system.numberOfStudent() > 0);
    }

    @Test
    public void testStudentWithId100(){
        assertFalse(system.getStudentById(100).isPresent());
    }

    @Test
    public void testStudentNull(){
        assertTrue(system.getStudentById(70).isEmpty(), () -> "The student should be null");
    }

    @Test
    public void testHighestGPAStudent(){
        assertEquals(9.8f, system.getHighestGPAStudent().getGPA());
    }

    @Test
    public void testExceptionForEmptyStudentList(){
        assertThrows(EmptyStudentListException.class, () -> {
            new StudentSystem("empty.csv");
        });
    }

    @Test
    public void testNamesArray(){
        ArrayList<String> expectedNames  = new ArrayList<>(Arrays.asList("Camila Wood","Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"));
        ArrayList<String> actualNames  = new ArrayList<>(Arrays.asList(system.getStudentById(0).get().getName(),
                                                                        system.getStudentById(1).get().getName(),
                                                                        system.getStudentById(2).get().getName(),
                                                                        system.getStudentById(3).get().getName(),
                                                                        system.getStudentById(4).get().getName()));
        assertEquals(expectedNames, actualNames);
    }

    @Test
    public void testSize(){
        assertEquals(70, system.numberOfStudent());
    }

    @Test
    public void testLargestName(){
        assertNotEquals("Ava White", system.getLongestNameStudent().getName());
    }

    @Test
    public void testStudents(){
        assertNotEquals(system.getHighestGPAStudent(), system.getLongestNameStudent());
    }

    @Test
    public void testSameStudent(){
        assertEquals(system.getHighestGPAStudent(), system.getStudentById(12).get());
    }
}