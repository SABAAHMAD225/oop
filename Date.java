class Date{

	int day;
	int month;
	int year;
      private Time time;

      Date(int d,int m, int y,Time t){
                day=d;
		month=m;
		year=y; 
                time=t;
    }
  public void setTime(Time t){
       time=t;
    }
 public Time getTime(){
       return time;
}
 

	

	public void display(){
		System.out.println(day+"-"+ month+"-"+ year);
                 time.display();

	 }
    

}