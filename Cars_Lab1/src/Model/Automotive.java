package Model;

public class Automotive {
	private String CarModel;
	private int BasePrice;
	private int OptionSetSize;
	OptionSet[] AutoOption;
	
	// Constructors
	public Automotive()
	{
		//AutoOption = new OptionSet[1];
		initOpset(OptionSetSize);
	}
	
	public Automotive(String CarModel,int BasePrice, int OptionSetSize)
	{
		this.CarModel = CarModel;
		this.BasePrice = BasePrice;
		this.OptionSetSize = OptionSetSize;
		initOpset(OptionSetSize);
	}
	
	
	//Set and get default fns
	public int getBasePrice() {
		return BasePrice;
	}
	
	public void setBasePrice(int basePrice) {
		this.BasePrice = basePrice;
	}
	
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		this.CarModel = carModel;
	}

	public int getOptionSetSize() {
		return OptionSetSize;
	}

	public void setOptionSetSize(int optionSetSize) {
		this.OptionSetSize = optionSetSize;
		initOpset(OptionSetSize);
	}
	
	
	public void initOpset(int size) { // initialize opset[] with its size
		this.AutoOption = new OptionSet[size];
		//AutoOption[0] = new OptionSet();
		for ( int i=0; i<AutoOption.length; i++) {
			AutoOption[i]=new OptionSet();
			}
		//this.size = size;
		//for(int i = 0; i < size; i++) {
		//	AutoOption.add(new OptionSet()); 
		
	}
	
	public void setOptionsetName(int i, String name) {
		System.out.println(AutoOption.length);
		//System.out.println(i);
		//System.out.println(name);
		AutoOption[i].setCarConfig(name);
	}
	
	public void AutoaddOptionCountToOptionSet(int i, int count)
	{
		AutoOption[i].setOptionCount(count);
	}
	
	public void AutoaddOptionToOptionSet(int i, int j, String name, int price)
	{
		AutoOption[i].setOptiontoOptionSet(j, name, price);
	}
    public void printModel()
    {
    	System.out.printf("Model name: %s\n", CarModel);
    	System.out.printf("Base proce: %d\n", BasePrice);
    	System.out.printf("Option Size: %d\n", OptionSetSize);
    	System.out.println(AutoOption.length);
    	for (int i=0; i < AutoOption.length; i++)
    	{
    		AutoOption[i].printOptionSet();
    		//System.out.println(AutoOption[i].getCarConfig());
    	}
     }
	

}
