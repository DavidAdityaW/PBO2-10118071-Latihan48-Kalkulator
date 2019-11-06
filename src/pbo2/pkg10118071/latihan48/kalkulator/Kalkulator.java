/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     nilai inputan dengan perhitungan kalkulator
 * 
 */
public class Kalkulator {
    
    private double value1;
    private double value2;
    
    public void setValue1(double value1) {
        this.value1 = value1;
    }
    
    public double getValue1() {
        return value1;
    }
    
    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public double getValue2() {
        return value2;
    }
    
    public void setNameProject() {
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject() {
        System.out.println("This project shown you how to manage method in java");
    }
    
    public double add(double val1, double val2) {
        return val1 + val2;
    }
    
    public double minus(double val1, double val2) {
        return val1 - val2;
    }
    
    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }
    
    public double division(double val1, double val2) {
        return val1 / val2;
    }
    
}
