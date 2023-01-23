import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class getElement {
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
    @DisplayName("Add Last Apples, Grapes, Pears, Lemons, Oranges, Limes check for oranges")
    void  addLastApplesGrapesPearsLemonsOrangesLimesCheckForOranges() {
        String[] array = {"apples", "grapes", "pears", "lemons", "oranges", "limes"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals("oranges", arrayList.getElement(4));
    }

    @Test
    @DisplayName("Add Last Ka, Ki, Ku, Ke, Ko get Ku")
    void  addLastKaKiKuKeKoGetKu() {
        String[] array = {"ka", "ki", "ku", "ke", "ko"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals("ku", arrayList.getElement(2));
    }

    @Test
    @DisplayName("Add Last One get One")
    void  addLastOneGetOne() {
        String[] array = {"one"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals("one", arrayList.getElement(0));
    }

    @Test
    @DisplayName("Add Last Hey, Look, Over, Here get Here")
    void  addLastHeyLookOverHereGetHere() {
        String[] array = {"Hey", "Look", "Over", "Here"};
        for (String item: array) {
            arrayList.addLast(item);
        }
        assertEquals("Here", arrayList.getElement(3));
    }
}
