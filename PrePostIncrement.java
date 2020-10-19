package Second_lesson;

public class PrePostIncrement {
    public static void main(String[] args) {

        int i = 10;
        i++;
        System.out.println(i);    // "11"
        ++i;
        System.out.println(i);    // "12"
        System.out.println(++i);  // "13"  // The main point is that ++i increments the value and immediately returns it.

        System.out.println(i++);  // "13" //i++ also increments the value (in the background) but returns unchanged value of the variable - what looks like it is executed later.
        System.out.println(i);    // "14"
    }
}
