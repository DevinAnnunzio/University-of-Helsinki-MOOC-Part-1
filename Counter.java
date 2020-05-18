public class Counter {
 
    private int value;
    private boolean check;
 
    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;
    }
 
    public Counter(int value) {
        this(value, false);
    }
 
    public Counter(boolean tarkista) {
        this(0, tarkista);
    }
 
    public Counter() {
        this(0, false);
    }
 
    public int value() {
        return value;
    }
 
    public void increase() {
        increase(1);
    }
 
    public void decrease() {
        decrease(1);
    }
 
    public void increase(int by) {
        if (by >= 0) {
            value += by;
        }
    }
 
    public void decrease(int by) {
        if (by < 0) {
            return;
        }
 
        value -= by;
        
        if (check && value <0) {
            value = 0;
        }                
 
    }
}