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
public class Saldo {
    private int saldoAwal;
    private int saldoTarget;
    private int bunga;
    private int saldo;
    

    public int getSaldoAwal() {
        return saldoAwal;
    }

    public void setSaldoAwal(int saldoAwal) {
        this.saldoAwal = saldoAwal;
    }

    public int getSaldoTarget() {
        return saldoTarget;
    }

    public void setSaldoTarget(int saldoTarget) {
        this.saldoTarget = saldoTarget;
    }

    public int getBunga() {
        return bunga;
    }

    public void setBunga(int bunga) {
        this.bunga = bunga;
    }
    
    public int hitungSaldo() {
        saldo = saldoAwal;
        int i = 1;
        
        while (saldo < saldoTarget) {
            saldo = (saldo * bunga / 100) + saldo;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldo);
            i++;
        }
        return saldo;
    }
}
