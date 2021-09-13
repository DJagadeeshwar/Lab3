/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicshopexampl;

/**
 *
 * @author S545702
 */
public class musicshop {
    private String title;
    private String artist;
    
   public musicshop(String title, String artist){
       this.title = title;
       this.artist = artist;
   }
   public musicshop(){
       
   }
   public String gettitle(){
       return title;
   }
   public String getartist(){
       return artist;
   }
   public void settitle(){
       this.title = title;
   }
   public void setartist(){
       this.artist = artist;
   }
   public String toString(){
       return "Title" + title + "artist" + artist;
   }
   
}
