package br.padroes.gof.criacao.abstractfactory;

class QtWidgetFactory extends WidgetFactory
{
    public Botao criarBotao()  {
        return new BotaoQt();
    }
}