// Eric Donner, Felix
// 2024/05/31
// Printer object class

package easytrack;

public class Printer extends Scanner{
    
    // ATTRIBUTES
    protected boolean AS400Q;
    protected String AS400QName;
    protected boolean chequePrinter;
    protected boolean colourPrinter;
    protected String faxNumber;
    
    // CONSTRUCTORS
    public Printer() {
        super();
    }
    
    public Printer(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2, String printerLocation, boolean AS400Q, String AS400QName, boolean chequePrinter, boolean colourPrinter, String faxNumber) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, printerLocation);
        this.MACAddress = MACAddress;
        this.IPAddresses[0] = IPAddress0;
        this.IPAddresses[1] = IPAddress1;
        this.IPAddresses[2] = IPAddress2;
        this.AS400Q = AS400Q;
        this.AS400QName = AS400QName;
        this.chequePrinter = chequePrinter;
        this.colourPrinter = colourPrinter;
        this.faxNumber = faxNumber;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the AS400Q value for the printer
     */
    public boolean getAS400Q() {
        return this.AS400Q;
    }
    
    /**
     * @return - gets and returns the AS400Q name for the printer
     */
    public String getAS400QName() {
        return this.AS400QName;
    }
    
    /**
     * @return - gets and returns whether the printer is a cheque printer
     */
    public boolean getChequePrinter() {
        return this.chequePrinter;
    }
    
    /**
     * @return - gets and returns whether the printer is a colour printer
     */
    public boolean getColourPrinter() {
        return this.colourPrinter;
    }
    
    /**
     * @return - gets and returns the fax number of the printer
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }
    
    /**
     * @return - gets and returns the printer object as a string
     */
    public String toString() {
        return super.toString() + "\nAS400Q: " + this.AS400Q + "\nAS400Q Name: " + this.AS400QName + "\nCheque Printer: " + this.chequePrinter + 
                "\nColour Printer: " + this.colourPrinter + "\nFax Number: " + this.faxNumber;
    }
}