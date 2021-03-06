package Second_lesson;

public class BoundariesOfPrimitiveDataTypes {
    public static void main(String[] args) {

        //Primitive data types includes byte , short , int , long , float , double , boolean and char.

        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Boolean.class.getSimpleName(), "" + Boolean.FALSE, "" + Boolean.TRUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Character.class.getSimpleName(), "" + Character.MIN_VALUE, "" + Character.MAX_VALUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Byte.class.getSimpleName(), "" + Byte.MIN_VALUE, "" + Byte.MAX_VALUE);

        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Long.class.getSimpleName(), "" + Long.MIN_VALUE, "" + Long.MAX_VALUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Short.class.getSimpleName(), "" + Short.MIN_VALUE, "" + Short.MAX_VALUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Integer.class.getSimpleName(), "" + Integer.MIN_VALUE, "" + Integer.MAX_VALUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Float.class.getSimpleName(), "" + Float.MIN_VALUE, "" + Float.MAX_VALUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
                Double.class.getSimpleName(), "" + Double.MIN_VALUE, "" + Double.MAX_VALUE);





    }
}
