/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 2;
        int var8 = 200;
        int var9 = 50;
        int var10 = 50;
        int var11 = 50;
        int var12 = 51;
        
        double valor = (var1 * var2) + var3 - var4/var5 + Math.pow(var6, var7);
        boolean val = valor >= var8 || (var9 >= var10 - var11 + var12);
        
        System.out.println(val);
    }
    
}
