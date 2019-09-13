/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

/**
 *
 * @author sherif.matar
 */
public class Medicine {
    Integer ID;
    String Name;
    String Type;
    String Location;
    Integer NumberOfBoxes;
    boolean PurchaseOrderIssued;
    public Medicine(int ID, String Name, String Type, String Location, int NumberOfBoxes, boolean PurchaseOrderIssued){
        this.ID = ID;
        this.Name = Name;
        this.Type = Type;
        this.Location = Location;
        this.ID = ID;
        this.NumberOfBoxes = NumberOfBoxes;
        this.PurchaseOrderIssued = PurchaseOrderIssued;
    }
    @Override
    public String toString(){
        return "ID: " + ID + ", Name: " + Name + ", Type: " + Type + ", Location: " + Location + ", NumberOfBoxes: " +  NumberOfBoxes;
    }
}
