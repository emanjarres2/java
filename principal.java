package notas;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import notas.logica.alumno;

public class principal {
    public static void main(String args[]) {
         

        // declaro variable tipo string
        String nombre = JOptionPane.showInputDialog("Ingrese el Nombre :");
        String apellido = JOptionPane.showInputDialog("Ingrese el Apellido :");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion :");
        String genero = JOptionPane.showInputDialog("Ingrese el genero del estudiante :");
        String programa = JOptionPane.showInputDialog("Ingrese el nombre del programa :");
        String materia = JOptionPane.showInputDialog("Ingrese el nombre de la materiea :");
        // alu = new alumno(nombre, apellido, direccion, genero, programa,
        // materia).toString();
         alumno alu = new alumno(nombre,apellido,direccion,genero,programa,materia);
         // Mostrar los datos del alumno
         JOptionPane.showMessageDialog(null,alu.toString());

         
        


    }
}
