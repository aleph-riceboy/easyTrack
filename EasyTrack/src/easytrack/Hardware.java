// Eric Donner, Felix
// 2024/05/28
// Hardware superclass

package easytrack;

public class Hardware {
    
    // ATTRIBUTES
    protected int assetNumber;
    protected int location;
    protected boolean active;
    protected String vendor;
    protected String model;
    protected String serialNumber;
    protected int purchasedType;
    protected String notes;
    
    // CONSTRUCTOR
    public Hardware() {
        this.assetNumber = 0;
        this.location = 0;
        this.active = true;
        this.vendor = "";
        this.model = "";
        this.serialNumber = "";
        this.purchasedType = 0;
        this.notes = "";
    }
    
    public Hardware(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes) {
        this.assetNumber = assetNumber;
        this.location = location;
        this.active = active;
        this.vendor = vendor;
        this.model = model;
        this.serialNumber = serialNumber;
        this.purchasedType = purchasedType;
        this.notes = notes;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the asset number of the object
     */
    public int getAssetNumber() {
        return this.assetNumber;
    }
    
    /**
     * @return - gets and returns the location of the object
     */
    public int getLocation() {
        return this.location;
    }
    
    /**
     * sets the object's location to a new, specified location
     * @param newLocation - the new location
     */
    public void setLocation(int newLocation) {
        this.location = newLocation;
    }
    
    /**
     * @return - sets and returns whether the device is active or not
     */
    public boolean getActive() {
        return this.active;
    }
    
    /**
     * sets whether the device is active or not
     * @param activity - whether the device is active or not
     */
    public void setActive(boolean activity) {
        this.active = activity;
    }
    
    /**
     * @return - gets and returns the vendor of the object
     */
    public String getVendor() {
        return this.vendor;
    }
    
    /**
     * @return - gets and returns the model of the object
     */
    public String getModel() {
        return this.model;
    }
    
    /**
     * @return - gets and returns the serial number of the object
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }
    
    /**
     * @return - gets and returns how the object was purchased
     */
    public int getPurchasedType() {
        return this.purchasedType;
    }
    
    /**
     * @return - gets and returns the object's notes
     */
    public String getNotes() {
        return this.notes;
    }
    
    /**
     * sets the object's notes to a new specified note
     * @param newNote - the new note
     */
    public void setNote(String newNote) {
        this.notes = newNote;
    }
    
    /**
     * @return - returns specified object as a string
     */
    public String toString() {
        return "Asset Number: " + this.assetNumber + "\nLocation: " + this.location + "\nActive: " + this.active + "\nVendor: " + this.vendor
                + "\nModel: " + this.model + "\nSerial Number: " + this.serialNumber + "\nPurchase Type: " + this.purchasedType + "\nNotes: " + this.notes;
    }
    
    /**
     * finds out whether 2 hardware objects are equal based on asset number
     * @param s1 - the other hardware object
     * @return - the returned boolean if the objects are equal or not
     */
    public boolean equals(Hardware s1) {
        if (this.assetNumber == s1.assetNumber) {
            return true;
        } else {
            return false;
        }
    }
}