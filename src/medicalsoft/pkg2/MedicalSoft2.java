package medicalsoft.pkg2;

import Clases.Medico;
import Clases.Validacion;

// Damaso Thomas

public class MedicalSoft2 {

    public static void main(String[] args) {

        Medico.setNombre("damaso isaac");
        Medico.setApellido("thomas zambrano");
        Medico.setFecha_nacimienta("15-11-2000");
        Medico.setEmail("zambranothomas2000@gmail.com");

        System.out.println("El nombre del Medico es: " + Medico.getFullNombre() + "\n"
                + "La edad del Medico es: " + Medico.getedad() + "\n"
                + "El correo del Medico es:" + Validacion.get_Valaida_Correo());

    }

}
