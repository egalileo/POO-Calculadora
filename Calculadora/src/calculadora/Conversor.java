package calculadora;

import javax.swing.JOptionPane;

public class Conversor {

    public int numero, base, temporal, residuo;
    public String caracteres = "0123456789ABCDEF", salida="";

    public Conversor() {
    }

    public Conversor(int numero, int base) {
        this.numero = numero;
        this.base = base;
    }

    public void convertir() {
        salida = "";
        temporal = this.numero;
        while (temporal > 0) {
            residuo = temporal % this.base;
            temporal = temporal / this.base;
            salida = caracteres.charAt(residuo) + salida;
        }
        JOptionPane.showMessageDialog(null, "El numero: " + this.numero
                + " en Decimal\nconvertido a base "+this.base+" es: " + salida);
        
    }
    
    public String convertir2(int numero, int base){
        salida = "";
        temporal = numero;
        while (temporal > 0) {
            residuo = temporal % base;
            temporal = temporal / base;
            salida = caracteres.charAt(residuo) + salida;
        }
        return salida;
    }
}
