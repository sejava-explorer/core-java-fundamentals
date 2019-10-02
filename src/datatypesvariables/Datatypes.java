// Data types is used to define what type of data a particular variable can hold in import junit.framework.TestCase;


// In Java, the data types are broadly classified as Primitive & Non-Primitive
// Primitive - Numeric & Non-Numeric
// Numeric - Integer & Floating Point Number
// Integer - byte, short, int , long
// Floating Point Number - float & double
// Non- Numeric - char & boolean

// Non-Primitive - Array, String, all the objects in Java (Object reference datatype)



/**
 * @author explorechoice.org
 *
 */

package datatypevariables;

public class Datatypes {

byte b = 127;   // hold values -2 ^ 7 to 2 ^ 7 -1 == -128 to 127
short s = 230;  // -2^15 to -2^15 -1
int i = 688; // -2^31 to -2^31 -1
long l = 38397; // -2^63 to -2^63 -1

// Floating Point Number
float f = 127.89F;   // hold values -2 ^ 31 to 2 ^ 31 -1 with decimal precision
double d = 230.78;  // -2^63 to -2^63 -1  with decimal precision

// Non-Numeric Datatypes
char c = 'A';   //Char should always be in single quotes
boolean bool = true;
static char maxChar = '\uffff';
static char alphaC = '\u0108';

// This function will help to get the max and min value a particular datatype can store
public static void checkByteMinMaxValue(){
        byte i = Byte.MAX_VALUE;
        System.out.println(i);
        System.out.println(Byte.MIN_VALUE);
}

public static void checkShortMinMaxValue(){
        short i = Short.MAX_VALUE;
        System.out.println(i);
        System.out.println(Short.MIN_VALUE);
}

public static void checkIntMinMaxValue(){
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        System.out.println(Integer.MIN_VALUE);
}

public static void checkLongMinMaxValue(){
        long i = Long.MAX_VALUE;
        System.out.println(i);
        System.out.println(Long.MIN_VALUE);
}

public static void checkFloatMinMaxValue(){
        float i = Float.MAX_VALUE;
        System.out.println(i);
        System.out.println(Float.MIN_VALUE);
}

public static void checkDoubleMinMaxValue(){
        double i = Double.MAX_VALUE;
        System.out.println(i);
        System.out.println(Double.MIN_VALUE);
}


public static void main(String args[]) {

        System.out.println("Byte can hold value upto 2 raised to power 8"); // -128 to 127
        System.out.println("short can hold value upto 2 raised to power 16");
        System.out.println("int can hold value upto 2 raised to power 32");
        System.out.println("long can hold value upto 2 raised to power 64");

        System.out.println("float can hold value upto 2 raised to power 32 with decimal precision");
        System.out.println("long can hold value upto 2 raised to power 64 with decimal precision");

        System.out.println("char represents a single alpha & special character except numeric from keyboard");
        System.out.println("boolean only holds two values true & false both must be in lower case");

        System.out.println(maxChar);
        System.out.println(alphaC);

        checkByteMinMaxValue();
        checkShortMinMaxValue();
        checkIntMinMaxValue();
        checkLongMinMaxValue();
        checkFloatMinMaxValue();
        checkDoubleMinMaxValue();

}
}
