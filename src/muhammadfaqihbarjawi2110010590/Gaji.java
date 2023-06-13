/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadfaqihbarjawi2110010590;

/**
 *
 * @author faqih
 */
public class Gaji {
    private String id, kode,  tgl;
    private int slip;
    private int gaji;
    private int lembur;
    private int anak;
    private int hadir;
    private int pendapatan;
    private int potongan;
    
public Gaji () {}

public void setIdUser(String id){
        this.id=id;
    }
    
    public String getIdUser(){
        return this.id;
    }
    public void setKD_Pgwi(String kode){
        this.kode=kode;
    }
    
    public String getKD_Pgwi(){
        return this.kode;
    }
    
    
     public void setTanggal(String tanggal){
        this.tgl=tgl;
    }
    
    public String Tanggal(){
        return this.tgl;
    }
}
