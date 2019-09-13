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
public class DeliveryVoucher{
    Integer PriorityNumber;
    Integer VoucherNumber;
    String DeliveryInformation;
    public DeliveryVoucher(Integer PriorityNumber, Integer VoucherNumber, String DeliveryInformation){
        this.PriorityNumber = PriorityNumber;
        this.VoucherNumber = VoucherNumber;
        this.DeliveryInformation = DeliveryInformation;
    }
    @Override
     public String toString(){
        return "PriorityNumber: " + PriorityNumber + ", VoucherNumber: " + VoucherNumber + ", DeliveryInformation: " + DeliveryInformation;
    }
}
