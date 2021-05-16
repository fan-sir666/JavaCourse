/*递归实现斐波那契额*/
public class Factorial02 {
    public static int f(int n){
        if (n==1){
            return 1;
        }else if (n==2){
            return 1;
        }else {
            return f(n-1) +f(n-2);
        }
    }

    public static void main(String[] args) {
        int f = f(12);
        System.out.println(f);
    }
}
