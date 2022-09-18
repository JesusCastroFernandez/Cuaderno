/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadernocoloresdos;

/**
 *
 * @author JESUS
 */
public class CuadernoColoresDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int hojasTotales= 61;         
         int hojasRojas = hojasTotales / 2;
         int hojasVerdes = hojasTotales / 2 + (hojasTotales % 2);
         
         System.out.println ("Total de hojas en el cuaderno: " + hojasTotales);
         System.out.println ("Cantidad de hojas rojas: " + hojasRojas);
         System.out.println ("Cantidad de hojas verdes: " + hojasVerdes);
    }
    
}
