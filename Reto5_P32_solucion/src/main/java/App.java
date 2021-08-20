import view.VistaRequerimientosReto5;

import controller.ControladorRequerimientosReto5;
import model.dao.LiderCiudadDao;
import model.dao.ProyectoCiudadDao;
import model.dao.SumaProveedorDao;

public class App{

    public static void main(String[] args) {

        // Casos de prueba

        // Requerimiento 1 - Reto3
        //VistaRequerimientosReto4.requerimiento1();
        //System.out.println();

        // Requerimiento 3 - Reto3
        //VistaRequerimientosReto4.requerimiento3();
        //System.out.println();

        // Requerimiento 4 - Reto3
        //VistaRequerimientosReto4.requerimiento4();
        //System.out.println();

        VistaRequerimientosReto5 vista = new VistaRequerimientosReto5();
        ProyectoCiudadDao modelo1 = new ProyectoCiudadDao();
        SumaProveedorDao modelo2 = new SumaProveedorDao(); 
        LiderCiudadDao modelo3 = new LiderCiudadDao(); 
        ControladorRequerimientosReto5 controlador = new ControladorRequerimientosReto5(vista, modelo1, modelo2, modelo3);

        controlador.iniciar();
        vista.setVisible(true);
        
    }
}
