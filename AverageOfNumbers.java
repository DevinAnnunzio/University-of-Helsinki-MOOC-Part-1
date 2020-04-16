
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int sum = 0;
        for(Integer num:list){
            sum += num;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double totalList = (double)sum(list);
        double totalAvg = totalList/list.size();      
        
        return totalAvg;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
