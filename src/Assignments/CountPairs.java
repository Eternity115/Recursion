
package Assignments;

import java.util.ArrayList;


public class CountPairs {
    ArrayList<String> testdata; //data being sent in
    ArrayList<Integer> expected; //expected result
    String id;
    
    CountPairs(ArrayList<String> al,ArrayList<Integer> ex, String name){
        testdata = al;
        expected = ex;
        id = name;
    }
    
    public int solve(String str){
        if (str.length()<3 || str.equals("")) 
        return 0;
        if (str.charAt(0)==str.charAt(2)) 
        return 1 + solve(str.substring(1));
        else 
        return solve(str.substring(1));
    }
    
    public void test(){
        System.out.println("Expected\t\t\tRun\tResult");
        System.out.println("===============================================");
        for (int i = 0; i < testdata.size(); i++) {
            String output = id + "(" + testdata.get(i) + ")-> " + expected.get(i);
            System.out.print(String.format("%-32s", output)); //puts question into 25 even spaces
            int result = solve(testdata.get(i));
            String status = result==expected.get(i)? "OK": "FAIL";
            System.out.println(result + "\t" + status);
        }
    }
    
    public static void main(String args[]){
        ArrayList<String> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();
        //add test data
        in.add("axa"); in.add("axax"); in.add("axbx");
        in.add("hi"); in.add("hihih"); in.add("ihihhh");
        in.add("ihjxhh"); in.add(""); in.add("a");
        in.add("aa"); in.add("aaa");
        //add expected results
        out.add(1); out.add(2); out.add(1); 
        out.add(0); out.add(3); out.add(3); 
        out.add(0); out.add(0); out.add(0);  
        out.add(0); out.add(1);  
        //create problem
        CountPairs prob = new CountPairs (in,out, "CountPairs");
        //run the test
        prob.test();
    }
}
