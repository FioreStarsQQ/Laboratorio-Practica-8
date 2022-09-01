
/*
    - Laboratorio Nro 08 - Ejercicio5: Se ingresa en una ventana una cadena con formato #x2+#x+#=0 (sin espacios, cada coeficiente 
    es un número real positivo o negativo y se debe poner 1 o 0 explícitamente cuando corresponda).
    Ejemplo: 1x2+0x+-3=0 para x2-3=0     *4x2+9x+5=0
    Mostrar las raíces de dicha ecuación cuadrática usando modo gráfico.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/
import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        String ecuacionCuadr, nuevaEcuacion1, nuevaEcuacion2; // Las variables
        Double coeficiente1, coeficiente2, coeficiente3, raiz1, raiz2;

        // Obteniendo los valores de los coeficientes al reducir la ecuacion de grado en
        // grado
        ecuacionCuadr = JOptionPane.showInputDialog("Ingrese el los 4 números y el operador: ");
        coeficiente1 = Double.parseDouble(ecuacionCuadr.substring(0, ecuacionCuadr.indexOf("+") - 2));
        nuevaEcuacion1 = (ecuacionCuadr.substring((ecuacionCuadr.indexOf("+") + 1), ecuacionCuadr.length()));
        coeficiente2 = Double.parseDouble(nuevaEcuacion1.substring(0, nuevaEcuacion1.indexOf("+") - 1));
        nuevaEcuacion2 = (nuevaEcuacion1.substring(nuevaEcuacion1.indexOf("+") + 1, nuevaEcuacion1.length()));
        coeficiente3 = Double.parseDouble(nuevaEcuacion2.substring(0, nuevaEcuacion2.indexOf("=")));
        raiz1 = (double) Math
                .round(((-coeficiente2 + Math.sqrt(Math.pow(coeficiente2, 2) - (4 * coeficiente1 * coeficiente3)))
                        / (2 * coeficiente1)) * 100)
                / 100;
        raiz2 = (double) Math
                .round(((-coeficiente2 - Math.sqrt(Math.pow(coeficiente2, 2) - (4 * coeficiente1 * coeficiente3)))
                        / (2 * coeficiente1)) * 100)
                / 100;
        // Salida del resultado
        JOptionPane.showMessageDialog(null, "Los coeficientes ingresados fueron " + coeficiente1 + ", " + coeficiente2
                + " y " + coeficiente3 + "\nEl resultado de las raíces con el redondeo son: " + raiz1 + " y " + raiz2);
    }
}
