public class Time{
    private int minutes;
    private int seconds;
    private int hours;
  
public Time(int s, int m, int h){
minutes=m;
seconds=s;
hours=h;
 
}

public void setSecond(int sec){
if(sec>=0 && sec<=60)
   seconds=sec;

}
public void setMinutes(int min){
if(min>=0 && min<=60)
   minutes=min;

}
public void setHour(int hor){
if(hor>=0 && hor<=24)
   hours=hor;

}
public int getSeconds(){
  return seconds;

}
public int getMinutes(){
  return minutes;

}
public int getHours(){
  return hours;

}
public void display(){
System.out.println(hours + ":"+ minutes +":"+ seconds);

}
}