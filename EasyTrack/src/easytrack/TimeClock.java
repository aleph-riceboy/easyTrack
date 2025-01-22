// Eric Donner, Felix
// 2024/05/31
// Time Clock object class

package easytrack;

public class TimeClock extends NetworkDevice{
    
    // CONSTRUCTORS
    public TimeClock() {
        super();
    }
    
    public TimeClock(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, MACAddress, IPAddress0, IPAddress1, IPAddress2);
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the time clock object as a string
     */
    public String toString() {
        return super.toString();
    }
}