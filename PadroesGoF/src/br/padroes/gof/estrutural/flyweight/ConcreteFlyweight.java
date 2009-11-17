package br.padroes.gof.estrutural.flyweight;

class ConcreteFlyweight extends Flyweight {
  public void Operation(int extrinsicstate) {
    System.out.println("ConcreteFlyweight: " + extrinsicstate);
  }
}
