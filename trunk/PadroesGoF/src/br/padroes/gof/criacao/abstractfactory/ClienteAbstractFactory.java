package br.padroes.gof.criacao.abstractfactory;

public class ClienteAbstractFactory
{
    public static void main(String[] args)
    {
        WidgetFactory factory = WidgetFactory.obterFactory();

        Botao botao = factory.criarBotao();
        botao.desenhar();
    }
}

