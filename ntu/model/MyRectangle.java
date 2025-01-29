package ntu.model;

/**
 * Rechteck
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MyRectangle {

   private MyPoint bottomRightPoint;
   private MyPoint topLeftPoint;

   public MyRectangle(MyPoint topLeftPoint, MyPoint bottomRightPoint) {
      this.topLeftPoint = topLeftPoint;
      this.bottomRightPoint = bottomRightPoint;
   }

   public double getArea() {
      MyPoint topRightPoint = new MyPoint(bottomRightPoint.getX(), topLeftPoint.getY());
      MyPoint bottomLeftPoint = new MyPoint(topLeftPoint.getX(), bottomRightPoint.getY());
      double length = topLeftPoint.distance(topRightPoint);
      double width = topLeftPoint.distance(bottomLeftPoint);
      return length * width;
   }

   public double getPerimeter() {
      MyPoint topRightPoint = new MyPoint(bottomRightPoint.getX(), topLeftPoint.getY());
      MyPoint bottomLeftPoint = new MyPoint(topLeftPoint.getX(), bottomRightPoint.getY());
      double length = topLeftPoint.distance(topRightPoint);
      double width = topLeftPoint.distance(bottomLeftPoint);
      return 2 * length + 2 * width;
   }

   @Override
   public String toString() {
      return "MyRectangle [topLeftPoint=" + topLeftPoint + ", bottomRightPoint=" + bottomRightPoint
            + "]";
   }

}
