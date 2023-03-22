/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author HP
 */
public class PersegiPanjang implements Bidang {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //Encapsulation
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
     public double getPanjang() {
        return panjang;
    }
  
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getLebar() {
        return lebar;
    }

    @Override
    public double menghitungLuas() {
        return panjang*lebar;}

    @Override
    public double menghitungKeliling() {
        return 2*(panjang+lebar);
    }
    
}
