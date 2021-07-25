/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NTLAHLA W
 */
public class Weight {
    public static double vght;
    private double weight;
    public Weight(double w){
        this.weight = w;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setvght(double wdv){
        this.weight = wdv;
    }
    
    public double getMass(){
       return weight;
    }
    
    public void setMass(double wdv){
        Weight.vght = wdv;
    }
    
}
