package br.padroes.gof.criacao.sigleton;

import java.util.Date;

public class SingletonLog {
    // Construtor privado. Suprime o construtor público padrao.
    private SingletonLog() {
    // Leitura da configuração de log. Normalmente descrita em um arquivo.
    }

    // Faz o log de eventos da aplicacao
    public void doLog(String eventDescription) {
    	System.out.println(new Date() + " - " + eventDescription);
    }

    //Retorna a instância única da classe SingletonLog
    public static SingletonLog getInstance() {
        return SingletonLogHolder.instance;
    }

    //Classe auxiliar para criacao da instancia. Evita problemas de sincronizacao de threads.
    private static class SingletonLogHolder {
           private static SingletonLog instance = new SingletonLog();
    }
}