package Second_lesson;

public class ScopeOfLocalVariables {
    public static void main(String[] args) {

        int intValue = 97;
                                 // declare more variables of any types here
        double d = 10;
        long l = 200;
        {
                                // declare another variable of any type here
            double d1 = 10;
            long l2 = 200;


            // try to output all the earlier declared variables
            System.out.println("Let's try to use 'intValue' variable.");
            System.out.println("We can do it: " + intValue);
            System.out.println("Because we are in the inner block. That's why 'intValue' is accessible");

            System.out.println("We can do it: d = " + d);
            System.out.println("We can do it: d1 = " + d1);
            System.out.println("We can do it: l = " + l);
            System.out.println("We can do it: l2=  " + l2);
            //...

            {
                // and declare two or more variable here as well
                double d2 = 10;
                long l3 = 200;
                char charValue = 'B';
                //...

                // try to output all the earlier declared variables
                System.out.println("intValue: " + intValue);
                System.out.println("charValue: " + charValue);

                System.out.println("We can do it: d = " + d);
                System.out.println("We can do it: d1 = " + d1);
                System.out.println("We can do it: d2 = " + d2);
                System.out.println("We can do it: l =" + l);
                System.out.println("We can do it: l2 = " + l2);
                System.out.println("We can do it: l3 = " + l3);



                //...
            }
            // try to output all the earlier declared variables
            System.out.println("intValue: " + intValue);
            System.out.println("We can do it: d = " + d);
            System.out.println("We can do it: d1 = " + d1);
            System.out.println("We can do it: l = " + l);
            System.out.println("We can do it: l2 = " + l2);
            System.out.println("Because we are in the inner block. That's why 'd,d1,l,l2' are accessible");
            System.out.println("Because we are in the out block. That's why 'd2,l3' are inaccessible");





        }
    }
}
