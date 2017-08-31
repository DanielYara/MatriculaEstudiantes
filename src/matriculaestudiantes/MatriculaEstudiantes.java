/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriculaestudiantes;
import java.util.Scanner;

/**
 *
 * @author Daniel y Cielo
 */
public class MatriculaEstudiantes {

public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyb = new Scanner(System.in);
        String[] codigo = new String[10];
        int[] patrimonio = new int[10];
        int[] renta = new int[10];
        int[] creditos = new int[10];
        int[] pago = new int[10];
        int aux1, aux2, aux3, total;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese código del alumno: ");
            codigo[i] = keyb.next();
            System.out.println("Ingrese patrimonio del alumno: ");
            patrimonio[i] = keyb.nextInt();
            aux1 = patrimonio[i]; 
            System.out.println("Ingrese renta liquida del alumno: ");
            renta[i] = keyb.nextInt();
            aux2 = renta[i];
            System.out.println("Ingrese numero de creditos a cursar del alumno: ");
            creditos[i] = keyb.nextInt();
            aux3 = creditos[i];
            pago[i] = Matricula(aux1, aux2, aux3);
        }
        
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            aux = aux+pago[i];
        }
        total = aux;
        
        System.out.println("\nEl total a pagar por codigo es:\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(codigo[i] + "  " + pago[i] + ".");
        }
        System.out.println("\nEl total recogido por matricula es: " + total);
        
    }
    
    public static int Matricula(int patrim, int rent, int cred){
    int a = 0;
    if(patrim <= 100000 || rent <= 25000){
        a = cred*130;
    } else if ((patrim <= 150000 && patrim > 100000) || (rent <= 30000 && rent > 25000)){
        a = cred*200;
    } else if ((patrim <= 210000 && patrim > 150000) || (rent <= 40000 && rent > 30000)) {
        a = cred*280;
    }
    return a;
    }
}
