
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    //advances the days limited by having 30 day calendar
    public void advance(){
        day++;
        if(day>30){
            day = 1;
            month++;
            if(month>12){
                month = 1;
                year++;
            }
        }
    }
    //advances the date by given amount
    public void advance(int numberOfDays){
        int i = 0;
        while(i<numberOfDays){
            advance();
            i++;
        }
        
    }
    //Copies date object, advances it by given days, and returns new object
    public MyDate afterNumberOfDays(int days){
        MyDate updatedDate = new MyDate(this.day,this.month,this.year);
        updatedDate.advance(days);
        
        return updatedDate;
    }

}
