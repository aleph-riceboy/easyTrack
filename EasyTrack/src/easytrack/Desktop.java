// Eric Donner, Felix
// 2024/05/30
// Desktop object class

package easytrack;

public class Desktop extends NetworkDevice{
    
    // ATTRIBUTES
    protected String dellServiceTag;
    
    // CONSTRUCTORS
    public Desktop() {
        super();
    }
    
    public Desktop(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress, IPAddress0, IPAddress1, IPAddress2);
        this.dellServiceTag = "";
    }
    
    public Desktop(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2, String dellServiceTag) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress, IPAddress0, IPAddress1, IPAddress2);
        this.dellServiceTag = dellServiceTag;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the dell service tag of the desktop
     */
    public String getDellServiceTag() {
        return this.dellServiceTag;
    }
    
    /**
     * @return - gets and returns the desktop object as a string
     */
    public String toString() {
        return super.toString() + "\nDell Service Tag: " + this.dellServiceTag;
    }
}