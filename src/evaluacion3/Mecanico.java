
package evaluacion3;

import java.util.ArrayList;

public class Mecanico {
    private int numero;
    private String nombre;
    ArrayList<Reparacion> miReparacionMe;
    public Mecanico(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
        miReparacionMe=new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean buscarMecanico(Reparacion reparacion){
        return miReparacionMe.add(reparacion);
    }
    //.............Metodo con formato de retorno.......
    public String toString(){
        String arreglo ="";
        for (Reparacion reparacion : miReparacionMe) {
            arreglo+=reparacion+"\n";
        }
        return String.format("Nombre : %s Numero : %s\n%s",nombre,numero,arreglo);
    }
}
