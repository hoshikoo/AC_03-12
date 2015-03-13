package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/12/15.
 */
public class Methods5 {
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }
    public static int subtract(int x, int y){
        int result = x-y;
        return result;
    }
    public static void main(String[] args){
        int num = add(3, 5);
        System.out.println(num);

        int num2 = subtract(3,5);
        System.out.println(num2);
    }
}
