package br.padroes.gof.comportamental.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//A concrete colleague
public class BtnBook extends JButton implements Command {
 
    Mediator med;
 
    BtnBook(ActionListener al, Mediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }
 
    public void execute() {
        med.book();
    }
 
}