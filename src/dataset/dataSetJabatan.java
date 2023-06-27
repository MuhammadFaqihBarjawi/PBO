package dataset;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author faqih
 */
public class dataSetJabatan {
    private ArrayList<String> kode;
    private ArrayList<String> kod;
    private ArrayList<String> nama;
    private ArrayList<String> gaji;
    private ArrayList<String> tunjangan;


public dataSetJabatan(){
        kode = new ArrayList<>();
        kod = new ArrayList<>();
        nama = new ArrayList<>();
        gaji = new ArrayList<>();
        tunjangan = new ArrayList<>();
    }
    
    public void addKD_Jabatan (String value){
        kode.add(value);
    }
    
    public ArrayList<String> getDataKD_Jabatan(){
        return this.kode;
    }
    
    public void addKD_Pegawai (String value){
        kod.add(value);
    }
    
    public ArrayList<String> getDataKD_Pegawai(){
        return this.kod;
    }

    public void addNama_Jabatan (String value){
        nama.add(value);
    }
    
    public ArrayList<String> getDataNama_Jabatan(){
        return this.nama;
    }

    public void addGaji_Pokok (String value){
        gaji.add(value);
    }
    
    public ArrayList<String> getDataGaji_Pokok(){
        return this.gaji;
    }

    public void addTunjangan_Pokok (String value){
        tunjangan.add(value);
    }
    
    public ArrayList<String> getDataTunjangan_Pokok(){
        return this.tunjangan;
    }
}