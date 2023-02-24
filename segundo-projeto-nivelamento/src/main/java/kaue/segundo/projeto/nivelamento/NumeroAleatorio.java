/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaue.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rails
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        // Da para fazer usando essa classe
        // Math.random
        // Mas precisa criar objeto, tipo Scanner
    
        Integer numeroSorteado = 
                ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("Número sorteado: " + numeroSorteado);
        
        System.out.println("Número Double sorteado: " +
                ThreadLocalRandom.current().nextDouble(1.3, 54.7));
    }   
}
