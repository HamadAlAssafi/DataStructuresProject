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
public class MedicinesPriceManufacturer {
    String MedicineName;
    Double Price;
    String ManufactureName;
    public MedicinesPriceManufacturer(String MedicineName, Double Price, String ManufactureName){
        this.MedicineName = MedicineName;
        this.Price = Price;
        this.ManufactureName = ManufactureName;
    }
    @Override
    public String toString(){
        return "MedicineName: " + MedicineName + ", Price: " + Price + ", ManufactureName: " + ManufactureName;
    }
}
