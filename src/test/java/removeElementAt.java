import org.junit.Ignore;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class removeElementAt {
    //Creates private variable that will hold the instance oy MyStringArrayList for each test
    private MyStringArrayList arrayList;


    //This method instates the MyStringArrayList.
    @BeforeEach
    public void BeforeEach() {
        arrayList = new MyStringArrayList();
    }

    //This method deletes the MyStringArrayList after each test in order to not invalidate the additional tests.
    @AfterEach
    public void AfterEach(){
        arrayList = null;
    }

    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Add Last Apples, Grapes, Pears, Lemons, Oranges, Limes remove Apples")
    void  addLastApplesGrapesPearsLemonsOrangesLimesRemoveApples() {
        int currentSize = arrayList.getSize();
        String[] array = {"apples", "grapes", "pears", "lemons", "oranges", "limes"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals("apples", arrayList.removeElementAt(0));
    }


    @Disabled
    @Test
    @DisplayName("Add Last Apples, Grapes, Pears, Lemons, Oranges, Limes remove Lemons")
    void  addLastApplesGrapesPearsLemonsOrangesLimesRemoveLemons() {
        int currentSize = arrayList.getSize();
        String[] array = {"apples", "grapes", "pears", "lemons", "oranges", "limes"};
        for (String item : array) {
            arrayList.addLast(item);
        }
        assertEquals("lemons", arrayList.removeElementAt(3));
    }

    @Disabled
    @Test
    @DisplayName("Add Last Apples,Limes remove Limes")
    void  addLastApplesLimesRemoveLimes() {
        int currentSize = arrayList.getSize();
        String[] array = {"apples", "limes"};
        for (String item : array) {
            arrayList.addLast(item);
        }
        assertEquals("limes", arrayList.removeElementAt(1));
    }


    @Disabled
    @Test
    @DisplayName("Add a, i, u, e, o, remove u")
    void  addLastAIUEORemoveU() {
        int currentSize = arrayList.getSize();
        String[] array = {"a", "i", "u", "e", "o"};
        for (String item : array) {
            arrayList.addLast(item);
        }
        assertEquals("u", arrayList.removeElementAt(2));
    }
}
