/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantesvectores;

/**
 *
 * @author Laboratorio
 */
public class Estudiante {
    private String nombre;
    private String carnet;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Estudiante(String nombre, String carnet, double nota1, double nota2, double nota3, double promedio) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carnet=" + carnet + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", promedio=" + promedio + '}';
    }
    
    
    
}
