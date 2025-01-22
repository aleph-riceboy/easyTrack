// Eric Donner, Felix
// 2024/05/31
// Scanner object class

package easytrack;

public class Scanner extends NetworkDevice{
    
    // ATTRIBUTES
    protected String printerLocation;
    
    // CONSTRUCTORS
    public Scanner() {
        super();
    }
    
    public Scanner(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String printerLocation) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes);
        this.printerLocation = printerLocation;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the scanners location
     */
    public String getPrinterLocation() {
        return this.printerLocation;
    }
    
    /**
     * @return - gets and returns a scanner object as a string
     */
    public String toString() {
        return super.toString() + "\nPrinter Location: " + this.printerLocation;
    }
}