// Felix, Eric Donner
// 2024/05/30
// Easy Track Inventory Application
// Main Menu

package easytrack;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EasyTrackMainMenu extends javax.swing.JFrame {
    
    //instantiate array list for total inventory
    static ArrayList<Hardware> inventory = new ArrayList();
    
    //instantiate array lists for inventory types
    static ArrayList<Hardware> monitors = new ArrayList();
    static ArrayList<Hardware> firewalls = new ArrayList();
    static ArrayList<Hardware> desktops = new ArrayList();
    static ArrayList<Hardware> laptops = new ArrayList();
    static ArrayList<Hardware> networkSwitch = new ArrayList();
    static ArrayList<Hardware> fiberSwitch = new ArrayList();
    static ArrayList<Hardware> printers = new ArrayList();
    static ArrayList<Hardware> san = new ArrayList();
    static ArrayList<Hardware> scanners = new ArrayList();
    static ArrayList<Hardware> servers = new ArrayList();
    static ArrayList<Hardware> tapeDrive = new ArrayList();
    static ArrayList<Hardware> thinClients = new ArrayList();
    static ArrayList<Hardware> timeClock = new ArrayList();
    static ArrayList<Hardware> ups = new ArrayList();
    static ArrayList<Hardware> waps = new ArrayList();
    
    //windows
    private EasyTrackAdd EasyTrackAdd;
    private EasyTrackRemove EasyTrackRemove;
    private EasyTrackSearch EasyTrackSearch;
    private EasyTrackView EasyTrackView;
    
    //instantiate object mapper
    ObjectMapper objectMapper = new ObjectMapper();
    
    // METHODS
    /**
     * turns array into array list
     * @param a - the array of hardware type
     * @param b - the array list of hardware type
     */
    public static void arrayList(Hardware[] a, ArrayList<Hardware> b){
        for (int i = 0;i<a.length;i++) {
            b.add(a[i]);
        }
    }
    
    /**
     * adds stuff from array lists to the inventory array list
     * @param a - the array list
     */
    public static void addToTotal(ArrayList<Hardware> a){
        for (int i=0;i<a.size();i++) {
            inventory.add(a.get(i));
        }  
    }
    
    /**
     * sorts an array list of objects
     * @param arr - the array list to sort
     * @return - the sorted array list
     */
    public static ArrayList<Hardware> mergeSortA(ArrayList<Hardware> arr){
        ArrayList<Hardware> l,r,merge;
        int lSize,rSize,midPoint,index;
        //base case
        if(arr.size()<=1){
            return arr;
        }else{
            //find the mid point of the array
            midPoint=(arr.size()-1)/2;
            //get the left size
            lSize=midPoint+1;
            //check if the array has an even amount of items
            if(arr.size()%2==0){
                rSize=midPoint+1;
            }else{
                rSize=midPoint;
            }
            l=new ArrayList(lSize);
            r=new ArrayList(rSize);
            //populate arrays
            for(int i=0;i<l.size();i++){
                l.add(arr.get(i));
            }
            index=midPoint+1;
            for(int i=0;i<r.size();i++){
                r.add(arr.get(index));
                index++;
            }
            //
            l=mergeSortA(l);
            r=mergeSortA(r);
            
            merge=mergeA(l,r);
            return merge;
        }
    }
    
    /**
     * merges 2 array lists/partitions together
     * @param l - first array list/partition
     * @param r - second array list/partition
     * @return - returns the merged list
     */
    public static ArrayList<Hardware> mergeA(ArrayList<Hardware> l,ArrayList<Hardware> r){
        int length=l.size()+r.size();
        ArrayList<Hardware> merge = new ArrayList(); 
        int iL=0,iR=0,iM=0;
        while(iL<l.size()&&iR<r.size()){
            //if the left value is less than the right
            if(l.get(iL).getAssetNumber()<r.get(iR).getAssetNumber()){
                merge.add(l.get(iL));//add left value to the array
                iL++;
            }else{
                merge.add(r.get(iR));
                iR++;
            }
            iM++;
        }
        while(iL<l.size()){
            merge.add(l.get(iL));
            iL++;
            iM++;
        }
        while(iR<r.size()){
            merge.add(r.get(iR));
            iR++;
            iM++;
        }
        return merge;
    }
    
    /**
     * @return - gets and returns inventory array list
     */
    public static ArrayList<Hardware> getInventory() {
        return inventory;
    }
    
    /**
     * @return - gets and returns monitors array list
     */
    public static ArrayList<Hardware> getMonitors() {
        return monitors;
    }
    
    /**
     * @return - gets and returns firewalls array list
     */
    public static ArrayList<Hardware> getFirewalls() {
        return firewalls;
    }
    
    /**
     * @return - gets and returns desktops array list
     */
    public static ArrayList<Hardware> getDesktops() {
        return desktops;
    }
    
    /**
     * @return - gets and returns laptops array list
     */
    public static ArrayList<Hardware> getLaptops() {
        return laptops;
    }
    
    /**
     * @return - gets and returns network switches array list
     */
    public static ArrayList<Hardware> getNetworkSwitch() {
        return networkSwitch;
    }
    
    /**
     * @return - gets and returns fiber switch array list
     */
    public static ArrayList<Hardware> getFiberSwitch() {
        return fiberSwitch;
    }
    
    /**
     * @return - gets and returns printers array list
     */
    public static ArrayList<Hardware> getPrinters() {
        return printers;
    }
    
    /**
     * @return - gets and returns san array list
     */
    public static ArrayList<Hardware> getSan() {
        return san;
    }
    
    /**
     * @return - gets and returns scanners array list
     */
    public static ArrayList<Hardware> getScanners() {
        return scanners;
    }
    
    /**
     * @return - gets and returns servers array list
     */
    public static ArrayList<Hardware> getServers() {
        return servers;
    }
    
    /**
     * @return - gets and returns tape drive array list
     */
    public static ArrayList<Hardware> getTapeDrive() {
        return tapeDrive;
    }
    
    /**
     * @return - gets and returns thin client array list
     */
    public static ArrayList<Hardware> getThinClients() {
        return thinClients;
    }
    
    /**
     * @return - gets and returns time clock array list
     */
    public static ArrayList<Hardware> getTimeClocks() {
        return timeClock;
    }
    
    /**
     * @return - gets and returns ups array list
     */
    public static ArrayList<Hardware> getUps() {
        return ups;
    }
    
    /**
     * @return - gets and returns wap array list
     */
    public static ArrayList<Hardware> getWap() {
        return waps;
    }
    
    /**
     * Creates new form EasyTrack
     */
    public EasyTrackMainMenu() {
        initComponents();
        
        //ignore unkown properties
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            // files that are read from at start from save folder beside .jar file
            FileInputStream monitorsIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/monitors.json");
            FileInputStream firewallsIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/firewalls.json");
            FileInputStream desktopsIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/desktops.json");
            FileInputStream laptopsIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/laptops.json");
            FileInputStream networkSwitchIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/networkSwitch.json");
            FileInputStream fiberSwitchIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/fiberSwitch.json");
            FileInputStream printersIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/printers.json");
            FileInputStream sanIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/san.json");
            FileInputStream scannerIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/scanners.json");
            FileInputStream serverIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/servers.json");
            FileInputStream tapeDriveIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/tapeDrive.json");
            FileInputStream thinClientIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/thinclients.json");
            FileInputStream timeClockIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/timeclock.json");
            FileInputStream upsIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/ups.json");
            FileInputStream wapIn = new FileInputStream(System.getProperty("user.dir") + "/EasyTrackSaves/waps.json");

            // Read JSON file and map/convert to Java class
            Hardware[] monitorsArray = objectMapper.readValue(monitorsIn, Monitor[].class);
            Hardware[] firewallsArray = objectMapper.readValue(firewallsIn,FireWall[].class);
            Hardware[] desktopsArray = objectMapper.readValue(desktopsIn,Desktop[].class);
            Hardware[] laptopsArray = objectMapper.readValue(laptopsIn,Laptop[].class);
            Hardware[] networkSwitchArray = objectMapper.readValue(networkSwitchIn,NetworkSwitch[].class);
            Hardware[] fiberSwitchArray = objectMapper.readValue(fiberSwitchIn, FiberSwitch[].class);
            Hardware[] printersArray = objectMapper.readValue(printersIn,Printer[].class);
            Hardware[] sanArray = objectMapper.readValue(sanIn,SAN[].class);
            Hardware[] scannersArray = objectMapper.readValue(scannerIn,Scanner[].class);
            Hardware[] serversArray = objectMapper.readValue(serverIn,Server[].class);
            Hardware[] tapeDriveArray = objectMapper.readValue(tapeDriveIn,TapeDrive[].class);
            Hardware[] thinClientArray = objectMapper.readValue(thinClientIn,ThinClient[].class);
            Hardware[] timeClockArray = objectMapper.readValue(timeClockIn,TimeClock[].class);
            Hardware[] upsArray = objectMapper.readValue(upsIn,UPS[].class);
            Hardware[] wapArray = objectMapper.readValue(wapIn,WAP[].class);
            
            //add types to their respective array lists and the inventory
            arrayList(monitorsArray,monitors);
            addToTotal(monitors);
            arrayList(firewallsArray,firewalls);
            addToTotal(firewalls);
            arrayList(desktopsArray,desktops);
            addToTotal(desktops);
            arrayList(laptopsArray,laptops);
            addToTotal(laptops);
            arrayList(networkSwitchArray,networkSwitch);
            addToTotal(networkSwitch);
            arrayList(fiberSwitchArray,fiberSwitch);
            addToTotal(fiberSwitch);
            arrayList(printersArray,printers);
            addToTotal(printers);
            arrayList(sanArray,san);
            addToTotal(san);
            arrayList(scannersArray,scanners);
            addToTotal(scanners);
            arrayList(serversArray,servers);
            addToTotal(servers);
            arrayList(tapeDriveArray,tapeDrive);
            addToTotal(tapeDrive);
            arrayList(thinClientArray,thinClients);
            addToTotal(thinClients);
            arrayList(timeClockArray,timeClock);
            addToTotal(timeClock);
            arrayList(upsArray,ups);
            addToTotal(ups);
            arrayList(wapArray,waps);
            addToTotal(waps);
            
            //sort full inventory array
            //inventory = mergeSortA(inventory);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("EasyTrack");

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addButton.setText("Add to Inventory");
        addButton.setName(""); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        RemoveButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RemoveButton.setText("Remove from Inventory");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        viewButton.setText("View Inventory");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchButton.setText("Search Inventory");
        searchButton.setActionCommand("jButton4");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("By: Eric Donner and Felix Hexemer");

        exitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitButton.setText("Exit EasyTrack");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(488, 488, 488)
                                .addComponent(searchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(498, 498, 498)
                                .addComponent(viewButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addButton)
                    .addComponent(jLabel1))
                .addGap(500, 500, 500))
            .addGroup(layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(RemoveButton)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(39, 39, 39)
                        .addComponent(RemoveButton)
                        .addGap(50, 50, 50)
                        .addComponent(viewButton)
                        .addGap(55, 55, 55)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // go to add window
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (EasyTrackAdd == null) {
            EasyTrackAdd = new EasyTrackAdd(this);
        }
        
        EasyTrackAdd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    // go to remove window
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        if (EasyTrackRemove == null) {
            EasyTrackRemove = new EasyTrackRemove(this);
        }
        
        EasyTrackRemove.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RemoveButtonActionPerformed

    // go to view window
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        if (EasyTrackView == null) {
            EasyTrackView = new EasyTrackView(this);
        }
        
        EasyTrackView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewButtonActionPerformed

    // go to search window
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (EasyTrackSearch == null) {
            EasyTrackSearch = new EasyTrackSearch(this);
        }
        
        EasyTrackSearch.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchButtonActionPerformed

    // exit EasyTrack
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // when user wants to exit program and clicks exit button
        // take data from array lists and convert into json files to be read from next program startup
        try {
            // files that are written to inside save folder
            FileOutputStream monitorsOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/monitors.json");
            FileOutputStream firewallsOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/firewalls.json");
            FileOutputStream desktopsOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/desktops.json");
            FileOutputStream laptopsOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/laptops.json");
            FileOutputStream networkSwitchOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/networkSwitch.json");
            FileOutputStream fiberSwitchOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/fiberSwitch.json");
            FileOutputStream printersOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/printers.json");
            FileOutputStream sanOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/san.json");
            FileOutputStream scannerOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/scanners.json");
            FileOutputStream serverOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/servers.json");
            FileOutputStream tapeDriveOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/tapeDrive.json");
            FileOutputStream thinClientOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/thinclients.json");
            FileOutputStream timeClockOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/timeclock.json");
            FileOutputStream upsOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/ups.json");
            FileOutputStream wapOut = new FileOutputStream(System.getProperty("user.dir") + "/EasyTrackSaves/waps.json");
            
            objectMapper.writeValue(monitorsOut, monitors);
            objectMapper.writeValue(firewallsOut, firewalls);
            objectMapper.writeValue(desktopsOut, desktops);
            objectMapper.writeValue(laptopsOut, laptops);
            objectMapper.writeValue(networkSwitchOut, networkSwitch);
            objectMapper.writeValue(fiberSwitchOut, fiberSwitch);
            objectMapper.writeValue(printersOut, printers);
            objectMapper.writeValue(sanOut, san);
            objectMapper.writeValue(scannerOut, scanners);
            objectMapper.writeValue(serverOut, servers);
            objectMapper.writeValue(tapeDriveOut, tapeDrive);
            objectMapper.writeValue(thinClientOut, thinClients);
            objectMapper.writeValue(timeClockOut, timeClock);
            objectMapper.writeValue(upsOut, ups);
            objectMapper.writeValue(wapOut, waps);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        // exit the program
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EasyTrackMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasyTrackMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasyTrackMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasyTrackMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasyTrackMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}