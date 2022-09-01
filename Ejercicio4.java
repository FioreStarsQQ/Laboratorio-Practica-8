
/*
    - Laboratorio Nro 08 - Ejercicio4: Se ingresa en una ventana una cadena formada por 4 números reales y 
    sumas: #+#+#+# (expresión aritmética sin espacios). Ejemplo: 5+3.5+-2+7.8 o 5.36+10+-2.8+7.889
    Mostrar el resultado de la evaluación de dicha expresión usando modo de interacción gráfico.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/
import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String cadenaNum, nuevaCadena1, nuevaCadena2; // Las variables       
        Double num1, num2, num3, num4, suma;        

        // Obteniendo los valores de la suma num1, num2, num3 y num4
        cadenaNum = JOptionPane.showInputDialog("Ingrese el los 4 números y el operador: ");
        num1 = Double.parseDouble(cadenaNum.substring(0,cadenaNum.indexOf("+")));
        nuevaCadena1 = (cadenaNum.substring((cadenaNum.indexOf("+")+1),cadenaNum.length())); // Cadena de donde se extaerá el siguiente número a sumar: num2  
        num2 = Double.parseDouble(nuevaCadena1.substring(0,nuevaCadena1.indexOf("+")));
        nuevaCadena2 = (nuevaCadena1.substring(nuevaCadena1.indexOf("+")+1,nuevaCadena1.length())); // Cadena de donde se extaerá el siguiente número a sumar: num3 y num4
        num3 = Double.parseDouble(nuevaCadena2.substring(0,nuevaCadena2.indexOf("+")));
        num4 = Double.parseDouble(nuevaCadena2.substring((nuevaCadena2.indexOf("+")+1),nuevaCadena2.length()));
        suma = (double) Math.round((num1 + num2+ num3 + num4)*100)/100;
        // Salida del resultado
        JOptionPane.showMessageDialog(null,"La suma de los números "+num1+", "+num2+", "+num3+" y "+num4+"\nResulta ser con el redondeo a dos decimales: "+suma);
    }
}