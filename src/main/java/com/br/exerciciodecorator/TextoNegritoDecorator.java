package com.br.exerciciodecorator;
/**
 *
 * @author tetzner
 */
public class TextoNegritoDecorator extends TextoDecorator {

    private String textoNegrito;

    public TextoNegritoDecorator(Elemento elementoDecorado, String texto) {
        super(elementoDecorado);
        textoNegrito = texto;
    }

    @Override
    public String getTexto() {
        return  super.getTexto().replace(textoNegrito, "<b>" + textoNegrito + "</b>");
    }

}
