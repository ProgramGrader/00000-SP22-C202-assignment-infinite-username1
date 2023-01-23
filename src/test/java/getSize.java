import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class getSize {
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
    @DisplayName("Get size of 0")
    void getSize0() {
        assertEquals(0, arrayList.getSize());
    }

    @Test
    @DisplayName("Add Last Apples, Grapes and Pears")
    void addLastApplesGrapesPears() {
        String[] array = {"apples", "grapes", "pears"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals( 3, arrayList.getSize());
    }

    @Test
    @DisplayName("Add Last red and purple")
    void  addLastRedandPurple() {
        String[] array = {"red", "purple"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals( 2, arrayList.getSize());
    }

    @Test
    @DisplayName("Add Last Apples, Grapes, Pears, Lemons, Oranges, Limes")
    void  addLastApplesGrapesPearsLemonsOrangesLimes() {
        String[] array = {"apples", "grapes", "pears", "lemons", "oranges", "limes"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals(6, arrayList.getSize());
    }

}
