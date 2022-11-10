
package calculadora;

import javax.swing.JOptionPane;

/**
 * @author Galileo Padilla
 */
public class Calculadora {
    public static void main(String[] args) {
        int numero, base;
        Conversor calculoVoid = new Conversor(); //Crear mi objeto con constructor vacio
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea convertir ")); 
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base a la que desea convertir (Binario, Octal o Hex)")); 
        
        Conversor calculoConstructor = new Conversor( numero, base ); //Crear mi objeto con constructor 
        
        calculoVoid.convertirVoid(numero, base);
        calculoConstructor.convertirReturn();
        
        
        
    }
    
}
