package tpeda;

import java.util.Scanner;

public class ArbolFixture {

    private NodoPartido raiz;
    private NodoPartido o1, o2, o3, o4, o5, o6, o7, o8;
    private NodoPartido c1, c2, c3, c4;
    private NodoPartido s1, s2;
    private NodoPartido f;
    private final Scanner s;

    public ArbolFixture(Scanner s) {
        raiz = null;
        this.s = s;
    }

    public NodoPartido getRaiz() {
        return raiz;
    }

    public void generarFix(String[] eq) {

        o1 = new NodoPartido(eq[0], eq[1]);
        o2 = new NodoPartido(eq[2], eq[3]);
        o3 = new NodoPartido(eq[4], eq[5]);
        o4 = new NodoPartido(eq[6], eq[7]);
        o5 = new NodoPartido(eq[8], eq[9]);
        o6 = new NodoPartido(eq[10], eq[11]);
        o7 = new NodoPartido(eq[12], eq[13]);
        o8 = new NodoPartido(eq[14], eq[15]);

        // CUARTOS
        c1 = new NodoPartido("", "");
        c2 = new NodoPartido("", "");
        c3 = new NodoPartido("", "");
        c4 = new NodoPartido("", "");

        c1.setIzquierdo(o1);
        c1.setDerecho(o2);

        c2.setIzquierdo(o3);
        c2.setDerecho(o4);

        c3.setIzquierdo(o5);
        c3.setDerecho(o6);

        c4.setIzquierdo(o7);
        c4.setDerecho(o8);

        s1 = new NodoPartido("", "");
        s2 = new NodoPartido("", "");

        s1.setIzquierdo(c1);
        s1.setDerecho(c2);

        s2.setIzquierdo(c3);
        s2.setDerecho(c4);

        f = new NodoPartido("", "");

        f.setIzquierdo(s1);
        f.setDerecho(s2);

        raiz = f;

    }

    public void mostrarFase(int fase) {

        switch (fase) {

            case 1:

                System.out.println("\n OCTAVOS ");

                System.out.println(o1.getEquipo1() + " vs " + o1.getEquipo2() + " Ganador " + o1.getGanador());
                System.out.println(o2.getEquipo1() + " vs " + o2.getEquipo2() + " Ganador  " + o2.getGanador());
                System.out.println(o3.getEquipo1() + " vs " + o3.getEquipo2() + " Ganador  " + o3.getGanador());
                System.out.println(o4.getEquipo1() + " vs " + o4.getEquipo2() + " Ganador  " + o4.getGanador());
                System.out.println(o5.getEquipo1() + " vs " + o5.getEquipo2() + " Ganador  " + o5.getGanador());
                System.out.println(o6.getEquipo1() + " vs " + o6.getEquipo2() + " Ganador  " + o6.getGanador());
                System.out.println(o7.getEquipo1() + " vs " + o7.getEquipo2() + " Ganador  " + o7.getGanador());
                System.out.println(o8.getEquipo1() + " vs " + o8.getEquipo2() + " Ganador  " + o8.getGanador());

                break;

            case 2:

                System.out.println("\n CUARTOS");

                System.out.println(c1.getEquipo1() + " vs " + c1.getEquipo2() + " Ganador " + c1.getGanador());
                System.out.println(c2.getEquipo1() + " vs " + c2.getEquipo2() + " Ganador " + c2.getGanador());
                System.out.println(c3.getEquipo1() + " vs " + c3.getEquipo2() + " Ganador " + c3.getGanador());
                System.out.println(c4.getEquipo1() + " vs " + c4.getEquipo2() + " Ganador " + c4.getGanador());

                break;

            case 3:

                System.out.println("\n SEMIS ");

                System.out.println(s1.getEquipo1() + " vs " + s1.getEquipo2() + " Ganador " + s1.getGanador());
                System.out.println(s2.getEquipo1() + " vs " + s2.getEquipo2() + " Ganador " + s2.getGanador());

                break;

            case 4:

                System.out.println("\n FINAL ");

                System.out.println(f.getEquipo1() + " vs " + f.getEquipo2() + " Ganador " + f.getGanador());

                break;

            default:
                System.out.println("Fase inexistente");
        }

    }

