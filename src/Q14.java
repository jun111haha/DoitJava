import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");

        int a = stdIn.nextInt();

        System.out.print("단 수:" + a);

        for(int i=0; i<a; i++){
            System.out.println();
            for(int j=0; j<a; j++){
                System.out.printf("*");
            }
        }


    }
}
