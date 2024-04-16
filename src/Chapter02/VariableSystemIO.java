package Chapter02;

import java.util.Scanner;

public class VariableSystemIO {
    public static void main(String[] args) throws Exception {
        // sec04.exam01 Print
        int value = 123;
        System.out.printf("integer : %d\n", value);
        System.out.printf("integer (6-digit (left space)) : %6d\n", value);
        System.out.printf("integer (6-digit(right space)) : %-6d\n", value);
        System.out.printf("integer (6-digit(fill zero(0)): %06d\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : 10.2f\n", 10, area);
        String name = "John", job = "programmer";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

        // sec04.exam02 Key Code
        int keyCode;
        keyCode = System.in.read();
        System.out.println("keyCode:  " + keyCode);

        // sec04.exam04 KeyCode cont'd
        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if (keyCode == 113) { break; }  // if q
        }

        // sec04.exam05 Scanner
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while (true) {
            inputData = scanner.nextLine();
            System.out.println("Input : \"" + inputData + "\"");
            if (inputData.equals("q")) { break; }
        }
    }
}
