
package evaluacion3;

public class AplicacionDeRepacion {
// crear dos objetos de tipo Máquina con todos sus datos
// crear dos objetos de tipo Mecánico con todos sus datos
// crear tres objetos de tipo Reparación con todos sus datos
// mostrar fecha, hora y modelo de la máquina de las reparaciones de un mecánico. Es decir:
// seleccionar el número de un mecánico
// asumiendo que desconoce los datos de cada reparación, buscar cada reparación que es 
//realizada por el mecánico seleccionado
// mostrar fecha y hora de la reparación, y el modelo de la máquina

    public static void main(String[] args) {
        // TODO code application logic here
        Maquina maquina1 = new Maquina(83081,"HD92172");
        Maquina maquina2 = new Maquina(8403,"LK9012");
        Mecanico mecanico1 = new Mecanico(1,"Juan Perez");
        Mecanico mecanico2 = new Mecanico(2,"Pablo Marmol");
        
        Reparacion reparacion1 = new Reparacion("12/01/22","10:32 AM",maquina1,mecanico2);
        Reparacion reparacion2 = new Reparacion("02/01/22","10:32PM", maquina2, mecanico1);
        Reparacion reparacion3 = new Reparacion("01/02/22","3:42 PM",maquina2,mecanico2);
        System.out.println("Reparacion segun numero de mecanico");
        if(reparacion2.buscarMecanico(2)){
            System.out.println(mecanico2);
        }
        System.out.println("Reparaciones del mecanico "+mecanico2.getNombre());
        System.out.println(mecanico2);
        System.out.println("total reparaciones");
        System.out.println(reparacion1);
        System.out.println(reparacion2);
        System.out.println(reparacion3);
    }
    
}
