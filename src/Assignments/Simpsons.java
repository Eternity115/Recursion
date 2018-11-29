
package Assignments;


public class Simpsons {

    static String start[] = {"Simpsons in Cave", "Lisa Trapped with Burns", 
        "Burns at Moe's", "Moe with Edna", "Edna in School"};
    static String end[] = {"Simpsons leave cave", "Lisa takes picture with Burns", 
        "Burns gets gold", "Moe puts gold in machine", "Edna stays on as teacher"};
    static boolean ending=false;
    
    public static void main(String[] args) {
        tellStory(0);
    }
    
    public static void tellStory(int n){
        System.out.println(start[n]);
        if (n<4) tellStory(n+1);
        System.out.println(end[n]);
    }
    
}
