/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author hassa
 */
public class DaoImpl2 implements IDao{
    
    @Override
    public double getTemp() {
        // depuis le capteur
        double temperature = 8;
        return temperature;
    }
}
