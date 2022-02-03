package chap2;

public class SumForEx {
    public static void main(String[] args) {

        sumfor(7);
    }

    static int sumfor(int num){
        int sum = 0;

        for(int i=0; i<= num; i++){
            sum += i;
        }
        System.out.println(sum);

        return sum;
    }
}
