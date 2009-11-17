package br.padroes.gof.estrutural.flyweight;

class UnsharedConcreteFlyweight extends Flyweight {
  public void Operation(int extrinsicstate) {
    System.out.println("ConcreteFlyweight: " + extrinsicstate);
  }
}
