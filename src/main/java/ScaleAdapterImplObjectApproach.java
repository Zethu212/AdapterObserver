/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NTLAHLA W
 */
public class ScaleAdapterImplObjectApproach extends Socket implements ScaleAdapter {
    
     public Socket sock = new Socket();
    private final double weight;

    public ScaleAdapterImplObjectApproach(double wdv) {
         this.weight = wdv; 
    }
    
    @Override
    public Weight getKgsWeight(){
    return sock.getWeight();    
}

    @Override
    public Weight getTnsWeight(){
    Weight wdv = sock.getWeight();
    return convertWeight(wdv,1000);
}
    

    @Override
    public Weight getLbsWeight() {
        Weight wdv = sock.getWeight();
        return convertWeight(wdv,0.45359237); 
    }
    
    private Weight convertWeight(Weight w, double wdv){
        Weight wd;
        wd = sock.getWeight();
        return new Weight(w.getWeight()*wdv);
    
    }
}