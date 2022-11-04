
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Galileo Padilla
 */
public class Calculadora {

    public static void main(String[] args) {
        int numero, base;
        String salida;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  numero que desea convertir"));
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base a la que desea convertir"));
        
        Conversor calcu = new Conversor(numero, base);
        calcu.convertir();
        
        Conversor calcu2 = new Conversor();
        salida = calcu2.convertir2(numero, base);
        JOptionPane.showMessageDialog(null,"El numero "+numero+"\n covertido a base "+base+" es:"+salida);
    }
    
}
