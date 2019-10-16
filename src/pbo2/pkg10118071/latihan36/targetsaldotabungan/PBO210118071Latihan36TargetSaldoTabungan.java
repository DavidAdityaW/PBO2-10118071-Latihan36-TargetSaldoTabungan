/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan36.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     perhitungan target saldo tabungan   
 * 
 */
public class PBO210118071Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Saldo objSaldo = new Saldo();
        objSaldo.setSaldoAwal(3500000);
        objSaldo.setBunga(8);
        objSaldo.setSaldoTarget(6000000);
        
        System.out.println(objSaldo.hitungSaldo());  
    }
    
}
