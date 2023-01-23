import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class addLast {
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
    @DisplayName("Add Last Green")
    void addLastGreen() {
        int pastSize = arrayList.getSize();
        String newValue = "green";
        arrayList.addLast(newValue);
        assertAll("Add green to end",
            () -> assertEquals(pastSize + 1, arrayList.getSize()),
            ()-> {
                assertNotNull(arrayList.getElement(arrayList.getSize() - 1));
                assertEquals(newValue, arrayList.getElement(arrayList.getSize() - 1));
            }
        );

    }

    @Test
    @DisplayName("Add Last Apples, Grapes and Pears")
    void  addLastApplesGrapesPears() {
        int pastSize = arrayList.getSize();
        String[] array = {"apples", "grapes", "pears"};
        String testValue = "pears";
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertAll("Add items to end",
                () -> assertEquals(pastSize + 3, arrayList.getSize()),
                ()-> {
                    assertNotNull(arrayList.getElement(arrayList.getSize() - 1));
                    assertEquals(testValue, arrayList.getElement(arrayList.getSize() - 1));
                }
        );
    }

    @Test
    @DisplayName("Add Last red and purple")
    void  addLastRedandPurple() {
        int pastSize = arrayList.getSize();
        String[] array = {"red", "purple"};
        String testValue = "purple";
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertAll("Add items to end",
                () -> assertEquals(pastSize + 2, arrayList.getSize()),
                ()-> {
                    assertNotNull(arrayList.getElement(arrayList.getSize() - 1));
                    assertEquals(testValue, arrayList.getElement(arrayList.getSize() - 1));
                }
        );
    }

    @Test
    @DisplayName("Add Last Apples, Grapes, Pears, Lemons, Oranges, Limes")
    void  addLastApplesGrapesPearsLemonsOrangesLimes() {
        int pastSize = arrayList.getSize();
        String[] array =  {"apples", "grapes", "pears", "lemons", "oranges", "limes"};
        String testValue = "limes";
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertAll("Add items to end",
                () -> assertEquals(pastSize + 6, arrayList.getSize()),
                ()-> {
                    assertNotNull(arrayList.getElement(arrayList.getSize() - 1));
                    assertEquals(testValue, arrayList.getElement(arrayList.getSize() - 1));
                }
        );
    }
}
