package tpeda;

import java.util.Scanner;


public class ArbolFixture {
    
    private NodoPartido raiz;
    private Scanner s = new Scanner(System.in);
    
    public ArbolFixture() {
        raiz = null;
    }
    
    
    public NodoPartido getRaiz() {
        return raiz;
    }
    
    
    public int altura(NodoPartido nodo) {

    if (nodo == null) {
        return 0;
    }

    int izq = altura(nodo.getIzquierdo());
    int der = altura(nodo.getDerecho());

    return Math.max(izq, der) + 1;
}
    public void generarFix (String[] eq) { 
        NodoPartido o1 = new NodoPartido(eq[0], eq [1]); 
        NodoPartido o2 = new NodoPartido(eq[2], eq [3]); 
        NodoPartido o3 = new NodoPartido(eq[4], eq [5]); 
        NodoPartido o4 = new NodoPartido(eq[6], eq [7]); 
        NodoPartido o5 = new NodoPartido(eq[8], eq [9]); 
        NodoPartido o6 = new NodoPartido(eq[10], eq [11]); 
        NodoPartido o7 = new NodoPartido(eq[12], eq [13]); 
        NodoPartido o8 = new NodoPartido(eq[14], eq [15]); 
    
        
        
        NodoPartido c1 = new NodoPartido ("" , "" ) ;
        NodoPartido c2 = new NodoPartido ("" , "" ) ;
        NodoPartido c3 = new NodoPartido ("" , "" ) ;
        NodoPartido c4 = new NodoPartido ("" , "" ) ;
        
        c1.setIzquierdo(o1);
        c1.setDerecho(o2);
        
        c2.setIzquierdo(o3);
        c2.setDerecho(o4);
        
        c3.setIzquierdo (o5); 
        c3.setDerecho(o6);
        
        c4.setIzquierdo(o7);
        c4.setDerecho(o8);
        
        NodoPartido s1 = new NodoPartido ("" , " ") ; 
        NodoPartido s2 =  new NodoPartido ("", ""); 
        
        s1.setIzquierdo(c1);
        s1.setDerecho(c2);
        
        s2.setIzquierdo(c3);
        s2.setDerecho(c4);
        
        NodoPartido f = new NodoPartido ("", "");  
       f.setIzquierdo(s1);
       f.setDerecho(s2);
       
       raiz = f ; 
    }
    
    public void cargarR (NodoPartido nodo)  { 
        if (nodo == null ) {
            return;}
        
        cargarR(nodo.getIzquierdo()); 
        cargarR(nodo.getDerecho()); 
        int h = altura(nodo);

if (h == 4) {
    System.out.println("\n========== FINAL ==========");
}

if (h == 3) {
    System.out.println("\n====== SEMIFINALES ======");
}

if (h == 2) {
    System.out.println("\n==== CUARTOS DE FINAL ====");
}
        if (nodo.getIzquierdo() == null 
                && nodo.getDerecho() == null) { 
            

System.out.println(
    nodo.getEquipo1() + " vs " +
    nodo.getEquipo2());

            
String ganador ;


do {
    System.out.print("Ganador: ");
    ganador = s.nextLine();

} while (ganador.isEmpty() ||
        (!ganador.equalsIgnoreCase(nodo.getEquipo1()) &&
         !ganador.equalsIgnoreCase(nodo.getEquipo2())));

nodo.setGanador(ganador);

System.out.println("Equipo 1: " + nodo.getEquipo1());
System.out.println("Equipo 2: " + nodo.getEquipo2());
System.out.println("Ingresado: " + ganador);
        } 
        
        else {
        String ganadorIzq =
    nodo.getIzquierdo().getGanador();

String ganadorDer = nodo.getDerecho().getGanador() ;

   
nodo.setEquipo1(ganadorIzq);
nodo.setEquipo2(ganadorDer); 
            System.out.println( ganadorIzq + " vs " + ganadorDer);
            
            String ganador;
            
do {
    System.out.print("Ganador: ");
    ganador = s.nextLine();

} while (ganador.isEmpty() ||
        (!ganador.equalsIgnoreCase(ganadorIzq) &&
         !ganador.equalsIgnoreCase(ganadorDer)));

nodo.setGanador(ganador);


    }
   
} 
      public void mostrarCampeon() {

        if (raiz != null) {
            System.out.println(
                    "\nCAMPEON: "
                    + raiz.getGanador());
        }
} }
