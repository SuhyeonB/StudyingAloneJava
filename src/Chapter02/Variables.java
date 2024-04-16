package Chapter02;

public class Variables {
    public static void main(String[] args) {
        // sec01.exam01 variable initialization
        int value = 0;
        int result = value + 10;
        System.out.println(result);

        // sec01.exam02 Variable use exam
        int hour = 3; int min = 5;
        System.out.println(hour + "H " + min + "M");

        int totalMin = (hour * 60) + min;
        System.out.println("total " + totalMin + "M");

        // sec01.exam03 Variable exchanges
        int x = 3, y = 5;
        System.out.println("x: " + x + "| y : " + y);

        int temp = x;
        x = y; y = temp;
        System.out.println("x: " + x + "| y : " + y);

        // Variable Scope
        // local variable : 메소드 블록 내에서 선언된 변수. 실행 이후 자동으로 없어짐
        int v1 = 15;
        if (v1 > 10) {
            int v2; // local
            v2 = v1 - 10;
        }
        // int v3 = v1 + v2 + 5;    // error
    }
}
