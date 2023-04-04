public class Main {
    public static void main(String[] args) {
        int a =7;
        int b =7;
        int c =5;
        int d =10;

        int sum1 = a+b;
        int sum2 = c+d;

        System.out.println(sum1>sum2); // 1-st compare
        sum1++;
        sum2=sum2-2;

        System.out.println(sum1>sum2);   // 2-nd compare

        System.out.println(sum1%2==0 || sum2%2==0); // divide & compare


    }
}