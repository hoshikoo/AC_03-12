package nyc.c4q.hoshikoo;

public class Methods {

    public static void speak(){
        System.out.println("hello");
    }

    public static void shoutOut(String name){
        System.out.println("hey, "+ name);
        speak();
    }


    public static void main(String[] args) {
	    String n = "Von Neumann";
        shoutOut(n);
        shoutOut("Hoshiko Oki");
    }
}
