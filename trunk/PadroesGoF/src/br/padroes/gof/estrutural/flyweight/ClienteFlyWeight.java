package br.padroes.gof.estrutural.flyweight;

public class ClienteFlyWeight {
	  public static void main(String[] args){
	      // Arbitrary extrinsic state
	      int extrinsicstate = 22;

	      FlyweightFactory factory = new FlyweightFactory();

	      // Work with different flyweight instances
	      Flyweight fx = factory.getFlyweight("X");
	      fx.Operation(--extrinsicstate);

	      Flyweight fy = factory.getFlyweight("Y");
	      fy.Operation(--extrinsicstate);

	      Flyweight fz = factory.getFlyweight("Z");
	      fz.Operation(--extrinsicstate);

	      UnsharedConcreteFlyweight fu = new UnsharedConcreteFlyweight();
	      fu.Operation(--extrinsicstate);
	  }
}
