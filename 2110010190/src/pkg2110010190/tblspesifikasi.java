/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010190;

/**
 *
 * @author Asus
 */
public class tblspesifikasi {
    private int id_spek;
    private String id_mobil;
    private String  warna;
    private String jenis_mesin;
    private String silinder;
    private String katup;
    private String isi_silinder;
    private String kompresi;
    private String daya_maksimum;
    private String bahanbakar;
    private String kemudi;
    private String ban;
    private String duduk;
    private String tangki;
    private String panjang;
    private String lebar;
    private String tinggi;
    private String rpm;
    
    
public int getId_spek() {
        return id_spek;
    }

    public void setId_spek(int id_spek) {
        this.id_spek = id_spek;
    }

    public String getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(String id_mobil) {
        this.id_mobil = id_mobil;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenis_mesin() {
        return jenis_mesin;
    }

    public void setJenis_mesin(String jenis_mesin) {
        this.jenis_mesin = jenis_mesin;
    }

    public String getSilinder() {
        return silinder;
    }

    public void setSilinder(String silinder) {
        this.silinder = silinder;
    }

    public String getKatup() {
        return katup;
    }

    public  tblspesifikasi(int id_spek, String id_mobil, String warna, String jenis_mesin, String silinder,
            String katup, String isi_silinder, String kompresi, String daya_maksimum, String bahanbakar,
            String kemudi, String ban, String duduk, String tangki, String panjang, String lebar,
            String tinggi, String rpm) {
        this.id_spek = id_spek;
        this.id_mobil = id_mobil;
        this.warna = warna;
        this.jenis_mesin = jenis_mesin;
        this.silinder = silinder;
        this.katup = katup;
        this.isi_silinder = isi_silinder;
        this.kompresi = kompresi;
        this.daya_maksimum = daya_maksimum;
        this.bahanbakar = bahanbakar;
        this.kemudi = kemudi;
        this.ban = ban;
        this.duduk = duduk;
        this.tangki = tangki;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.rpm = rpm;
    }

    // Getter and Setter methods
    // ...

    // Other methods
    // ...
}