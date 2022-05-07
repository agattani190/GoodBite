//
//
///*
// * Created by Team 5 on 2021.11.1
// * Copyright © 2021 Team 5. All rights reserved.
// */
//
//package edu.vt.EntityBeans;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.io.Serializable;
//
///*
//The @Entity annotation designates this class as a JPA Entity POJO class
//representing the car table in the RecipeDB database.
// */
//@Entity
//
//// Name of the database table represented
//@Table(name = "Pantry")
//
//@NamedQueries({
//        // This named query is used in RecipeFacade
//        @NamedQuery(name = "Pantry.findByName", query = "SELECT c FROM Pantry c WHERE c.ingredients  = :name")
//})
//
//public class Pantry implements Serializable {
//    /*
//    ========================================================
//    Instance variables representing the attributes (columns)
//    of the Recipes table in the RecipesDB database.
//
//    # CREATE TABLE UserPantry
//# (
//#         id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
//#         ingredient VARCHAR(256) NOT NULL,
//#         nutrients VARCHAR(256) NOT NULL,
//#         calories DECIMAL(8,6) NOT NULL,
//#         quantity DECIMAL(8,6) NOT NULL,
//#         user_id INT UNSIGNED,
//#         FOREIGN KEY (user_id) REFERENCES User(id) ON DELETE CASCADE
//#         );
//# ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
//# /*!40101 SET character_set_client = @saved_cs_client */;
////
////    ========================================================
////     */
//    private static final long serialVersionUID = 1L;
//    /*
//    Primary Key id is auto generated by the system as an Integer value
//    starting with 1 and incremented by 1, i.e., 1,2,3,...
//    A deleted entity object's primary key number is not reused.
//     */
//    // id INT UNSIGNED NOT NULL AUTO_INCREMENT
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "id")
//    private Integer id;
//
// // name VARCHAR(100) NOT NULL
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 250)
//    @Column(name = "name")
//    private String name;
//
//    //publisher_name  VARCHAR(100) NOT NULL
//
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 200)
//    @Column(name = "publisher_name")
//    private String publisher_name;
//
//   // photo_url  VARCHAR(150) NOT NUL
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 250)
//    @Column(name = "publisher_url")
//    private String publisher_url;
////category VARCHAR(150) NOT NULL
//
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 250)
//    @Column(name = "category")
//    private String category;
//
//// cuisine  VARCHAR(100) NOT NULL
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "cuisine")
//    private String  cuisine;
//
////website_url (200) NOT NULL
//
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "website_url")
//    private String  website_url;
//
//    //photo_url  VARCHAR(150) NOT NULL
//
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "photo_url")
//    private String photo_url;
//
//// ingredients VARCHAR(500) NOT NULL
//
//   @Basic(optional = false)
//    @NotNull
//    @Column(name = "ingredient")
//    private String ingredients;
////   nutrients VARCHAR( 300) NOT NULL
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "nutrients")
//    private String nutrients;
//
//
////    =================================================================
////    Class constructors for instantiating a Car entity object to
////    represent a row in the Car table in the CarDB database.
////    =================================================================
////     */
////    // Used in PrepareCreate method in CarController
//    public Pantry() {
//    }
//
//    // Not used but kept for potential future use
//    public Pantry(Integer id, String name, String category, String cuisine, String website_url, String photo_url , String nutrients , String publisher_name, String publisher_url, String ingredients   ) {
//        this.id = id;
//        this.name = name;
//        this.publisher_name = publisher_name;
//        this.publisher_url = publisher_url;
//        this.category=category;
//        this.cuisine = cuisine;
//        this.ingredients =ingredients ;
//        this.nutrients  = nutrients ;
//        this.photo_url = photo_url;
//        this.website_url=website_url;
//
//    }
//
////    /*
////    ======================================================
////    Getter and Setter methods for the attributes (columns)
////    of the Car table in the CarDB database.
////    ======================================================
//
//
////    ================================
////    Instance Methods Used Internally
////    ================================
////     */
////
////    // Generate and return a hash code value for the object with database primary key id
////    @Override
////    public int hashCode() {
////        int hash = 0;
////        hash += (id != null ? id.hashCode() : 0);
////        return hash;
////    }
//
//    /*
//     Checks if the Recipe object identified by 'object' is the same as the Recipe object identified by 'id'
//     Parameter object = Recipe object identified by 'object'
//     Returns True if the Recipe 'object' and 'id' are the same; otherwise, return False
//     */
//    @Override
//    public boolean equals(Object object) {
//        if (!(object instanceof Recipe)) {
//            return false;
//        }
//        Recipe other = (Recipe) object;
//        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
//    }
//
//    // Return String representation of database primary key id
//    @Override
//    public String toString() {
//        return id.toString();
//    }
//
//}
