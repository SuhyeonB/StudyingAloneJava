package Chapter02;

public class Type {
    public static void main(String[] args) {
        // Primitive type in JAVA
        // integer : byte, char, short, int, long
        // real : float, double
        // logical : boolean

        // sec02.exam01 Integer Literal
        int var = 0b1011;  // binary
        int var1 = 0206;    // octal
        int var2 = 365;     // decimal
        int var3 = 0xB3;    // hexa

        System.out.println("var: " + var);    // 11
        System.out.println("var1: " + var1);    // 134
        System.out.println("var2: " + var2);    // 365
        System.out.println("var3: " + var3);    // 179

        // sec02.exam02 Byte
        byte b1 = -128;   byte b2 = -30;    byte b3 = 0;    byte b4 = 30;      byte b5 = 127;
        //byte var9 = 128;    // type mismatch

        // sec02.exam03 Long
        long long1 = 10;
        long long2 = 20L;
        //long long3 = 10000000000;   // integer number too large
        long long3 = 10000000000L;

        // sec02.exam04 character literal : char / decimal / hexadecimal
        char c1 = 'A';  char c2 = 65; ; char c3 = '\u0041';
        if (c1 == c2 && c1 == c3) {
            System.out.println("All " + c1);
        }
        char c4 = '가';  char c5 = 44032; ; char c6 = '\uac00';
        if (c4 == c5 && c4 == c6) {
            System.out.println("All " + c4);
        }

        // sec02.exam05 String
        String name = "John", job = "programmer";
        System.out.println(name + " works as a " + job);

        // sec02.exam06 Escape
        System.out.println("tab : char A\t charB");
        System.out.println("Line Feed (LF) : charA \n charB");
        System.out.println("Carriage Return (CR) : charA \r charB");    // overwritten
        System.out.println("quotation (single & double) : \'String\' & \"String\"");
        // single quotation mark is unnecessarily escaped
        System.out.println("back slash : \\");
        System.out.println("hexadecimal unicode : \\u+HEX");

        // sec02.exam07 Float & Double
        // float f1 = 3.14; // error double type
        float f1 = 3.14f;   double d1 = 3.14;

        float f2 = 0.1234567890123456789f;
        double d2 = 0.1234567890123456789;
        // compare
        System.out.println("float:  " + f2);    // 0.123456789
        System.out.println("double: " + d2);    // 0.123456789012345678
        // using e (Euler number; about 2.718)
        double d3 = 3e6;    float f3 = 3e6F;    double d4 = 2e-3;
        System.out.println("d3: " + d3);
        System.out.println("f3: " + f3);
        System.out.println("d4: " + d4);

        // sec02.exam08 Boolean
        boolean stop = true;
        if (stop) {
            System.out.println("stop");
        } else {
            System.out.println("start");
        }
    }
}
