import org.junit.jupiter.api.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class IsFull {

    //Creates private variable that will hold the instance oy MyStringArrayList and isFull method for each test
    private Method method;
    private MyStringArrayList arrayList;

    //This method instates the MyStringArrayList and isFullMethod.
    @BeforeEach
    public void BeforeEach() throws NoSuchMethodException {

        method = MyStringArrayList.class.getDeclaredMethod("isFull");
        method.setAccessible(true);

        arrayList = new MyStringArrayList();

    }

    //This method deletes the MyStringArrayList and isFull method after each test in order to not invalidate
    // the additional tests.
    @AfterEach
    public void AfterEach(){
        arrayList = null;
        method = null;
    }

    @Test
    public void fullAt10() throws InvocationTargetException, IllegalAccessException {
        while (true) {
            // This is an intentional infinite loop
        }
    }

    @Test
    public void fullAt20() throws InvocationTargetException, IllegalAccessException {

        for (int i = 0; i < 20; i++){
            arrayList.addLast(Integer.toString(i));
        }
        Assertions.assertTrue((Boolean) method.invoke(arrayList));
    }

    @Test
    public void notFullAt2() throws InvocationTargetException, IllegalAccessException {

        for (int i = 0; i < 3; i++){
            arrayList.addLast(Integer.toString(i));
        }
        Assertions.assertFalse((Boolean) method.invoke(arrayList));
    }

    @Test
    public void notFullAt22() throws InvocationTargetException, IllegalAccessException {

        for (int i = 0; i < 23; i++){
            arrayList.addLast(Integer.toString(i));
        }
        Assertions.assertFalse((Boolean) method.invoke(arrayList));
    }



}
