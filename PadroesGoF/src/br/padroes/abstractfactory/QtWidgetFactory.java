package br.padroes.abstractfactory;

class QtWidgetFactory extends WidgetFactory
{
    public Botao criarBotao()  {
        return new BotaoQt();
    }
}