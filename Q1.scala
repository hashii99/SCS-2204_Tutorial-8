
object Main {
  def main(args: Array[String]): Unit = {
    val p1 = Point(1,0);
    val p2 = Point(1,4);
    println(p1.add(p2));

    val p3 = Point(3,2);
    val p4 = Point(5,1);
    println(p3.add(p4));
  }
}
// case class -> defined single statement with parameters
// normal class -> defined by defining method ans fields.

case class Point(a:Int, b:Int) {
  def x: Int = a
  def y: Int = b

  def add(p:Point) =  Point(a+p.a, b+p.b);
}
