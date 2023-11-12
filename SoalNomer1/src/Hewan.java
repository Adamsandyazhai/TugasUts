/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adams
 */
public class Hewan {
    private String jenisHewan;
    String namaHewan, jenisSuara;
    
    protected String isMamalia(){
        if(namaHewan == "Kucing"){
            jenisHewan = "Mamalia";
        }else if(namaHewan == "Anjing"){
            jenisHewan = "Mamalia";
        }
        
        return jenisHewan;
    }
    
    public String getDetails(){
        return "Hewan Kamu Adalah ";
    }
}

