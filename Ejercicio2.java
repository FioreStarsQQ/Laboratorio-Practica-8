
/*
    - Laboratorio Nro 08 - Ejercicio2: Dado un rango [a,b] se deben generar 2 puntos en el plano: (x1,y1) (x2,y2) 
    cuyos valores pertenezcan a dicho rango. Valores enteros.
    Mostrar los 2 puntos generados y los valores de los 3 puntos del triángulo rectángulo generado, 
    además de valor de base, altura, hipotenusa y área.
    Modo consola.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int limInferior, limSuperior, x1, y1, x2, y2, base, altura, hipotenusa, area; // Las variables
        Scanner scan = new Scanner(System.in);

        // Obteniendo valores del rango
        System.out.print("Ingrese el número límite inferior del rango: ");
        limInferior = scan.nextInt();
        System.out.print("Ingrese el número límite superior del rango: ");
        limSuperior = scan.nextInt();
        // Seleccionando las coordenadas al azar
        x1 = (int) (Math.floor(Math.random() * (limSuperior - limInferior + 1)) + limInferior); // Coordenada x1
        y1 = (int) (Math.floor(Math.random() * (limSuperior - limInferior + 1)) + limInferior); // Coordenada y1
        x2 = (int) (Math.floor(Math.random() * (limSuperior - limInferior + 1)) + limInferior); // Coordenada x2
        y2 = (int) (Math.floor(Math.random() * (limSuperior - limInferior + 1)) + limInferior); // Coordenada y2
        // Condicional para calcular la base y la altura
        if (x1 > x2) {
            base = x1 - x2;
        } else {
            base = x2 - x1;
        }
        if (y1 > y2) {
            altura = y1 - y2;
        } else {
            altura = y2 - y1;
        }
        // Operaciones
        hipotenusa = (int) (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
        area = (base * altura) / 2;
        // Generando 2 puntos en el plano: (x1,y1) (x2,y2)
        System.out.println("\nLas coordenadas que se generaron aleatoriamente son: (" + x1 + "," + y1 + ") y (" + x2
                + "," + y2 + ")");
        // Salida de los resultados
        System.out.println("\nAhora, las 3 coordenadas del primer triangulo rectángulo son:\nEl primer par odenado es\t("
                        + x1 + "," + y1 + ")\nEl segundo par odenado es\t(" + x1 + "," + y2
                        + ")\nEl tercer par odenado es\t(" + x2 + "," + y2 + ")"); // Salida 1
        System.out.println("\nY las 3 coordenadas del segundo triangulo rectángulo son:\nEl primer par odenado es\t("
                + x1 + "," + y1 + ")\nEl segundo par odenado es\t(" + x2 + "," + y2 + ")\nEl tercer par odenado es\t("
                + x2 + "," + y1 + ")"); // Salida 2
        System.out.println("\nLa base mide: " + base + " unidades" + " y la altura es " + altura + " unidades."
                + "\nLa hipotnusa del triángulo formado es " + hipotenusa + " y el área es: " + area
                + " unidades cuadradas.");
        scan.close();
    }

}
