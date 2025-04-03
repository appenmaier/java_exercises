package ntu.model;

/**
 * Dreieck
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MyTriangle {

   private MyPoint v1;
   private MyPoint v2;
   private MyPoint v3;

   public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
      this.v1 = v1;
      this.v2 = v2;
      this.v3 = v3;
   }

   public double getPerimeter() {
      return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
   }

   public String getType() {
      double distance1 = v1.distance(v2);
      double distance2 = v2.distance(v3);
      double distance3 = v3.distance(v1);

      if (distance1 == distance2 && distance2 == distance3) {
         return "Equilateral";
      } else if (distance1 == distance2 || distance2 == distance3 || distance1 == distance3) {
         return "Isoceles";
      } else {
         return "Scalene";
      }

   }

   @Override
   public String toString() {
      return "MyTriangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
   }

}
