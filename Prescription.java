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
public class Prescription {
    Integer PatientId;
    String MedicineName;
    Integer NumberOfBoxes;
    String Dosage;
    public Prescription(Integer PatientId, String MedicineName, Integer NumberOfBoxes, String Dosage){
        this.PatientId = PatientId;
        this.MedicineName = MedicineName;
        this.NumberOfBoxes = NumberOfBoxes;
        this.Dosage = Dosage;
    }
    @Override
    public String toString(){
        return "PatientId: " + PatientId + ", MedicineName: " + MedicineName + ", NumberOfBoxes: " + NumberOfBoxes + ", Dosage: " + Dosage;
    }
}
