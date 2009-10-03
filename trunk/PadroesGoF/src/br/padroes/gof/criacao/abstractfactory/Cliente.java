package br.padroes.gof.criacao.abstractfactory;

public class Cliente
{
    public static void main(String[] args)
    {
        WidgetFactory factory = WidgetFactory.obterFactory();

        Botao botao = factory.criarBotao();
        botao.desenhar();
    }
}

