package dataset;

import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aldinara
 */
public class dataSetGaji {
    private ArrayList<String> kode;
    private ArrayList<String> tgl;
    private ArrayList<String> noslip;
    private ArrayList<String> gaji;
    private ArrayList<String> anak;
    private ArrayList<String> hadir;


    
    public dataSetGaji(){
        kode = new ArrayList<>();
        tgl = new ArrayList<>();
        noslip = new ArrayList<>();
        gaji = new ArrayList<>();
        anak = new ArrayList<>();
        hadir = new ArrayList<>();
    }
    

    public void addKD_Pgwi (String value){
        kode.add(value);
    }
    
    public ArrayList<String> getDataKD_Pgwi(){
        return this.kode;
    }
    
    public void addTanggal(String value){
        tgl.add(value);
    }
    
    public ArrayList<String> getDataTanggal(){
        return this.tgl;
    }
    
    public void addNo_Slip(String value){
        noslip.add(value);
    }
    
    public ArrayList<String> getDataNo_Slip(){
        return this.noslip;
    }
    
    public void addGaji_Bersih(String value){
        gaji.add(value);
    }
    
    public ArrayList<String> getDataGaji_Bersih(){
        return this.gaji;
    }
    
    public void addJumlah_Anak(String value){
        anak.add(value);
    }
    
    public ArrayList<String> getDataJumlah_Anak(){
        return this.anak;
    }
    
    public void addJumlah_Hadir(String value){
        hadir.add(value);
    }

    public ArrayList<String> getDataJumlah_Hadir(){
        return this.hadir;
    }
    

}
