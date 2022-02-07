import java.lang.reflect.*;

/** Main class **/
public class Main {
    public static void main(String[] args) {

// Gets the variables for reflection
        Vars variables = new Vars();
        Class vc = variables.getClass();
        Field[] fields = vc.getDeclaredFields();

// Prints out the reflected information
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].toString());
        }
    }
}

/** Class storing the variables for display **/
class Vars {
    private int var1 = 0;
    public int var2 = 3;
    private double var3 = 6;
    public char var4 = 'a';
    public String var5 = "Hello there";
}


