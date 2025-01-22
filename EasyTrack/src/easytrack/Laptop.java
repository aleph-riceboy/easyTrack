// Eric Donner, Felix
// 2024/05/30
// Laptop object class

package easytrack;

public class Laptop extends NetworkDevice{
    
    // ATTRIBUTES
    protected String employeeAssignment;
    protected String dellServiceTag;
    
    // CONSTRUCTORS
    public Laptop() {
        super();
    }
    
    public Laptop(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress, IPAddress0, IPAddress1, IPAddress2);
        this.employeeAssignment = "";
        this.dellServiceTag = "";
    }
    
    public Laptop(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String deviceName, String MACAddress, String IPAddress0, String IPAddress1, String IPAddress2, String employeeAssignment, String dellServiceTag) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes, deviceName, MACAddress, IPAddress0, IPAddress1, IPAddress2);
        this.employeeAssignment = employeeAssignment;
        this.dellServiceTag = dellServiceTag;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the employee that the laptop is assigned to
     */
    public String getEmployeeAssignment() {
        return this.employeeAssignment;
    }
    
    /**
     * change the assigned employee to the laptop
     * @param newEmployee - the new assigned employee
     */
    public void setEmployeeAssignment(String newEmployee) {
        this.employeeAssignment = newEmployee;
    }
    
    /**
     * @return - gets and returns the dell service tag of the laptop
     */
    public String getDellServiceTag() {
        return this.dellServiceTag;
    }
    
    /**
     * @return - gets and returns the laptop object as a string
     */
    public String toString() {
        return super.toString() + "\nEmployee Assigned: " + this.employeeAssignment + "\nDell Service Tag: " + this.dellServiceTag;
    }
}