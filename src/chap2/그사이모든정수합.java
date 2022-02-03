package chap2;

import java.util.Scanner;

public class 그사이모든정수합 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
        System.out.print("a의 값：");
        int a = stdIn.nextInt();
        System.out.print("b의 값：");
        int b = stdIn.nextInt();

        System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
    }

    static int sumof(int a, int b){
        int min =0;
        int max =0;
        int sum =0;

        if(a > b){
            min = b;
            max = a;
        }else{
            min = a;
            max = b;
        }

        for(int i=min; i<=max; i++){
            sum+=i;
        }

        System.out.println(sum);
        return sum;
    }

}
