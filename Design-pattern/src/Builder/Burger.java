package Builder;

public abstract class Burger implements Item {

	@Override
	public abstract String name();
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
