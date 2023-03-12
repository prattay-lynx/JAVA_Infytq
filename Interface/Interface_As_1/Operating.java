interface Testable{
    //Implement your code here
    boolean testCompatibility();

}

class Mobile {
    //Implement your code here
    private String name;
    private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getOperatingSystemName() {
        return operatingSystemName;
    }
    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }
    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }
    
}

class SmartPhone extends Mobile implements Testable {
    //Implement your code here
    private String networkGeneration;

    public String getNetworkGeneration() {
        return networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion,String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    public boolean testCompatibility()
    {
        if(super.getOperatingSystemName().equals("Saturn"))
        {
            if(networkGeneration.equals("3G"))
            {
                if(super.getOperatingSystemVersion().equals("1.1")||super.getOperatingSystemVersion().equals("1.2")||super.getOperatingSystemVersion().equals("1.3"))
                {
                    return true;
                }
            }
            else if(networkGeneration.equals("4G"))
            {
                if(super.getOperatingSystemVersion().equals("1.2")||super.getOperatingSystemVersion().equals("1.3"))
                {
                    return true;
                }
            }
            else if(networkGeneration.equals("5G"))
            {
                if(super.getOperatingSystemVersion().equals("1.3"))
                {
                    return true;
                }
            }
        }
            else if(super.getOperatingSystemName().equals("Gara"))
                    {
                    if(networkGeneration.equals("3G"))
                        {
                            if(super.getOperatingSystemVersion().equals("EXRT.1")||super.getOperatingSystemVersion().equals("EXRT.2")||super.getOperatingSystemVersion().equals("EXRU.1"))
                            {
                                return true;
                            }
                        }
                        else if(networkGeneration.equals("4G"))
                        {
                            if(super.getOperatingSystemVersion().equals("EXRT.2")||super.getOperatingSystemVersion().equals("EXRU.1"))
                            {
                                return true;
                            }
                        }
                        else if(networkGeneration.equals("5G"))
                        {
                            if(super.getOperatingSystemVersion().equals("EXRU.1"))
                            {
                                return true;
                            }
                        }
                    }
            return false;

        }
    }
class Operating {
	public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
		//Create more objects for testing your code
	}
}