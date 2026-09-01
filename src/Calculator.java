public class Calculator {
    public static void main(String[] args){
        int m = 88;
        int n = 11;
        boolean AA = (m % n ==0);
        System.out.println("m能被11整除吗？" + AA);

        System.out.println("m + n = "+ (m + n));
        System.out.println("m - n = " + (m - n));
        System.out.println("m * n = " + (m * n));
        System.out.println("m / n = " + (m / n));
        System.out.println("m % n = " + (m % n));
    }
}