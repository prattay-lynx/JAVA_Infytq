class Participant {
    //Implement your code here
    private static int counter;
    private String registrationId="D";
    private String name;
    private long contactNumber;
    private String city;

    static
    {
        counter=10001;
    }
    public String toString(String registrationId)
    {
        return registrationId + getCounter();
    }
    public Participant(String name,long contactNumber,String city)
    {
        this.name=name;
        this.contactNumber=contactNumber;
        this.city=city;
    }
    public String getRegistrationId()
    {
        return toString(registrationId);
    }
    public static int getCounter()
    {
        return counter++;
    }
    public static void setCounter(int counter)
    {
        counter=1001;
    }
    public String getName()
    {
        return this.name;   
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public long getContactNumber()
    {
        return this.contactNumber;
    }
    public void setContactNumber(long contactNumber)
    {
        this.contactNumber=contactNumber;
    }
    public String getCity()
    {
        return this.city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
}

class Audience {

	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}
} 