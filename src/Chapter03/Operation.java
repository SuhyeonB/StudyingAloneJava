package Chapter03;

public class Operation {
    public static void main(String[] args) {
        // sec02.exam01 Sign Operator
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1= " + result1);
        System.out.println("result2= " + result2);

        byte b = 100;
        // byte result3 = -b;
        // possible lossy conversion from int to byte
        int result3 = -b;
        System.out.println("result3 = " + result3);

        // sec02.exam02 Increase Decrease Operator
        int x1 = 10;
        int y1 = 10;
        int z;

        System.out.println("----------------");
        x1++;
        ++x1;
        System.out.println("x1 = " + x1);
        System.out.println("----------------");
        y1--;
        --y1;
        System.out.println("y1 = " + y1);

        System.out.println("----------------");
        z = x1++;
        System.out.println("z = " + z);
        System.out.println("x1 = " + x1);

        System.out.println("----------------");
        z = ++x1;
        System.out.println("z = " + z);
        System.out.println("x1 = " + x1);

        System.out.println("----------------");
        z = ++x1 + y1++;
        System.out.println("z = " + z);
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);

        // sec02.exam03 Deny Logic Operator
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        // sec02.exam04 Arithmetic Operator
        int v1 = 5, v2= 2;

        int sum = v1 + v2;
        System.out.println("sum = " + sum);

        int sub = v1 - v2;
        System.out.println("sub = " + sub);

        int mul = v1 * v2;
        System.out.println("mul = " + mul);

        int div = v1 / v2;
        System.out.println("div = " + div);

        int rem = v1 % v2;
        System.out.println("rem = " + rem);

        double doub = (double) v1 / v2;
        System.out.println("double div = " + doub);

        // sec02.exam05 Char Operaotr

        char c1 = 'A' + 1;
        char c2 = 'A';
        // char c3 = c2 + 1;    // type of c2 is 'int'
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        // System.out.println("c3: " + c3);

        // sec02.exam06 String concat
        String str1 = "JDK" + 6.0;
        String str2 = str1 + "  특징";
        System.out.println(str2);
        String str3 = "JDK" + 3 + 3.0;
        String str4 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);

        // sec02.07 Compare Operator
        int num1 = 10, num2 = 10;
        boolean res1 = (num1 == num2);
        boolean res2 = (num1 != num2);
        boolean res3 = (num1 <= num2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);

        char char1 = 'A';
        char char2 = 'B';
        boolean res4 = (char1 < char2);
        System.out.println("res4 = " + res4);

        // sec02.exam08 Compare Operator 2
        int v3 = 1;
        double v4 = 1.0;
        System.out.println(v3 == v4);

        double v5 = 0.1;
        float v6 = 0.1f;
        System.out.println(v5 == v6);
        System.out.println((float)v5 == v6);

        // sec02.exam09 Logical Operator
        int charCode = 'A';

        if ((charCode>=65) & (charCode<90)) {
            System.out.println("Big capital letter");
        }
        if ((charCode>=97) && (charCode<122)) {
            System.out.println("Small capital letter");
        }
        if ((charCode<48) && !(charCode>57)) {
            System.out.println("It is number (0~9)");
        }
        int value = 6;

        if ((value % 2 == 0) | (value%3==0)) {
            System.out.println("multiple of 2 or 3");
        }
        if ((value % 2 == 0) || (value%3==0)) {
            System.out.println("multiple of 2 or 3");
        }

        // sec02.exam10 Assignment Operator
        int result = 0;
        result += 10;
        System.out.println("result = " + result);
        result -= 5;
        System.out.println("result = " + result);
        result *= 3;
        System.out.println("result = " + result);
        result /= 5;
        System.out.println("result = " + result);
        result %= 3;
        System.out.println("result = " + result);

        // sec02.exam11 Conditional Operation
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println("You're score is " + score);
    }
}
