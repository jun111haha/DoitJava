package practice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값:");
        int a = stdIn.nextInt();

        int b = 0;
        while (true){
            System.out.print("b의값 :");
            b = stdIn.nextInt();

            if(b>a)
                break;
            System.out.println("a보다 큰값을 입력하세요");
        }

        System.out.println("b - a 는 :" + (b-a) + "입니다.");

    }
}
