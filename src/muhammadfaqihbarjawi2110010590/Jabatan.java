/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadfaqihbarjawi2110010590;

/**
 *
 * @author faqih
 */
public class Jabatan {
    private String kode, nama, gaji, tunjangan;
    
public Jabatan () {}

public void setKD_Jabatan(String kode){
        this.kode=kode;
    }
    
    public String getKD_Jabatan(){
        return this.kode;
    }
    public void setNama_Jabatan(String nama){
        this.nama=nama;
    }
    
    public String getNama_Jabatan(){
        return this.nama;
    }
    
    public void setGaji_Pokok(String gaji){
        this.gaji=gaji;
    }
    
    public String getGaji_Pokok(){
        return this.gaji;
    }
    
    public void setTunjangan_Pokok(String tunjangan){
        this.tunjangan=tunjangan;
    }
    
    public String getTunjangan_Pokok(){
        return this.tunjangan;
    }
    
}
