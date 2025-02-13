package com.br.exerciciodecorator;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        Elemento texto = new Texto("Olá mundo");
        
        texto = new TextoNegritoDecorator(texto, "Olá");
        
        System.out.println(texto.getTexto());
        
        texto = new TextoCaixaAltaDecorator(texto, "mundo");
        
        System.out.println(texto.getTexto());
    }
}
