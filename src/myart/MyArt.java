/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myart;

import utils.DataSource;
import entite.Article;
import entite.Galerie;
import entite.Commande;
import entite.Panier;
import entite.User;
import service.ServiceArticle;
import service.ServiceGalerie;
import service.UserService;
/**
 *
 * @author rania
 */
public class MyArt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        DataSource ds1 =DataSource.getInstance();
//          System.out.println(ds1);
      Galerie g =new Galerie(1, "P");
//        Galerie g1 =new Galerie(3, "Photographie");
   // ServiceGalerie pst=new ServiceGalerie();
//          //  pst.insert(g1);
//          // pst.deleteById(3);
//          //  pst.readAll().forEach(System.out::println);
//            pst.readById(3);
  
  Article a1 =new Article( 8,"p", "deschk bBVkjNV KJvn slkv nl_article",  "photo_article", "nom_artiste", 10, 10,g);
       // Article a1 =new Article( "p", "deschk bBVkjNV KJvn slkv nl_article",  "photo_article", "nom_artiste", 10, 10,g);
   ServiceArticle pst=new ServiceArticle();
  // pst.insert(a1);
  // pst.deleteById(7);
  // pst.delete(a1);
  //  pst.update(a1);
  // pst.readById();
  //  pst.readAll().forEach(System.out::println);
    }
    
}
