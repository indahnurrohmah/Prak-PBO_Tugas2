/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.PersegiPanjang;
/**
 *
 * @author HP
 */
public class Balok extends PersegiPanjang implements Ruang  {
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    //Encapsulation
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double menghitungLuasPermukaan() {
         return 2*(super.menghitungLuas()+(super.getPanjang()*tinggi)+(super.getLebar()*tinggi));
    }

    @Override
    public double menghitungVolume() {    
        return super.menghitungLuas()* tinggi;
    }    
}
