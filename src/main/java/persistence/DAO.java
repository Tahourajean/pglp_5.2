/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;



/**
 *
 * @author USER
 */
public abstract class DAO<T> 
{
     ConnectDB conndb=new ConnectDB();
     protected Connection connect=conndb.connect();
     public abstract T create(T obj);
     public abstract int update(T obj);
     public abstract int  delete(T obj);
     public abstract T find(String obj);
    
}
