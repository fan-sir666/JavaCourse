/*递归:自己调用自己，一定要有结束*/
public class Factorial01 {
    public static  String str = "";

    /*阶乘静态方法*/
    public  static  int f(int n) {

        if (n==1){
            str += n;
            return 1;
        }else {
            str += n + "*";
            return  n*f(n-1);
        }
    }

    public static void main(String[] args) {
        int result = f(5);
        System.out.println(str +"="+ result);
    }
}
