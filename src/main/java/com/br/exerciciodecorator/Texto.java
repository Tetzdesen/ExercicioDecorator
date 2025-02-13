package com.br.exerciciodecorator;

/**
 *
 * @author tetzner
 */
public class Texto extends Elemento {
    private String texto;
    
    public Texto(String texto){
        this.texto = texto;
    }
      
    @Override
    public String getTexto(){
        return texto;
    }
}
