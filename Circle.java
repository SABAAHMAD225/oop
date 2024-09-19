public class Circle{
   private double radius;
   private point center;

   public void setCenter(point c1){
   center=c1;
  }
   
   public void setRadius(double r1){
    radius=r1;
}
   public void display(){
   system.out.println("radius :" +radius);
   center.display();

}




}