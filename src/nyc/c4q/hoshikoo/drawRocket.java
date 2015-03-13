package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/12/15.
 */
public class DrawRocket {


    public static void drawLine(int size){
        String line ="+";

        for (int i=0; i<size; i++){
            line +="*=*=";
        }
        line +="+";
        System.out.println(line);
    }

    public static void drawTop(int size){

        //print out ** x (size *2-1)
        //print out
        String top = " ";
        
        top = "/";

        for (int i=0; i<size; i++){
            top +="*=*=";
        }

    }

    public static void main (String[] args){
        drawTop(1);
        drawLine(3
        );
    }

}
