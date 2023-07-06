
package evaluacion3;
import java.util.*;
public class Maquina {
    private int codigo;
    private String modelo;
    ArrayList<Reparacion> miReparacionMa;
    public Maquina(int codigo, String modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
        miReparacionMa=new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean agregarReparacions(Reparacion reparacion){
        return miReparacionMa.add(reparacion);
    }
    //......Metodo con formato de retorno......
    public String toString(){
        String arreglo=" ";
        for (Reparacion reparacion : miReparacionMa) {
            arreglo+="Fecha : "+reparacion.getFecha()+"\n";
        }
        return String.format("Codigo : %s Modelo : %s \n%s ",codigo,modelo,arreglo);
    }
}
