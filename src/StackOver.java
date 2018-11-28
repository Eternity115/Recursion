
public class StackOver {

    
    public static void main(String[] args) {
        System.out.println("Bad method (7) = " + badMethod(7));
        System.out.println("Bad method (6) = " + badMethod(6));
    }
    
    public static int badMethod(int num){
        if (num==1) return 1;
        else return 2 * badMethod(num-2);
    }
    
}
