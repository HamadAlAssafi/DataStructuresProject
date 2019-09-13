/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.util.Arrays;

/**
 *
 * @author sherif.matar
 */
public class SortedArrayDeliveryNote{
    DeliveryNote[] Records;
    int count;
    public SortedArrayDeliveryNote(){
        Records = new DeliveryNote[10];
        count = 0;
    }
    public void add(DeliveryNote newEntry){
        int indx = 0;
        while(indx < count && newEntry.GetDeliveryNumber() >= Records[indx].GetDeliveryNumber()){
            indx ++;
        }
        for(int i = count; i > indx; i--){
            Records[i] = Records[i - 1];
        }
        Records[indx] = newEntry;
        count ++;
        if(Records.length == count)
            Records = Arrays.copyOf(Records, Records.length * 2);
    }
    public DeliveryNote getAt(int givenPosition){
        if(givenPosition >= count)
            return null;
        return Records[givenPosition];
    }
    public DeliveryNote get(Integer DeliveryNumber){  
        int s = 0, e = size() -1; 
        while (s <= e) { 
            int m = s + (e - s) / 2; 
            if (Records[m].GetDeliveryNumber().compareTo(DeliveryNumber) == 0) 
                return getAt(m); 
            if (Records[m].GetDeliveryNumber() < DeliveryNumber) 
                s = m + 1;   
            else
                e = m - 1; 
        } 
        return null; 
    }
    public int size(){
        return count;
    }
    @Override
    public String toString(){
        String res = "";
        for (int i = 0; i < count; i++) {
            res += Records[i].toString() + System.lineSeparator();
        }
        return res;
    }
}
