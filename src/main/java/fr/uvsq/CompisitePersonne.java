/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class CompisitePersonne implements Personne{
private List<Personne> personnes =new ArrayList<>();
    @Override
    public void print() {
        for (Personne personne : personnes) {
            personne.print();
        }
    }
    public  void supPersonnene(Personne personne)
    {
        personnes.remove(personne);
    }
    
}
