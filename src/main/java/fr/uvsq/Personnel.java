package fr.uvsq;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Personnel implements Personne,Serializable
{
    private int numero;
    private final String nom;
    private final String prenom;
    private final LocalDate dateNaiss;
    private final List<Telephone> telephones;

   


    @Override
    public void print() {
        this.toString();
    }



    public static class Builder
{   //parametre obligatoire
    private final int numero;
    private final String nom;
    private final String prenom;
    //parametre optionnels
    private  LocalDate dateNaiss = LocalDate.now();
    private  List<Telephone> telephones = new ArrayList<>();
    
   
   public Builder(int numero,String nom, String prenom)
   {
        this.numero=numero;
   	this.nom=nom;
   	this.prenom=prenom;
   }

   public Builder modifierdateNaiss(LocalDate dateNaiss)
   {
   	  this.dateNaiss=dateNaiss;
          return this;

   }

   public Builder ajouterTelephone (Telephone telephone)
   {
   	  this.telephones.add(telephone);
          return this;
   	  
   }
   
   public Personnel build()
    {
    	return new Personnel(this);
    }

 }
   
   private Personnel(Builder builder)
   {

   	 //parametre obligatoire
   	this.nom=builder.nom;
   	this.prenom=builder.prenom;
   	//parametre optionnel
   	this.dateNaiss=builder.dateNaiss;
   	this.telephones=builder.telephones;
   }

    @Override
    public String toString() {
        return "Personnel{" + "nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss + ", telephones=" + telephones + '}';
    }
   
    public Personnel utilisationPers()
    {
        Personnel p;
        p = new Personnel.Builder(1,"Simporé","Naimatou")
                .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
        p.toString();
        return p;
   
    }   

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public int getNumero() {
        return numero;
    }
   
   
}