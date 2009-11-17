package br.padroes.gof.estrutural.decorator;

/**
 * the second concrete decorator which adds horizontal scrollbar functionality
 * (ConcreteDecorator)
 *
 */
class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator (Window decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        drawHorizontalScrollBar();
        decoratedWindow.draw();
    }
 
    private void drawHorizontalScrollBar() {
        // draw the horizontal scrollbar
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }
}