import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ForestTester {
    Forest forest;
    Post p1, p2, p3, p4;
    Instructor prof;
    Student larry;
    String placeHolder;

    @Before
    public void setUp() throws Exception {
        prof = new Instructor("Sooh");
        larry = new Student("A1000", "Larry");
        forest = new Forest();
        p1 = new Question(prof, "Tomorrow's Midterm", "Do you like online midterm?",
                "midterm", "DSC30");
        p2 = new Question(larry, "BST in Midterm?", "Will we have BST related question" +
                " in the midterm?",
                "BST", "DSC30");
        p3 = new Note(prof, "heap vs BST?");
        placeHolder = "Sanlospios pioseaspios";
    }

    @Test
    public void Test() {
        forest.insert(p1.getKeyword(), p1);
        forest.insert(p2);

        forest.addConnection("midterm", "BST");

        String[] output = forest.queryConnection("midterm");
    }

    @Test
    public void testAddConnections() {
        String[] keywords = new String[]{"Tree", "heap", "BST", "midterm", "Exam", "final project", "linkedlist",
                "DLL", "SLL"};
        Question q;
        for (String keyword : keywords) {
            q = new Question(prof, placeHolder, placeHolder, keyword, placeHolder);
            forest.insert(q);
        }
        forest.addConnection("Tree", new String[] {"heap", "BST"});
        forest.addConnection("Exam", new String[] {"midterm", "final project"});
        forest.addConnection("midterm", new String[] {"BST", "linkedlist"});
        forest.addConnection("linkedlist", new String[] {"SLL", "DLL"});

        String[] output = forest.queryConnection("midterm");
        String[] expected = new String[] {"bst", "linkedlist"};

        assertArrayEquals(expected, output);
    }
}