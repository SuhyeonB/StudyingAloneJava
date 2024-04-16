package Chapter02;

public class TypeConversion {
    public static void main(String[] args) {

        // promotion : 자동 타입 변환. 큰 허용 범위 타입 = 작은 허용 범위 타입 (실행 도중 자동 변환)
        // casting : 강제 타입 변환. 작은 허용 범위 타입 = (작은 ) 큰 허용 범위 타입
        // byte < short < int < long < float < double

        // sec03.exam01 Promotion
        byte byteV = 10;
        int intV = byteV;
        System.out.println("int Value : " + intV);

        char charV = '가';
        intV = charV;
        System.out.println("가의 유니코드 : " + intV);

        intV = 50;
        long longV = intV;
        System.out.println("long Value : " + longV);

        longV = 100;
        float floatV = longV;
        System.out.println("float Value : " + floatV);

        floatV = 100.5F;
        double doubleV = floatV;
        System.out.println("double Value : " + doubleV);

        // sec03.exam02 Casting
        int intV2 = 44032;
        char charV2 = (char)intV2;
        System.out.println(charV2); // 가

        long longV2 = 500;
        intV2 = (int)longV2;
        System.out.println(intV2);  // 500

        double doubleV2 = 3.14;
        intV2 = (int)doubleV2;
        System.out.println(intV2);  // 3

        // sec03.exam03 Byte Operation
        byte result1 = 10 + 20;
        System.out.println(result1);

        byte x = 10, y = 20;
        int result2 = x + y;
        System.out.println(result2);

        // sec03.exam04
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3;
        System.out.println(result); // 1110

        // sec03.exam05
        byte byteV2 = 10, byteV3 = 20;
        //byte byteV4 = byteV2 + byteV3;  // int value returned. error
        int intV3 = byteV2 + byteV3;
        System.out.println(intV3);

        char charV3 = 'A', charV4 = 1;
        // char charV5 = charV3 + charV4;
        int intV4 = charV3 + charV4;
        System.out.println("유니코드 = " + intV4 + " || 출력문자 = " + (char) intV4);

        int intV5 = 10;
        int intV6 = intV5 / 4;
        System.out.println(intV6);  // 2

        int intV7 = 10;
        //int intV8 = intV5 / 4.0;
        double doubleV3 = intV5 / 4.0;
        System.out.println(doubleV3);  // 2.5
        int m = 1, n = 2;
        double res = (double) m / n;
        System.out.println(res);       // 0.5

        // sec03.exam06 String concat
        int value = 10 + 2 + 8;
        System.out.println("value : " + value); // 20

        String str1 = 10 + 2 + "8";
        System.out.println("str1 : " + str1);   // 128
        String str2 = 10 + "2" + 8;
        System.out.println("str2 : " + str2);   // 1028
        String str3 = "10" + 2 + 8;
        System.out.println("str3 : " + str3);   // 1028
        String str4 = "10" + (2 + 8);
        System.out.println("str4 : " + str4);   // 1010

        // sec03.exam07 Primitive and String Conversion
        int val1 = Integer.parseInt("10");
        double val2 = Double.parseDouble("3.14");
        boolean val3 = Boolean.parseBoolean("true");

        System.out.println("value1 : " + val1);
        System.out.println("value2 : " + val2);
        System.out.println("value3 : " + val3);

        String str5 = String.valueOf(10);
        String str6 = String.valueOf(3.14);
        String str7 = String.valueOf(true);

        System.out.println("string5 : " + str5);
        System.out.println("string6 : " + str6);
        System.out.println("string7 : " + str7);
    }
}
