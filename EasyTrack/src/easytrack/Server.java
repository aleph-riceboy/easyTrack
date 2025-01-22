// Eric Donner, Felix
// 2024/05/29
// Server object class

package easytrack;

public class Server extends NetworkDevice{
    
    // ATTRIBUTES
    protected String dellServiceTag;
    protected String ILOIPAddress;
    
    // CONSTRUCTORS
    public Server() {
        super();
    }
    
    public Server(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress, IPAddress0, IPAddress1, IPAddress2);
        this.dellServiceTag = "";
        this.ILOIPAddress = "";
    }
    
    public Server(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2, String dellServiceTag, String ILOIPAddress) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress, IPAddress0, IPAddress1, IPAddress2);
        this.dellServiceTag = dellServiceTag;
        this.ILOIPAddress = ILOIPAddress;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the Dell Service Tag of the server object
     */
    public String getDellServiceTag() {
        return this.dellServiceTag;
    }
    
    /**
     * @return - gets and returns the ILO IP Address of the server object
     */
    public String getILOIPAddress() {
        return this.ILOIPAddress;
    }
    
    /**
     * @return - gets and returns the server object as a string
     */
    public String toString() {
        return super.toString() + "\nDell Service Tag: " + this.dellServiceTag + "\nILO IP Address: " + this.ILOIPAddress;
    }
}