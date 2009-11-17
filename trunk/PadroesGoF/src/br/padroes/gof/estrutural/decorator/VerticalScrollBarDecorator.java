package br.padroes.gof.estrutural.decorator;

/** 
 * the first concrete decorator which adds vertical scrollbar functionality
 * (ConcreteDecorator)
 *
 */
class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator (Window decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        drawVerticalScrollBar();
        decoratedWindow.draw();
    }
 
    private void drawVerticalScrollBar() {
        // draw the vertical scrollbar
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }
}

