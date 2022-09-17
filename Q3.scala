import scala.math.{pow, sqrt}

object Main {
  def main(args: Array[String]): Unit = {
    val p1=Point(2,3);
    val p2=Point(4,7);

    println(p1.distance(p2));
  }
}

case class Point(a:Int, b:Int) {
  def x:Int = a;
  def y:Int = b;

  def distance (other:Point):Double = sqrt(pow(x-other.x,2)+ pow(y-other.y,2))
  // let 2 points, (x1,y1) and (x2,y2)
  // distance between 2 points = sqrt((x2-x1)^2 + (y2-y1)^2)

}
