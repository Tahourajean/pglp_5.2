/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import fr.uvsq.Personnel;
import fr.uvsq.Telephone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class PersonnelDAOTest {
    
    public PersonnelDAOTest() {
        
        Personnel p = new Personnel.Builder(1,"Simporé","Naimatou")
                .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
    }
    
    
    /**
     * Test of create method, of class PersonnelDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Personnel obj = new Personnel.Builder(1,"Traoré","Bene")
        .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
        PersonnelDAO instance = new PersonnelDAO();
        Personnel expResult = new Personnel.Builder(1,"Traoré","Bene")
        .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
        Personnel result = instance.create(obj);
        assertEquals(expResult, result);  
    }

    /**
     * Test of update method, of class PersonnelDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Personnel obj = null;
        PersonnelDAO instance = new PersonnelDAO();
        int expResult = 1;
        int result = instance.update(obj);
        assertEquals(expResult, result);     
    }

    /**
     * Test of delete method, of class PersonnelDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Personnel obj = new Personnel.Builder(1,"Simporé","Naimatou")
                .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
        PersonnelDAO instance = new PersonnelDAO();
        int expResult = 1;
        int result = instance.delete(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class PersonnelDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String numero = "";
        PersonnelDAO instance = new PersonnelDAO();
        Personnel expResult = new Personnel.Builder(1,"Simporé","Naimatou")
        .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
        Personnel result = instance.find(numero);
        assertEquals(expResult, result);
       
    }
    
}
