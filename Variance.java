import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(Integer num:list){
            sum += num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double totalList = (double)sum(list);
        double totalAvg = totalList/list.size();      
        
        return totalAvg;
        
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg =  average(list);
        double varTotal=0.0;
        
        for(double number:list){
            varTotal = varTotal+Math.pow(number-avg,2);
        }
        varTotal = varTotal/(list.size()-1);
        
        return varTotal;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
