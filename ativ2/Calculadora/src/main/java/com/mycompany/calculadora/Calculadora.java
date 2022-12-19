/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author leleo
 */
public class Calculadora {
    
    int PrimeiroNumero;
    int SegundoNumero;
    
    
    public int Subtracao(){
    
        int Resultado = PrimeiroNumero - SegundoNumero;
        return Resultado;
    }
    
    public int Divisao(){
        
        int Resultado = PrimeiroNumero / SegundoNumero;
        return Resultado;
    }
    
    
    public int Multiplicacao(){
        
        int Resultado = PrimeiroNumero * SegundoNumero;
        return Resultado;
    }
    
    public int Somar(){
            
        int Resultado = PrimeiroNumero + SegundoNumero;
        return Resultado;
    }
    
    
    public Calculadora(int num1, int num2){
        PrimeiroNumero = num1;
        SegundoNumero = num2;
    }

}
