
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int amountOfNumbersCounter;
    
    public NumberStatistics(){
        //initialize object variable amountOfNumbers
        amountOfNumbers = 0;
    }
    
    public void addNumber(int number){
        amountOfNumbersCounter++;
        amountOfNumbers += number;
        
    }
    
    public int amountOfNumbers(){
        return amountOfNumbersCounter;
    }
    
    public int sum(){
       return this.amountOfNumbers;
    }
    
    public double average(){
        if(this.amountOfNumbersCounter == 0){
            return 0;
        }
        else{
            //cast to double
            return (double)amountOfNumbers/amountOfNumbersCounter;
        }
    }
    
    public String toString(){
        return ("Amount: " + amountOfNumbers());
    }
}
