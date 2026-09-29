package vista;

import controlador.EmpleadoControlador;
import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmpleadoControlador controlador = new EmpleadoControlador();
            VentanaEmpleados ventana = new VentanaEmpleados(controlador);
            ventana.setVisible(true);
        });
    }
}