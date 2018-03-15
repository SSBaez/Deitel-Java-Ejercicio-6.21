package com.ssbaez.ejercicio621;

import java.util.Scanner;

public class SeparacionDigitos {
	
public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Aplicacion que calcula la parte entera del cociente y del residuo de una division entera, además"
                         + "muestra cada numero como una secuencia de digitos");
        System.out.printf("Ingrese el primer numero entero (1 - 99999) %n%s", "----> ");
        int num1 = input.nextInt();
        System.out.printf("Ingrese el primer numero entero %n%s", "----> ");
        int num2 = input.nextInt();
        
        int cociente = obtCociente(num1, num2);
        System.out.printf("%nEl cociente es: %d%n", cociente);
        int residuo = obtResiduo(num1, num2);
        System.out.printf("El residuo es: %d%n", residuo);
        
        System.out.println("\nSeparacion de digitos");
        mostrarDigitos(num1);
        System.out.println("");
        mostrarDigitos(num2);
        System.out.println("");
        
    }
    
    public static int obtCociente(int a, int b){
        
        int cociente = a / b;
        
        return cociente;
    }
    
    public static int obtResiduo(int a, int b){
        
        int residuo = a % b;
       
        return residuo;
    }
    
    public static int mostrarDigitos(int a){
        
    	int secuencia = 0;
    	
        String digitos = Integer.toString(a);
        
        int longitud = digitos.length();
        int j = 1;
        
        for(int i = 1; i <= longitud; i++) {
        	
        	int div = 1;
        	int lon = longitud;
        	
        	div *= Math.pow(10, (lon - j));
        	j++;
        	int cociente = obtCociente(a, div);
        	int digito = obtResiduo(cociente, 10);
        	
        	System.out.printf("%d  ", digito);
        	
        }
        
        return secuencia;
    }

}
