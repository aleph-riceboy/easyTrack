// Eric Donner, Felix
// 2024/05/30
// Fiber Switch object class

package easytrack;

public class FiberSwitch extends NetworkDevice{
    
    // CONSTRUCTORS
    public FiberSwitch() {
        super();
    }
    
    public FiberSwitch(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress, IPAddress0, IPAddress1, IPAddress2);
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns a Fiber Switch object as a string
     */
    public String toString() {
        return super.toString();
    }
}