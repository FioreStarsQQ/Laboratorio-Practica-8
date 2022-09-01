
/*
Laboratorio Nro 08 - Ejercicio1: Se desea sortear un premio entre los N invitados a una fiesta cachimbo, 
cada invitado tiene un boleto numerado secuencialmente a partir del X. Hacer un programa que permita realizar el sorteo.
Autor: Fiorela Clariza Quispe Quispe
Colaboró: 
Tiempo: 
*/
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int primerBoleto, cantInvitados, ganador, ultimoBoleto; // Las variables
        Scanner scan = new Scanner(System.in);

        // Obteniendo valores de ingreso
        System.out.print("Ingrese el número del primer boleto: ");
        primerBoleto = scan.nextInt();
        System.out.print("Ingrese el número de de invitados a la fiesta cachimbo: ");
        cantInvitados = scan.nextInt();

        // Seleccionando al ganador
        ultimoBoleto = primerBoleto + cantInvitados - 1; // Calcula el numero del ultimo boleto
        ganador = (int) (Math.floor(Math.random() * (ultimoBoleto - primerBoleto + 1)) + primerBoleto); // Ganador del
                                                                                                        // sorteo

        System.out.println("\nEl número ganador del sorteo es\t" + ganador); // Salida
        scan.close();
    }

}
