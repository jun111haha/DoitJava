public class 네값의최대값 {
    public static void main(String[] args) {

        max4(4,5,1,2);
    }

    static int max4(int a, int b, int c, int d){
        int max = a;

        if(b> max){
            max = b;
        }else if(c> max){
            max = c;
        }else if(d> max){
            max = d;
        }

        System.out.println(max);
        return max;
    }
}
