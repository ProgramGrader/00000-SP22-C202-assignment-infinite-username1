import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class addFront {
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
    @DisplayName("Add Front red and purple")
    void  addFrontRedandPurple() {
        int pastSize = arrayList.getSize();
        String[] array = {"red", "purple"};
        String testValue = "purple";
        for (String item: array) {
            arrayList.addFront(item);
        }
        assertAll("Add items to beginning",
                () -> assertEquals(pastSize + 2, arrayList.getSize()),
                ()-> {
                    assertNotNull(arrayList.getElement(0));
                    assertEquals(testValue, arrayList.getElement(0));
                }
        );
    }

    @Test
    @DisplayName("Add Front One")
    void  addFrontOne() {
        int pastSize = arrayList.getSize();
        String[] array = {"One"};
        String testValue = "One";
        for (String item: array) {
            arrayList.addFront(item);
        }
        assertAll("Add items to beginning",
                () -> assertEquals(pastSize + 1, arrayList.getSize()),
                ()-> {
                    assertNotNull(arrayList.getElement(0));
                    assertEquals(testValue, arrayList.getElement(0));
                }
        );
    }

    @Test
    @DisplayName("Add Front A I E U O")
    void  addFrontAIEUO() {
        int pastSize = arrayList.getSize();
        String[] array = {"a", "i", "e", "u", "o"};
        String testValue = "o";
        for (String item: array) {
            arrayList.addFront(item);
        }
        assertAll("Add items to beginning",
                () -> assertEquals(pastSize + 5, arrayList.getSize()),
                ()-> {
                    assertNotNull(arrayList.getElement(0));
                    assertEquals(testValue, arrayList.getElement(0));
                }
        );
    }

    @Test
    @DisplayName("Add Front Incubus REO Weezer")
    void  addFrontIncubusREOWeezer() {
        int pastSize = arrayList.getSize();
        String[] array = {"Incubus", "REO", "Weezer"};
        String testValue = "Weezer";
        for (String item: array) {
            arrayList.addFront(item);
        }
        assertAll("Add items to beginning",
                () -> assertEquals(pastSize + 3, arrayList.getSize()),
                ()-> {
                    assertNotNull(arrayList.getElement(0));
                    assertEquals(testValue, arrayList.getElement(0));
                }
        );
    }
}
