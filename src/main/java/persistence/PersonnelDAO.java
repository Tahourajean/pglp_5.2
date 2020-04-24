/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;


import fr.uvsq.Personnel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author USER
 */
public class PersonnelDAO  extends DAO<Personnel>{

    @Override
    public Personnel create(Personnel obj) {
        try {
            PreparedStatement prepare=connect.
                    prepareStatement("INSERT INTO personnel(numero,nom,prenom) values(?,? ,?)");
            prepare.setInt(1, obj.getNumero());
            prepare.setString(2, obj.getNom());
            prepare.setString(3, obj.getPrenom());
            int result=prepare.executeUpdate();
            assert result==1;
        } catch (Exception e) {
        }
         return obj;
    }

    @Override
    public Personnel update(Personnel objet) {
       
        return objet;
    }

    @Override
    public Personnel delete(Personnel objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personnel find(String numero) {
        Personnel p=new Personnel();
        try {
            PreparedStatement prepare=connect.
                    prepareStatement("SELECT * from personnel where numero=numero");
            prepare.setString(1, numero);
            ResultSet result=prepare.executeQuery();
            if(result.first())
            {
                 p = new Personnel.Builder(result.getInt(numero),result.getString("nom"),result.getString("prenom")).build();
            }
        } catch (Exception e) {
        }
        return p;
    }

    
    
}
