package Second_lesson;

public class IncorrectVariableDeclaration {
    public static void main(String[] args) {
//        1.
    int i;
    i = 0;
//     2.
    char c;
        char ab = 0;
        c = (ab);
        System.out.println(c);

//        3.
    int a = (int) 3.2;

//     4.
    float f = 2.1f;

//     5.
    String s = "This is a string";

//     6.
    long bigLongValue = 964238764145245237L;
    int bigInt = (int) bigLongValue;

//     7.
    String isVariableAssignedInRightWay = "true";

    }
}
