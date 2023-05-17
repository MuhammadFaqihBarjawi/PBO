/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadfaqihbarjawi2110010590;

/**
 *
 * @author faqih
 */
public class MenuGaji {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
   
       User obj = new User();
        obj.setIdUser("2110010590");
        obj.setName("Faqih");
        obj.setUsername("Faqih211");
        obj.setLevel("Admin");
        System.out.println("\n ID User : 2110010590 "+obj.getIdUser()+"\n Name : Muhammad Faqih Barjawi "+obj.getName()+"\n Username : Faqih211 " +obj.getUsername()+"\n Level : Admin "+obj.getLevel());
    
   }
   
}
