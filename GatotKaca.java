/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Rino
 */
public class GatotKaca extends SuperHero{

    @Override
    public void ultimate() {
        System.out.println("Ultimate : Membanting");
    }

    @Override
    public void defence() {
        System.out.println("Defence : Tangkis");
    }

    @Override
    public void dead() {
        System.out.println("Kematian : Teriak");
    }
    
}
