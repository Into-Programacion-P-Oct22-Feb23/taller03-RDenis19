/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 10;
        int var5 = 5;
        int var6 = 2;
        
        double valor = Math.sqrt(var1) * var2;
        boolean val = valor >= var3 && (true || false); 
        boolean a= val || var4/var5 >= var6; 
        
        System.out.println(a);
    }
    
}
