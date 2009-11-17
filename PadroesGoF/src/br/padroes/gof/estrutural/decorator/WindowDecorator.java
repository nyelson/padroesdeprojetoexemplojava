package br.padroes.gof.estrutural.decorator;

/**
 * abstract decorator class - note that it implements Window
 * (Decorator)
 *
 */
abstract class WindowDecorator implements Window {
    protected Window decoratedWindow; // the Window being decorated
 
    public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
}