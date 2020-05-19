public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    
    //constructor
    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }
    
    public void next(){
        this.value++;
        if(this.value>this.upperLimit){
            this.value=0;
        }
    }
    
    public String toString(){
        if(this.value<10){
        
        return "0"+value;
        }
        else{
        return ""+this.value;
        }
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int valSet){
        if(valSet>this.upperLimit || valSet<0){
        //Do nothing
        }
        else{
            this.value = valSet;
        }
    }
    
}