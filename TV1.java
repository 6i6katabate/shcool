package pin;

public class TV1 extends Electronics {

	int size;

	/** Creates a new instance of TV1 */
	public TV1(double regularPrice, String manufacturer, int size) {
		super(regularPrice, manufacturer);
		this.size = size;
	}

	// Override this method
	public double computeSalePrice() {
		return super.getRegularPrice() * 0.8;
	}
}