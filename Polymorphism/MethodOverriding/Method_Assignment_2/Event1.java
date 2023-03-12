class Event{
    //Implement your code here
    private String eventName;
    private String participantName;
    private double registrationFee;
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getParticipantName() {
        return participantName;
    }
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }
    public double getRegistrationFee() {
        return registrationFee;
    }
    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public Event(String eventName, String participantName) {
        this.eventName = eventName;
        this.participantName = participantName;
    }
    public void registerEvent()
    {
        if(eventName.equals("Singing")) this.registrationFee=8;
        else if(eventName.equals("Dancing")) this.registrationFee=10;
        else if(eventName.equals("DigitalArt")) this.registrationFee=12;
        else if(eventName.equals("Acting")) this.registrationFee=15;
        else this.registrationFee = 0;
    }

}

class SoloEvent extends Event{
    //Implement your code here
    private int participantNo;

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public SoloEvent(String eventName,String participantName,int participantNo) {
        super(eventName,participantName);
        this.participantNo = participantNo;
    }
    
    public void registerEvent()
    {
        super.registerEvent();
    }

}

class TeamEvent extends Event{
    //Implement your code here
    private int noOfParticipants;
    private int teamNo;
    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }
    public int getNoOfParticipants() {
        return noOfParticipants;
    }
    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }
    public int getTeamNo() {
        return teamNo;
    }
    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerEvent()
    {
        int basefare=0;
        if(this.noOfParticipants>1)
        {
        if(super.getEventName().equals("Singing")) basefare=4;
        else if(super.getEventName().equals("Dancing")) basefare=6;
        else if(super.getEventName().equals("DigitalArt")) basefare=8;
        else if(super.getEventName().equals("Acting")) basefare=10;
        else super.setRegistrationFee(0);
        }
        
        super.setRegistrationFee(this.noOfParticipants*basefare);
    }
}

class Tester {

      public static void main(String[] args) {
            
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}
