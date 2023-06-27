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
public class dataSetGolongan {
    private ArrayList<String> kode;
    private ArrayList<String> kod;
    private ArrayList<String> tun;
    private ArrayList<String> tunj;
    private ArrayList<String> makan;


public dataSetGolongan(){
        kod = new ArrayList<>();
        kode = new ArrayList<>();
        tun = new ArrayList<>();
        tunj = new ArrayList<>();
        makan = new ArrayList<>();
    }
    
    public void addKD_Pegawai (String value) {
        kod.add(value);
    }
    
    public ArrayList<String> getDataKD_Pegawai (){
        return this.kod;
    }
    
    public void addKD_Golongan (String value){
        kode.add(value);
    }
    
    public ArrayList<String> getDataKD_Golongan(){
        return this.kode;
    }

    public void addTunjangan_Suami_Istri (String value){
        tun.add(value);
    }
    
    public ArrayList<String> getDataTunjangan_Suami_Istri(){
        return this.tun;
    }

    public void addTunjangan_Anak (String value){
        tunj.add(value);
    }
    
    public ArrayList<String> getDataTunjangan_Anak(){
        return this.tunj;
    }

    public void addUang_Makan (String value){
        makan.add(value);
    }
    
    public ArrayList<String> getDataUang_Makan(){
        return this.makan;
    }
}