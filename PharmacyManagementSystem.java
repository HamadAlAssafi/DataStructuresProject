/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author sherif.matar
 */
public class PharmacyManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BST<Integer, Medicine> Medicines = new BST<Integer, Medicine>();
        DoublyLinkedList<MedicinesPriceManufacturer> MedicinesPricesAndManufacturers = new DoublyLinkedList<MedicinesPriceManufacturer>();
        SortedArrayDeliveryNote IncomingStocks = new SortedArrayDeliveryNote();
        Queue<Prescription> Prescriptions = new Queue<Prescription>();
        PriorityQueue<Integer, DeliveryVoucher> InHouseDelivery = new PriorityQueue<Integer, DeliveryVoucher>();
        
        //////////////////////////////////////////
        //////////    Load Data   ////////////////
        //////////////////////////////////////////
        String FileName = "C:\\PharmacyManagementSystem.txt";         
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(FileName);
            br = new BufferedReader(fr); 
            String Record; 
            if((Record = br.readLine()) != null){
                while(!Record.equals("End") && Record != null){
                    String[] Items = Record.split(" ");
                    Medicines.insert(new Integer(Items[0]), new Medicine(new Integer(Items[0]), Items[1], Items[2], Items[3], new Integer(Items[4]), false));
                    Record = br.readLine();
                }                
                if(Record.equals("End"))
                    Record = br.readLine();
                while(!Record.equals("End") && Record != null){
                    String[] Items = Record.split(" ");
                    MedicinesPricesAndManufacturers.add(new MedicinesPriceManufacturer(Items[0], new Double(Items[1]), Items[2]));
                    Record = br.readLine();
                }                
                if(Record.equals("End"))
                    Record = br.readLine();
                while(!Record.equals("End") && Record != null){
                    String[] Items = Record.split(" ");
                    IncomingStocks.add(new DeliveryNote(new Integer(Items[0]), Items[1]));
                    Record = br.readLine();
                }                
                if(Record.equals("End"))
                    Record = br.readLine();
                while(!Record.equals("End") && Record != null){
                    String[] Items = Record.split(" ");
                    Prescriptions.enQueue(new Prescription(new Integer(Items[0]), Items[1], new Integer(Items[2]), Items[3]));
                    Record = br.readLine();
                }                
                if(Record.equals("End"))
                    Record = br.readLine();
                while(!Record.equals("End") && Record != null){
                    String[] Items = Record.split(" ");
                    InHouseDelivery.enQueue(new Integer(Items[0]), new DeliveryVoucher(new Integer(Items[0]), new Integer(Items[1]), Items[2]));
                    Record = br.readLine();
                }                
            }  
        } catch (Exception ex) {
        }finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (Exception ex) {
            }
        }     
                
        //////////////////////////////////////////
        //////////    Show Data   ////////////////
        //////////////////////////////////////////        
        System.out.println("Medicines:-");
        System.out.println(Medicines.toString());
        System.out.println("Medicines Prices And Manufacturers:-");
        System.out.println(MedicinesPricesAndManufacturers.toString());
        System.out.println("Incoming Stocks:-");
        System.out.println(IncomingStocks.toString());
        System.out.println("Prescriptions:-");
        while(!Prescriptions.isEmpty())
            System.out.println(Prescriptions.deQueue().toString());
        System.out.println();
        System.out.println("In House Delivery:-");
        while(!InHouseDelivery.isEmpty())
            System.out.println(InHouseDelivery.deQueue().toString());
    }    
}
