/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorarenta;
import calculadorarenta.Sueldo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SOPORTE-T
 */
public class CalculadoraRenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dato=new BufferedReader (new InputStreamReader(System.in)); 
        Sueldo S = new Sueldo();
        S.Sueldo=-1;
        do{
            System.out.println("Por favor ingrese el Sueldo \nrecuerde que solo deben de ser numeros\n");
        try {
            String d = dato.readLine();
            S.Sueldo = Float.parseFloat(d);
        } catch (IOException ex) {
            System.out.println("Error en la lectura del sueldo\n"+ex);
        }
        }while(S.Sueldo<=-1);
        S.Seguro = Sueldo.seguro(S.Sueldo);
        S.Afp = Sueldo.afp(S.Sueldo);
        System.out.println(S.Afp);
        
    }
    
}
