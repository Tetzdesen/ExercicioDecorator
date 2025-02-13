package com.br.exerciciodecorator;

/**
 *
 * @author tetzner
 */
public class TextoCaixaAltaDecorator extends TextoDecorator {

    private final String textoCaixaAlta;

    public TextoCaixaAltaDecorator(Elemento elementoDecorado, String texto) {
        super(elementoDecorado);
        this.textoCaixaAlta = texto;
    }
    
    @Override
    public String getTexto() {
        return super.getTexto().replace(textoCaixaAlta, textoCaixaAlta.toUpperCase());
    }

}