    public String jugarPartido(String eq1, String eq2) {
        String ganador;
        System.out.println(eq1 + " vs " + eq2);
        do {
            System.out.println("Ingrese el ganador del partido ");
            ganador = s.nextLine().trim();

            //validacion
            if (!ganador.equalsIgnoreCase(eq1)
                    && !ganador.equalsIgnoreCase(eq2)) {
                System.out.println("Entrada invalida. Escriba\""
                        + eq1 + "\" o \"" + eq2 + "\".");
            }
        } while (!ganador.equalsIgnoreCase(eq1)
                && !ganador.equalsIgnoreCase(eq2));

        return ganador;
    }

    public void cargarOctavos() {
        try {
            System.out.println("\n  OCTAVOS ");

            o1.setGanador(
                    jugarPartido(o1.getEquipo1(), o1.getEquipo2()));

            o2.setGanador(
                    jugarPartido(o2.getEquipo1(), o2.getEquipo2()));

            o3.setGanador(
                    jugarPartido(o3.getEquipo1(), o3.getEquipo2()));

            o4.setGanador(
                    jugarPartido(o4.getEquipo1(), o4.getEquipo2()));

            o5.setGanador(
                    jugarPartido(o5.getEquipo1(), o5.getEquipo2()));

            o6.setGanador(
                    jugarPartido(o6.getEquipo1(), o6.getEquipo2()));

            o7.setGanador(
                    jugarPartido(o7.getEquipo1(), o7.getEquipo2()));

            o8.setGanador(
                    jugarPartido(o8.getEquipo1(), o8.getEquipo2()));
        } catch (NullPointerException e) {
            System.out.println("Primero se debe cargar el fixture de octavos");
        }

    }

    public void cargarCuartos() {

        try {
            System.out.println("\n CUARTOS ");

            c1.setEquipo1(o1.getGanador());
            c1.setEquipo2(o2.getGanador());

            c1.setGanador(
                    jugarPartido(c1.getEquipo1(), c1.getEquipo2()));

            c2.setEquipo1(o3.getGanador());
            c2.setEquipo2(o4.getGanador());

            c2.setGanador(
                    jugarPartido(c2.getEquipo1(), c2.getEquipo2()));

            c3.setEquipo1(o5.getGanador());
            c3.setEquipo2(o6.getGanador());

            c3.setGanador(
                    jugarPartido(c3.getEquipo1(), c3.getEquipo2()));

            c4.setEquipo1(o7.getGanador());
            c4.setEquipo2(o8.getGanador());

            c4.setGanador(
                    jugarPartido(c4.getEquipo1(), c4.getEquipo2()));
        } catch (NullPointerException e) {
            System.out.println("Primero se debe cargar el fixture de octavos o la fase previa");
        }

    }

    public void cargarSemifinales() {

        try {
            System.out.println("\n  SEMIS ");

            s1.setEquipo1(c1.getGanador());
            s1.setEquipo2(c2.getGanador());

            s1.setGanador(
                    jugarPartido(s1.getEquipo1(), s1.getEquipo2()));

            s2.setEquipo1(c3.getGanador());
            s2.setEquipo2(c4.getGanador());

            s2.setGanador(
                    jugarPartido(s2.getEquipo1(), s2.getEquipo2()));
        } catch (NullPointerException e) {
            System.out.println("Primero se debe cargar el fixture de octavos o la fase previa");
        }

    }

    public void cargarFinal() {

        try {
            System.out.println("\n FINAL ");

            f.setEquipo1(s1.getGanador());
            f.setEquipo2(s2.getGanador());

            f.setGanador(
                    jugarPartido(f.getEquipo1(), f.getEquipo2()));
        } catch (NullPointerException e) {
            System.out.println("Primero se debe cargar el fixture de octavos o la fase previa");
        }

    }

    public void mostrarCampeon() {

        System.out.println("\n CAMPEON ");
        System.out.println(f.getGanador());
    }
}
