/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metier;

import dao.IDao;


public class Metier implements IMetier{
    
    //dependance
    private IDao dao;

//    public void setDao(IDao dao) {
//        this.dao = dao;
//    }

    public IDao getDao() {
        return dao;
    }
    
    
    @Override   
    public double traitement() {
           
        double temp = dao.getTemp() / 2;
        return temp;
    }
    
}
