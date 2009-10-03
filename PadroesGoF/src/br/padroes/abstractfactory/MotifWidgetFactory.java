package br.padroes.abstractfactory;

class MotifWidgetFactory extends WidgetFactory
{
    public Botao criarBotao()  {
        return new BotaoMotif();
    }
}
