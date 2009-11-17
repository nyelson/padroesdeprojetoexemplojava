package br.padroes.gof.estrutural.decorator;

/**
 * Implementação de uma simples Window sem barras de rolagens
 * (ConcreteComponent)
 */
class SimpleWindow implements Window {
    public void draw() {
        // draw window
    }
 
    public String getDescription() {
        return "simple window";
    }
}

