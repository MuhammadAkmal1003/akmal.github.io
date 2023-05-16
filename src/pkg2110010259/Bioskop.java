/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010259;

/**
 *
 * @author mal
 */
public class Bioskop {
    public static void main(String[] args){
        
    }
    private String kodeBioskop;
    private String namaBioskop;
    private String kota;
    private String studio;
    private String alamat;

    public Bioskop(String kodeBioskop, String namaBioskop, String kota, String studio, String alamat) {
        this.kodeBioskop = kodeBioskop;
        this.namaBioskop = namaBioskop;
        this.kota = kota;
        this.studio = studio;
        this.alamat = alamat;
    }

    public String getKodeBioskop() {
        return kodeBioskop;
    }

    public String getNamaBioskop() {
        return namaBioskop;
    }

    public String getKota() {
        return kota;
    }

    public String getStudio() {
        return studio;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setKodeBioskop(String kodeBioskop) {
        this.kodeBioskop = kodeBioskop;
    }

    public void setNamaBioskop(String namaBioskop) {
        this.namaBioskop = namaBioskop;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
