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
public class DeliveryNote 
{
    Integer DeliveryNumber;
    String PackageInformation;
    public DeliveryNote(Integer DeliveryNumber, String PackageInformation){
        this.DeliveryNumber = DeliveryNumber;
        this.PackageInformation = PackageInformation;
    }
    public Integer GetDeliveryNumber(){
        return DeliveryNumber;
    }
    @Override
    public String toString(){
        return "DeliveryNumber: " + DeliveryNumber + ", PackageInformation: " + PackageInformation;
    }  
}
