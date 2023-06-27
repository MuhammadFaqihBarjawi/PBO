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
public class dataSetPegawai {
    private ArrayList<String> nama;
    private ArrayList<String> kode;
    private ArrayList<String> alamat;
    private ArrayList<String> tempat;
    private ArrayList<String> tanggal;
    private ArrayList<String> agama;
    private ArrayList<String> jk;
    private ArrayList<String> status;
    private ArrayList<String> telp;

public dataSetPegawai(){
        nama = new ArrayList<>();
        kode = new ArrayList<>();
        alamat = new ArrayList<>();
        tempat = new ArrayList<>();
        tanggal= new ArrayList<>();
        agama= new ArrayList<>();
        jk = new ArrayList<>();
        status= new ArrayList<>();
        telp = new ArrayList<>();
    }
    
    public void addNama_Pegawai (String value){
        nama.add(value);
    }
    
    public ArrayList<String> getDataNama_Pegawai(){
        return this.nama;
    }

    public void addKD_Pegawai (String value){
        kode.add(value);
    }
    
    public ArrayList<String> getDataKD_Pegawai(){
        return this.kode;
    }

        public void addAlamat (String value){
        alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
        public void addTempat_Lahir (String value){
        tempat.add(value);
    }
    
    public ArrayList<String> getDataTempat_Lahir(){
        return this.tempat;
    }
    
        public void addTanggal_Lahir (String value){
        tanggal.add(value);
    }
    
    public ArrayList<String> getDataTanggal_Lahir(){
        return this.tanggal;
    }
    
        public void addAgama (String value){
        agama.add(value);
    }
    
    public ArrayList<String> getDataAgama(){
        return this.agama;
    }
    
        public void addJenis_Kelamin (String value){
        jk.add(value);
    }
    
    public ArrayList<String> getDataJenis_Kelamin(){
        return this.jk;
    }
    
        public void addStatus (String value){
        status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    
        public void addNo_Telp (String value){
        telp.add(value);
    }
    
    public ArrayList<String> getDataNo_Telp(){
        return this.telp;
    }
}