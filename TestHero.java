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
public class TestHero {
    public static void main(String[] args) {
        GatotKaca gatotKaca=new GatotKaca();
        System.out.println("Data Hero Gatot Kaca ");
        gatotKaca.ultimate();
        gatotKaca.defence();
        gatotKaca.dead();
        System.out.println("=======================");
        Gord gord=new Gord();
        System.out.println("Data Hero Gord ");
        gord.ultimate();
        gord.defence();
        gord.dead();
    }
}
