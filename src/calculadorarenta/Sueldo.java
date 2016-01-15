/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorarenta;

/**
 *
 * @author SOPORTE-T
 */
public class Sueldo {
    float Sueldo;
    float Seguro;
    double Afp;
    float Renta;
    
    public static float seguro (float sueldo){
        float seguro = 0;
        float p = 3;
        seguro = (sueldo * p)/100;
        return seguro;
    }
    
    public static double afp (float sueldo){
        double afp = 0;
        double p = 6.75;
        afp = (sueldo * p)/100;
        return afp;
    }
}
