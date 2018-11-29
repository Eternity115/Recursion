
package Assignments;

import TerminalIO.KeyboardReader;


public class Hanoi {

    static int nummoves=0;
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int numrings = k.readInt("Enter number of rings 3 to 10: ");
        if (numrings < 3 || numrings > 10){
            System.out.println("Invalid input - program will now end.");
            return;
        }
        
        //call move - requires number of rings, going from where to where
        //and which rings is the inbetween step
        move(numrings,1,3,2);
        System.out.println("Total moves: " + nummoves);
    }
    
    public static void move(int n, int i, int j, int k){
        //stop doing it when we are down to 0 rings (n=0)
        if (n>0){
            nummoves++;
            move(n-1, i, k, j); //move calls itself, note: j & k reversed
            System.out.println("Move ring " + n + " from peg " + i + " to peg " + j);
            move (n-1, k, j, i);
         }
    }
    
}
