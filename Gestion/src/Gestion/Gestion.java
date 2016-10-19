/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;
import IES.*;
/**
 *
 * @author a021704062c
 */
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos dos objetos "profesores"
        Profesor teacher1 = new Profesor();
        Profesor teacher2 = new Profesor(2, "Mila", "C/Puerto Rico");
        IES ausias = new IES(1, 43, "C/Ángel Villena", "Valencia");
        
        teacher1.setId(1);
        teacher1.setNombre("Valentin");
        teacher1.setDireccion("Av. del Cid");
        
        // Comprobamos que hemos introducido bien los datos
        
        System.out.println(teacher1.toString() + "\n");
        System.out.println(teacher2.toString() + "\n");
        System.out.println(ausias.toString() + "\n");
        
    }
    
}
