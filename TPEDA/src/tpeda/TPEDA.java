/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpeda;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TPEDA {

    /**
     * @param args the command line arguments
     */
    private static int leerEntero(Scanner s, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = s.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Debe ingresar un numero.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArbolFixture fixture = new ArbolFixture(s);

        int op;

        do {

            System.out.println("Menu");
            System.out.println("\n1- Generar fixture");
            System.out.println("2- Cargar octavos");
            System.out.println("3- Cargar cuartos");
            System.out.println("4- Cargar semifinales");
            System.out.println("5- Cargar final");
            System.out.println("6- Mostrar campeon");
            System.out.println("7- Mostrar fase");
            System.out.println("8- Salir");

            op = leerEntero(s, "Seleccione una opcion: ");
            

            while (op < 1 || op > 8) {
                System.out.println("Opcion erronea. Elija de nuevo");
                System.out.println("Menu");
                System.out.println("\n1- Generar fixture");
                System.out.println("2- Cargar octavos");
                System.out.println("3- Cargar cuartos");
                System.out.println("4- Cargar semifinales");
                System.out.println("5- Cargar final");
                System.out.println("6- Mostrar campeon");
                System.out.println("7- Mostrar fase");
                System.out.println("8- Salir");

                op = leerEntero(s, "Seleccione una opcion: ");
               
            }
            switch (op) {

                case 1:
                    String[] equipos = new String[16];

                    for (int i = 0; i < 16; i++) {

                        System.out.print("Equipo " + (i + 1) + ": ");
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
                    System.out.println("Elija la fase que desea ver");
                    System.out.println("1- Octavos");
                    System.out.println("2- Cuartos");
                    System.out.println("3- Semifinales");
                    System.out.println("4- Final");

                    int fase = leerEntero(s, "Seleccione una fase: ");
                    while (fase < 1 || fase > 4) {
                        System.out.println("Fase erroenea ingreso de nuevo");
                        System.out.println("Elija la fase que desea ver");
                        System.out.println("1- Octavos");
                        System.out.println("2- Cuartos");
                        System.out.println("3- Semifinales");
                        System.out.println("4- Final");
                        fase = s.nextInt();
                    }
                    fixture.mostrarFase(fase);

                    break;
                case 8:
                    exit(0);
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion inexistente.");
                    break;
            }

        } while (op > 0 && op < 9);
    }
}
