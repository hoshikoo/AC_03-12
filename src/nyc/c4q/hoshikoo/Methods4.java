package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/12/15.
 */
public class Methods4 {
    public static int sum(){
        int result = 0;
        for (int i = 0; i<10; i++){
            result++;
            System.out.println(i);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(sum());
    }
}
