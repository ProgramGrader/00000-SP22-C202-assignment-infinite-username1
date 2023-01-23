import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class contains {
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
    @DisplayName("Add Last Apples, Grapes, Pears, Lemons, Oranges, Limes check for Peaches")
    void  addLastApplesGrapesPearsLemonsOrangesLimesCheckForPeaches() {
        String[] array = {"apples", "grapes", "pears", "lemons", "oranges", "limes"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals(false, arrayList.contains("peaches"));
    }

    @Test
    @DisplayName("Add Last Apples, Grapes, Pears, Lemons, Oranges, Limes check for Lemons")
    void  addLastApplesGrapesPearsLemonsOrangesLimesCheckForLemons() {
        String[] array = {"apples", "grapes", "pears", "lemons", "oranges", "limes"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals(true, arrayList.contains("lemons"));
    }

    @Test
    @DisplayName("Add Last, a, i, u, e, o check for abc")
    void  addLastAIUEOCheckForABC() {
        String[] array = {"a", "i", "u", "e", "o"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals(false, arrayList.contains("abc"));
    }

    @Test
    @DisplayName("Add Last, a b check for b")
    void  addLastABCheckForB() {
        String[] array = {"a", "b"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals(true, arrayList.contains("b"));
    }
}
