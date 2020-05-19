
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    //return true if apartment is larger than the compared, else false
    public boolean larger(Apartment compared){
        
        if(squareMeters > compared.squareMeters){
           return true; 
        }
        else{
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment){
        int mainPrice = squareMeters*pricePerSquareMeter;
        int otherPrice = otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
        return Math.abs(mainPrice - otherPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        
        if(pricePerSquareMeter>otherApartment.pricePerSquareMeter){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
