
public class Factorial {

    
    public static void main(String[] args) {
        int x = fact(7);
        System.out.println("7! = " +x);
    }
    
    
    public static int fact(int num){
        if (num<=1) return 1;
        else{
            System.out.println("Calling fact again for number " + (num-1));
            return num * fact(num-1);
        } 
    }
}
