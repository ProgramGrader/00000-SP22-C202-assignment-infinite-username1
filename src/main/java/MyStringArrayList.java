import java.util.Arrays;

/**
 * Date Written:
 * Purpose: Simulates an ArrayList for Strings. MyStringArrayList
 * is an abstract data type (ADT).
 *
 * @author Zac Clifton
 * @since 1/12/2021
 */
public class MyStringArrayList {

    private String[] array; //container of this array list
    private static final int CAPACITY = 10; // initial capacity of the array
    private int size; // number of elements in the array

    /**
     * This default constructor sets the container capacity to be 10 and size to
     * 0, where container is empty.
     */
    public MyStringArrayList() {
        array = new String[CAPACITY];
        size = 0;
    }

    /**
     * requires: e != null
     * ensures : e added to the end of this array list.
     * Add a new element at the end of this list
     *
     * @param e - element to be added
     */
    public void addLast(String e) {
        if (isFull()) { // increase capacity if array is full
            String[] temparray = new String[array.length + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                temparray[i] = array[i];
            }
            array = temparray; // make temparray the container
        }
        array[size] = e; //add element e to last empty location.
        size++; // increment the size of this array list
    }

    /* This method is only used by this class.
     * returns true if this array list is full, otherwise returns false.
     */
    private boolean isFull() {
        return size == array.length;
    }

    /**
     * returns the current size (# of elements) of this list
     * requires: none
     * ensures: self.size == #self.size
     *
     * @return current size of this array list
     */
    public int getSize() {
        return size;
    }

    /**
     * Adds a string to the front of an array
     *
     * @param s String that is being added to the front of the array.
     */
    public void addFront(String s) {
        if (isFull()) {
            String[] temparray = new String[array.length + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                temparray[i] = array[i];
            }
            array = temparray;
        }else {
            for (int i = array.length; i > 0; i--) {
                array[0] = array[i - 1];
            }
        }
        array[0] = s;
        size++;
    }

    /**
     * contains will look to see if an array contains a specified string (s).
     *
     * @param s The searched string
     * @return itemFound will return true or false depending on whether "s" is in the array.
     */
    public boolean contains(String s) {
        boolean itemFound = false;
        for(String currentItem : array){
            if(currentItem == s){
                itemFound = true;
            }
        }
        return itemFound;
    }


    /**
     * Gets an element that corresponds to an index number
     * @param i  index number
     * @return  returns the array index number
     */
    public String getElement(int i){
        //return array[i];
        return "nothing";
    }

    /**
     * Removes an element at a specified index number
     * @param i  specified index number
     * @return  Removed Element is taken before the element is removed from the list and returned.
     */
    public String removeElementAt(int i){
        String removedElement = "";
        for(int a = 0; a < array.length; a++) {
            if (i == a){
                removedElement = array[i];
                array[i] = array[i + 1];
            }
        }
        return removedElement;
    }

    /**
     * Creates a string (output) that will convert the array to a String
     * @return output conpiles all the array index's and displays
     * them as a string with the appropriate syntax (<> and commas).
     */
    public String toString(){
        String output = "<";
        boolean isNextOccupied = false;
        for (int i = 0; i < array.length && isNextOccupied == false; i++){
            output += array[i];
            if((i + 1) != array.length) {
                if (array[i + 1] == null) {
                    isNextOccupied = true;
                } else {
                    output += ", ";
                }
            }
        }
        output += ">";
        return output;
    }

}
