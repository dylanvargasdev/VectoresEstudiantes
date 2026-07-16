/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantesvectores;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class EstudiantesVectores {

    public static void main(String[] args) {
        int cantidad = 0;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes: "));
        
        //Crear vector de estudiantes
        Estudiante estudiantes[] = new Estudiante[cantidad];
        
        for (int i = 0; i < estudiantes.length; i++){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String carnet = JOptionPane.showInputDialog("Ingrese el carnet del estudiante: ");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota del estudiante: "));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota del estudiante: "));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota del estudiante: "));
            double promedio = (nota1 + nota2 + nota3) / 3;
            estudiantes[i] = new Estudiante(nombre, carnet, nota1, nota2, nota3, promedio);  
        }
        StringBuilder imp = new StringBuilder();
        for (int i = 0; i < estudiantes.length; i++){
            imp.append(estudiantes[i].toString());
            imp.append("\n");
        }
        JOptionPane.showMessageDialog(null, imp);
    }
}
