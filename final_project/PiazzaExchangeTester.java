import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PiazzaExchangeTester {

    Forest forest;
    Post p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    Instructor prof;
    Student larry;
    Tutor scott;
    String placeHolder;
    PiazzaExchange pe;

    @Before
    public void setUp() {
        placeHolder = ":-)";

        prof = new Instructor("Sooh");

        larry = new Student("A16166", "Larry");
        scott = new Tutor("A16145", "Scott");

        pe = new PiazzaExchange(prof, "DSC30", true);

        p1 = new Question(scott, placeHolder, placeHolder, "linkedlist", "DSC30", "P1");
        p2 = new Question(scott, placeHolder, placeHolder, "SLL", "DSC30", "p2");
        p3 = new Question(scott, placeHolder, placeHolder, "DLL", "DSC30", "p3");
        p4 = new Question(scott, placeHolder, placeHolder, "midterm", "DSC30", "p4");
        p5 = new Question(scott, placeHolder, placeHolder, "BST", "DSC30", "p5");
        p6 = new Question(scott, placeHolder, placeHolder, "tree", "DSC30", "p6");
        p7 = new Question(scott, placeHolder, placeHolder, "heap", "DSC30", "p7");
        p8 = new Question(scott, placeHolder, placeHolder, "queue", "DSC30", "p8");
        p9 = new Question(scott, placeHolder, placeHolder, "PQueue", "DSC30", "p9");
        p10 = new Question(scott, placeHolder, placeHolder, "hash table", "DSC30", "p10");

        // activate the pe!
        pe.activatePiazza(prof);

        scott.enrollClass(pe);
        larry.enrollClass(pe);

        forest = pe.getKeywordForest();
    }

    @Test
    public void testPopulateForestAndQueryConnection() {
        // probably going to provide this tester method
        String parent;
        String[] children;

        parent = "hash table";
        children = new String[]{"collision", "element", "hash function", "bloom filters"};

        assertArrayEquals(children, forest.queryConnection(parent));

        parent = "hash function";
        children = new String[]{"double hashing", "rehash", "chaining"};

        assertArrayEquals(children, forest.queryConnection(parent));

        parent = "linked list";
        children = new String[]{"sll", "dll"};

        assertArrayEquals(children, forest.queryConnection(parent));
    }

    @Test
    public void testKSimilarPost() throws OperationDeniedException {
        Post[] allPost = new Post[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        for (int i = 0; i < allPost.length; i++) {
            for (int j = 0; j <= i; j++) {
                // append the post into the pe, with ascending times
                Post p = allPost[i];
                scott.addPost(pe, p);
            }
        }
        System.out.println(Arrays.toString(pe.computeKSimilarPosts("midterm", 20)));
    }

}