/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author adams
 */
public class Anjing extends Hewan {
    public Anjing(String hewan, String Suara){
        namaHewan = hewan;
        jenisSuara = Suara;
    }
    
    protected String bersuara(){
        return jenisSuara;
    }
    
    public String getDetails(){
        return super.getDetails() + namaHewan + " termasuk jenis hewan " + isMamalia();
    }
}
