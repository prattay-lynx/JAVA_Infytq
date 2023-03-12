class Student{
    //Implement your code here
    private final int STIPEND=100;
    private int studentId;
    private int aggregateMarks;
    public double calculateTotalStipend()
    {
        double totalStipend;
        if(this.aggregateMarks>=85 && this.aggregateMarks<90)
            totalStipend = this.STIPEND + 10.0;
        else if(this.aggregateMarks>=90 && this.aggregateMarks<95) totalStipend = this.STIPEND + 15.0;
        else totalStipend = this.STIPEND + 20.0;

        return totalStipend;
    }
    public int getSTIPEND() {
        return STIPEND;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getAggregateMarks() {
        return aggregateMarks;
    }
    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }
}

class Student1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}

}