/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import Metier.IMetier;
import Metier.Metier;
import dao.IDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author hassa
 */
public class Presentation {
    public static void main(String[] args) throws Exception{
       ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        
       IMetier metier = (Metier) ac.getBean("metier");
       System.out.println("la valeur de temperature : "+metier.traitement());

        
        
       
    }
}
