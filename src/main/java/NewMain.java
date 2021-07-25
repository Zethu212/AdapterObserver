
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NTLAHLA W
 */
import java.util.*;
public class NewMain {
    
     private static Weight getWeight(ScaleAdapter sclAdapter, double i) {
        if (i==1) {return sclAdapter.getKgsWeight();}
        if (i==0.45359237) {return sclAdapter.getLbsWeight();}
        if (i==1000) {return sclAdapter.getTnsWeight();}
        return sclAdapter.getKgsWeight();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of the weight to convert : ");
    double wdv = scan.nextDouble();
    ScaleAdapter sclAdapter = new ScaleAdapterImplObjectApproach(wdv);
    Weight fromKgs2Kgs = getWeight(sclAdapter,1);
    Weight fromLbs2Kgs = getWeight(sclAdapter,0.45359237);
    Weight fromTns2Kgs = getWeight(sclAdapter,1000);
    String wsv = "Converting " + Double.toString(wdv) + " "; 
    System.out.println(wsv + "Kgs to Kgs : " + fromKgs2Kgs.getMass() + " Kgs");
    System.out.println(wsv + "Lbs to Kgs : " + fromLbs2Kgs.getMass() + " Kgs");
    System.out.println(wsv + "tns to Kgs : " + fromTns2Kgs.getMass() + " Kgs");
         
    
        // TODO code application logic here
    }
    
}
