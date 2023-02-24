/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaue.segundo.projeto.nivelamento;

/**
 *
 * @author rails
 */
public class Interpolacao {
    public static void main(String[] args) {
        
        String nome = "Xampson";
        Integer idade = 42;
        Double altura = 1.56;
        
        //%s, é usado para string
        //%d, é usado para inteiros
        //%.3f é usado para double ( o nº representa as casas decimais)
        
        System.out.println(
                String.format(
                        "Meu nome é %s, tenho %d anos de idade e %.2f de altura.", 
                        nome, idade, altura));
    }
}
