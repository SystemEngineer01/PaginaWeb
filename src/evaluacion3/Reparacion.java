
package evaluacion3;
public class Reparacion {
    private String fecha;
    private String hora;
    Maquina maquina;
    Mecanico mecanico;
    //||||||||||||Constructor||||||||||||

    public Reparacion(String fecha, String hora, Maquina maquina, Mecanico mecanico) {
        this.fecha = fecha;
        this.hora = hora;
        this.maquina = maquina;
        this.mecanico = mecanico;
        maquina.agregarReparacions(this);
        mecanico.buscarMecanico(this);
    }
    //**************+getter and setter****************

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    public boolean buscarMecanico(int numero){
        if(numero==mecanico.getNumero()){
            return true;
        }
        else return false;
    }
    //-------------Metodo con formato de retorno---------
    public String toString(){
        return String.format("Fecha : %s Hora : %s\nModelo Maquina : %s",fecha,hora,maquina.getModelo());
    }
}
