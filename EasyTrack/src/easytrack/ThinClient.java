// Eric Donner, Felix
// 2024/05/30
// ThinClient object class

package easytrack;

public class ThinClient extends NetworkDevice{
    
    // ATTRIBUTES
    protected String dellServiceTag;
    
    // CONSTRUCTORS
    public ThinClient() {
        super();
    }
    
    public ThinClient(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress);
        this.dellServiceTag = "";
    }
    
    public ThinClient(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String dellServiceTag) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress);
        this.dellServiceTag = dellServiceTag;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the dell service tag
     */
    public String getDellServiceTag() {
        return this.dellServiceTag;
    }
    
    /**
     * @return - gets and returns a thin client object as a string
     */
    public String toString() {
        return super.toString() + "\nDell Service Tag: " + this.dellServiceTag;
    }
}