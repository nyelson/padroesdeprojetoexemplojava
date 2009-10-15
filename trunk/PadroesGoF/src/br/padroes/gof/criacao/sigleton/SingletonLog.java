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

    /**
     * University of Maryland Computer Science researcher Bill Pugh has written about the code issues 
     * underlying the Singleton pattern when implemented in Java.[8] Pugh's efforts on the 
     * "Double-checked locking" idiom led to changes in the Java memory model in Java 5 
     * and to what is generally regarded as the standard method to implement Singletons in Java. 
     * The technique is known as the initialization on demand holder idiom, is as lazy as possible, 
     * and works in all known versions of Java. It takes advantage of language guarantees about 
     * class initialization, and will therefore work correctly in all Java-compliant compilers and 
     * virtual machines.
     * 
     * The inner class is referenced no earlier (and therefore loaded no earlier by the class loader) 
     * than the moment that getInstance() is called. Thus, this solution is thread-safe without 
     * requiring special language constructs (i.e. volatile or synchronized).
     *    
     * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    //Classe auxiliar para criacao da instancia. Evita problemas de sincronizacao de threads.
    private static class SingletonLogHolder {
           private static SingletonLog instance = new SingletonLog();
    }
}