// Eric Donner, Felix
// 2024/05/29
// Monitor object class

package easytrack;

public class Monitor extends Hardware{
    
    // ATTRIBUTES
    protected String employeeAssignment;
    protected String dellServiceTag;
    
    // CONSTRUCTORS
    public Monitor() {
        super();
    }
    
    public Monitor(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes);
        this.employeeAssignment = "";
        this.dellServiceTag = "";
    }
    
    public Monitor(int assetNumber, int location, boolean active, String vendor, String model, String serialNumber, int purchasedType, String notes, String employeeAssignment, String dellServiceTag) {
        super(assetNumber, location, active, vendor, model, serialNumber, purchasedType, notes);
        this.employeeAssignment = employeeAssignment;
        this.dellServiceTag = dellServiceTag;
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the employee who is using the monitor
     */
    public String getEmployeeAssignment() {
        return this.employeeAssignment;
    }
    
    /**
     * set the assigned employee to a new employee
     * @param newEmployee - the new employee
     */
    public void setEmployeeAssignment(String newEmployee) {
        this.employeeAssignment = newEmployee;
    }
    
    /**
     * @return - get and return the dell service tag
     */
    public String getDellServiceTag() {
        return this.dellServiceTag;
    }
    
    /**
     * @return - gets and returns the monitor object as a string
     */
    public String toString() {
        return super.toString() + "\nEmployee Assigned: " + this.employeeAssignment + "\nDell Service Tag: " + this.dellServiceTag;
    }
}
