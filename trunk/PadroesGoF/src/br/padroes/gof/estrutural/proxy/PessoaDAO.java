package br.padroes.gof.estrutural.proxy;

/**

 * Imagine que esta classe faz acessos ao banco de dados

 */

class PessoaDAO {

      public static Pessoa getPessoaByID(String id){

            System.out.println("select * from PESSOA where id="+id);

            return new PessoaImpl(id,"Pessoa " + id);

      }

}
