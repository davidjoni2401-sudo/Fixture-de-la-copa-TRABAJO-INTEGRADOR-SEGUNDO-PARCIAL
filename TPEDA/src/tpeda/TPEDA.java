/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpeda;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TPEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Scanner s = new Scanner(System.in);

ArbolFixture fixture = new ArbolFixture();

int op;

do {

    System.out.println("\n1- Generar fixture");
    System.out.println("2- Cargar octavos");
    System.out.println("3- Cargar cuartos");
    System.out.println("4- Cargar semifinales");
    System.out.println("5- Cargar final");
    System.out.println("6- Mostrar campeon");
    System.out.println("7- Salir");

    op = s.nextInt();
    s.nextLine();

    switch(op) {

        case 1:
            String[] equipos = new String[16];

    for(int i = 0; i < 16; i++) {

        System.out.print("Equipo " + (i+1) + ": ");
        equipos[i] = s.nextLine();

    }

    fixture.generarFix(equipos);

    System.out.println("Fixture generado correctamente.");
            break;

        case 2:
            fixture.cargarOctavos();
            break;

        case 3:
            fixture.cargarCuartos();
            break;

        case 4:
            fixture.cargarSemifinales();
            break;

        case 5:
            fixture.cargarFinal();
            break;

        case 6:
            fixture.mostrarCampeon();
            break;
            case 7:

    System.out.println("1- Octavos");
    System.out.println("2- Cuartos");
    System.out.println("3- Semifinales");
    System.out.println("4- Final");

    int fase = s.nextInt();

    fixture.mostrarFase(fase);

    break;
    }

} while(op != 7);   
    }
}
      