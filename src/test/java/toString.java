import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class toString {
    //Creates private variable that will hold the instance oy MyStringArrayList for each test
    private MyStringArrayList arrayList;

    //This method instates the MyStringArrayList.
    @BeforeEach
    public void BeforeEach() {
        arrayList = new MyStringArrayList();
    }

    //This method deletes the MyStringArrayList after each test in order to not invalidate the additional tests.
    @AfterEach
    public void AfterEach() {
        arrayList = null;
    }

    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Output Green")
    void outputGreen() {
        arrayList.addLast("green");
        assertEquals("<green>", arrayList.toString());
    }

    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("Output green, red and purple")
    void outputGreenRedAndPurple() {
        String[] array = {"green", "red", "purple"};
        for (String item : array) {
            arrayList.addLast(item);
        }
        assertEquals("<green, red, purple>", arrayList.toString());
    }

    @Test
    @DisplayName("Output Red and Blue")
    void outputRedAndBlue() {
        String[] array = {"red", "blue"};
        for (String item : array) {
            arrayList.addLast(item);
        }
        assertEquals("<red, blue>", arrayList.toString());
    }

    @Test
    @DisplayName("Output Ka, Ki, Ku, Ke, Ko")
    void outputKaKiKuKeKo() {
        String[] array = {"ka", "ki", "ku", "ke", "ko"};
        for (String item : array) {
            arrayList.addLast(item);
        }
        assertEquals("<ka, ki, ku, ke, ko>", arrayList.toString());
    }


}
