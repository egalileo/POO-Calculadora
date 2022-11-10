package calculadora;

import javax.swing.JOptionPane;

public class Conversor {

    public int base, numero, temporal, residuo;
    public String caracteres = "0123456789ABCDEF", salida ="";

    public Conversor() {
    }
    
    public Conversor(int numero, int base){
        this.numero = numero;
        this.base = base;
    }
    
    public String convertirReturn(){
        this.salida="";
        this.temporal = this.numero;

        while (temporal > 0) {
            this.residuo = this.temporal % this.base;
            this.temporal = this.temporal / this.base;
            this.salida = caracteres.charAt(this.residuo) + this.salida;
        }
        JOptionPane.showMessageDialog(null, "El numero: " + this.numero
                + " en Decimal\nconvertido a base"+this.base+" es: " + this.salida);
        salida = "";
        return this.salida;
    }
    
    
    public void convertirVoid(int numero, int base) {
        this.salida="";
        this.temporal = numero;

        while (temporal > 0) {
            residuo = this.temporal % base;
            this.temporal = this.temporal / base;
            this.salida = caracteres.charAt(this.residuo) + this.salida;
        }
        JOptionPane.showMessageDialog(null, "El numero: " + numero
                + " en Decimal\nconvertido a base"+base+" es: " + this.salida);
        salida = "";
    }
}
