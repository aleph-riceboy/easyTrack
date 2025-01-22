// Eric Donner, Felix
// 2024/05/28
// NetworkDevice superclass

package easytrack;

public class NetworkDevice extends Hardware{
    
    // ATTRIBUTES
    protected String deviceName;
    protected String MACAddress;
    protected String IPAddresses[] = new String[3];
    
    // CONSTRUCTOR
    public NetworkDevice() {
        super();
        this.deviceName = "";
        this.MACAddress = "";
        this.IPAddresses[0] = "";
        this.IPAddresses[1] = "";
        this.IPAddresses[2] = "";
    }
    
    public NetworkDevice(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes);
        this.deviceName = "";
        this.MACAddress = "";
        this.IPAddresses[0] = "";
        this.IPAddresses[1] = "";
        this.IPAddresses[2] = "";
    }
    
    public NetworkDevice(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes);
        this.deviceName = deviceName;
        this.MACAddress = MACAddress;
    }
    
    public NetworkDevice(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes);
        this.MACAddress = MACAddress;
        this.IPAddresses[0] = IPAddress0;
        this.IPAddresses[1] = IPAddress1;
        this.IPAddresses[2] = IPAddress2;
    }
    
    public NetworkDevice(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes);
        this.deviceName = deviceName;
        this.MACAddress = MACAddress;
        this.IPAddresses[0] = IPAddress0;
        this.IPAddresses[1] = IPAddress1;
        this.IPAddresses[2] = IPAddress2;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the device name of the network device object
     */
    public String getDeviceName() {
        return this.deviceName;
    }
    
    /**
     * @return - gets and returns the MAC Address of the network device object
     */
    public String getMACAddress() {
        return this.MACAddress;
    }
    
    /**
     * @return - gets and returns specific IP Address of the network device object
     * @param n - the entered number that corresponds with the IP address
     */
    public String getIPAddress(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return this.IPAddresses[n - 1];
        } else {
            return "Enter 1, 2, or 3";
        }
    }
    
    /**
     * @return - gets and returns the network device object as a string
     */
    public String toString() {
        return super.toString() + "\nDevice Name: " + this.deviceName + "\nMAC Address: " + this.MACAddress + "\nIP Address 1: " + this.IPAddresses[0]
                + "\nIP Address 2: " + this.IPAddresses[1] + "\nIP Address 3: " + this.IPAddresses[2];
    }
}