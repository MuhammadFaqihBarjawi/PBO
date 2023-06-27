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
public class dataSetUser {
    private ArrayList<String> nip;
    private ArrayList<String> nama;
    private ArrayList<String> username;

public dataSetUser(){
        nip = new ArrayList<>();
        nama = new ArrayList<>();
        username= new ArrayList<>();

    }
    
    public void addNIP (String value){
        nip.add(value);
    }
    
    public ArrayList<String> getDataNIP(){
        return this.nip;
    }

    public void addNama (String value){
        nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }

    public void addUsername (String value){
        username.add(value);
    }
    
    public ArrayList<String> getDataUsername(){
        return this.username;
    }

}