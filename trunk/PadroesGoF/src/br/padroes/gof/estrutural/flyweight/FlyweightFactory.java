package br.padroes.gof.estrutural.flyweight;

import java.util.HashMap;

class FlyweightFactory {

  private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

  // Constructor
  public FlyweightFactory() {
    flyweights.put("X", new ConcreteFlyweight());
    flyweights.put("Y", new ConcreteFlyweight());
    flyweights.put("Z", new ConcreteFlyweight());
  }

  public Flyweight getFlyweight(String key) {
    return flyweights.get(key);
  }
}
