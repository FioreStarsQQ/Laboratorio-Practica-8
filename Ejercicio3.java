
/*
    - Laboratorio Nro 08 - Ejercicio3: Dado un rango [a,b] se deben generar 2 puntos en el plano: (x1,y1) (x2,y2) 
    cuyos valores pertenezcan a dicho rango. Valores reales.
    Mostrar los 2 puntos generados y los valores de los 4 puntos del rectángulo generado, 
    además de valor de base, altura, diagonal, perímetro y área.
    Modo gráfico.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/
import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        double limInferior, limSuperior, x1, y1, x2, y2, base, altura, diagonal, area, perimetro; // Las variables

        // Obteniendo valores del rango
        limInferior = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número límite inferior del rango: "));

        limSuperior = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número límite superior del rango: "));

        // Seleccionando las coordenadas al azar
        x1 = (double) Math.round(((Math.random() * (limSuperior - limInferior + 1)) + limInferior) * 100) / 100; // Coordenada x1
        y1 = (double) Math.round(((Math.random() * (limSuperior - limInferior + 1)) + limInferior) * 100) / 100; // Coordenada y1
        x2 = (double) Math.round(((Math.random() * (limSuperior - limInferior + 1)) + limInferior) * 100) / 100; // Coordenada x2
        y2 = (double) Math.round(((Math.random() * (limSuperior - limInferior + 1)) + limInferior) * 100) / 100; // Coordenada y2
        // Condicional para calcular la base y la altura
        if (x1 > x2) {
            base = (double) Math.round((x1 - x2) * 100) / 100;
        } else {
            base = (double) Math.round((x2 - x1) * 100) / 100;
        }
        if (y1 > y2) {
            altura = (double) Math.round((y1 - y2) * 100) / 100;
        } else {
            altura = (double) Math.round((y2 - y1) * 100) / 100;
        }
        // Operaciones
        diagonal = (double) Math.round((Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2))) * 100) / 100;
        area = (double) Math.round((base * altura) * 100) / 100;
        perimetro = (double) Math.round(2 * (base + altura) * 100) / 100;
        // Salida de los 2 puntos en el plano: (x1,y1) (x2,y2)
        JOptionPane.showMessageDialog(null, "El rango establecido fue entre " + limInferior + " y " + limSuperior
                + "\nLas coordenadas que se generaron aleatoriamente son: (" + x1 + "," + y1 + ") y (" + x2
                + "," + y2 + ")\n" + "\nAhora, las 4 coordenadas del rectángulo son:\n- El primer par odenado es ("
                + x1 + "," + y1 + ")\n- El segundo par odenado es (" + x1 + "," + y2
                + ")\n- El tercer par odenado es (" + x2 + "," + y2 + ")\n- El cuarto par odenado es (" + x2 + "," + y1
                + ")\n" + "\nLas medidas del rectángulo son:\n- Base: " + base + " unidades\n- Altura: " + altura
                + " unidades\n- Diagonal: " + diagonal + " unidades\nEl área del rectángulo es " + area
                + " unidades cuadradas y su perímetro es " + perimetro + " unidades.");
    }

}