/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author adams
 */
public class HewanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing myCat = new Kucing("Kucing", "Suaraku adalah : rrwwwwrrr Meong Meong");
        Anjing myDog = new Anjing("Anjing", "Suaraku adalah : Guk Guk");
        Anjing myDog1 = new Anjing("Anjing", "Suaraku adalah : Pinjam dulu seratus");
        
        System.out.println(myCat.getDetails());
        System.out.println(myCat.bersuara());
        
        System.out.println("\n");
        
        System.out.println(myDog.getDetails());
        System.out.println(myDog.bersuara());
        
        System.out.println("\n");
        
        System.out.println(myDog1.getDetails());
        System.out.println(myDog1.bersuara());
    }
    
}
