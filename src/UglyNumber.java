public class UglyNumber {
    public static  boolean isUgly(int n) {
        while(n%2==0){
            System.out.println(n);
            n=n/2;
        }

        while(n%3==0){
            System.out.println(n);
            n=n/3;
        }

        while(n%5==0){
            System.out.println(n);
            n=n/5;
        }
        if(n==1 || n== -1) return true;
        return false;

    }

    public  static void main(String[] args) {
        System.out.println(isUgly(-2147483648));

    }
}
