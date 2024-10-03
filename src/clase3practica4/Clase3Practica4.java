/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3practica4;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Clase3Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero = "";
        double numeroD=0;
        double numeroMulti=0;
        numero = JOptionPane.showInputDialog("Ingrese un numero para crear un triangulo");
        numeroD = Double.parseDouble(numero);
        int i=0;
        while (i<=numeroD) {
            i=i+1;
            System.out.print("*"+"\n");
            if (i>1) {
                System.out.print("*");
            }
        }
    }
    
}
