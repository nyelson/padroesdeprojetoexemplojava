package br.padroes.gof.estrutural.proxy;

/**

 * Objeto real

 */

class PessoaImpl implements Pessoa {

      private String nome;

      private String id;

 

      public PessoaImpl(String id,String nome) {

            this.id       = id;

            this.nome = nome;

            // apenas para simular algo...

            System.out.println("Retornou a pessoa do banco de dados ->  " + nome);

      }

 

      public String getNome() {

            return nome;

      }

      public String getId() {

            return this.id;

      }

}
