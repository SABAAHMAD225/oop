public class Student{
private String name;
private String email;
private double cgpa;
public void setname(String name1){
name = name1;
}
public void setemail(String email1){
email= email1;
}
public void setcgpa(double cgpa1){
cgpa = cgpa1;
}
public void display(){
System.out.println("Student name is" +name);
System.out.println("Student email is" +email );
System.out.println("Student cgpa is" +cgpa);


}

}