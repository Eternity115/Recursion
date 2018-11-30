
package Assignments;

import java.util.ArrayList;
import java.util.Arrays;


public class Array11 {
    
    ArrayList<int[]> testdata; //data being sent in
    ArrayList<Integer> expected; //expected result
    String id;
    
    
    Array11(ArrayList<int[]> al,ArrayList<Integer> ex, String name){
        testdata = al;
        expected = ex;
        id = name;
    }
    
    public int solve(int[] nums, int index){
        if (index >= nums.length) return 0;
        if (nums[index]==11) return 1 + solve(nums, index+1);
        else return solve(nums, index+1);
    }
    
    public void test(){
        System.out.println("Expected\t\t\t\tRun\tResult");
        System.out.println("=======================================================");
        for (int i = 0; i < testdata.size(); i++) {
            String output = id + "(" + Arrays.toString(testdata.get(i)) + ")-> " + expected.get(i);
            System.out.print(String.format("%-40s", output)); //puts question into 25 even spaces
            int result = solve(testdata.get(i),0);
            String status = result==expected.get(i)? "OK": "FAIL";
            System.out.println(result + "\t" + status);
        }
        
    }
   
    public static void main(String args[]){
        ArrayList<int[]> testing = new ArrayList();
        ArrayList<Integer> out = new ArrayList();
        int x[][]={{1,2,11}, {11,11}, {1,2,3,4}, 
            {1,11,3,11,11}, {11}, {1}, {}, 
            {11,2,3,4,11,5}, {11,5,11}};
        for (int nums[]: x) {
            testing.add(nums);
        }
        out.add(1); out.add(2); out.add(0); 
        out.add(3); out.add(1); out.add(0); 
        out.add(0); out.add(2); out.add(2); 
        
        //create problem
        Array11 prob = new Array11 (testing,out, "Array11");
        //run the test
        prob.test();
    }
}
