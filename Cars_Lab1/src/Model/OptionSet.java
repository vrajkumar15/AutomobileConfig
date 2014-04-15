package Model;

public class OptionSet {
	
	public String CarConfig;
	int count;
	Option[] opt;

	//Constructor
	
	public OptionSet()
	{
//		opt = new Option[1];
	}
	
	public OptionSet(String CarConfig)
	{
		this.CarConfig = CarConfig;
	}
	
//	public OptionSet(String CarConfig)
//	{
//		this.CarConfig = CarConfig;
//		//opt = new Option[count];
//	}
	
	protected void setOptionCount(int count)
	{
		initOpt(count);	
	}
	
	
	//Get and set methods
protected String getCarConfig() {
	return CarConfig;
}


protected void setCarConfig(String carConfig) {
	this.CarConfig = carConfig;
	//System.out.printf(CarConfig);
	
}

     //New methods


   protected void initOpt(int size) { // initialize opt[] with its size
	this.opt = new Option[size];
	for ( int i=0; i<opt.length; i++) {
		opt[i] = new Option();
		}
    }

   protected void setOptiontoOptionSet(int j, String name, int price)
   {
	   opt[j].setCarConfigOption(name);
	   opt[j].setConfigPrice(price);
   }
// 	protected Option getOpt(int i) {
// 	return opt[i];
// 	}

public void printOptionSet()
{
	System.out.printf("%s Option:\n", CarConfig);
	for(int i=0; i < opt.length; i++)
	{
		System.out.printf("\t%s: %d\n", opt[i].CarConfigOption, opt[i].ConfigPrice);
	}
}

public class Option {
private String CarConfigOption;
private int ConfigPrice;

Option(String CarConfigOption, int ConfigPrice)
{
this.CarConfigOption = CarConfigOption;
this.ConfigPrice = ConfigPrice;
}

public Option() {
	// TODO Auto-generated constructor stub
}

protected String getCarConfigOption() {
return CarConfigOption;
}
protected void setCarConfigOption(String carConfigOption) {
this.CarConfigOption = carConfigOption;
}
protected int getConfigPrice() {
return ConfigPrice;
}
protected void setConfigPrice(int configPrice) {
this.ConfigPrice = configPrice;
}

}

}
