/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadfaqihbarjawi2110010590;

/**
 *
 * @author faqih
 */
public class User {
    private String id, name, user, level;
    
public User () {}

public void setIdUser(String id){
        this.id=id;
    }
    
    public String getIdUser(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setUsername(String user){
        this.user=user;
    }
    
    public String getUsername(){
        return this.user;
    }
    
    public void setLevel(String level){
        this.level=level;
    }
    
    public String getLevel(){
        return this.level;
    }
}
