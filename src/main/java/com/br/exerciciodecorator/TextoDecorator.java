package com.br.exerciciodecorator;

/**
 *
 * @author tetzner
 */
public abstract class TextoDecorator extends Elemento {
    
    private final Elemento elementoDecorado;
    
    public TextoDecorator(Elemento elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }
    
    @Override
    public String getTexto() {
        return elementoDecorado.getTexto();
    }

}
