object Main {
  def main(args: Array[String]): Unit = {
    val p1 = Point(2,1);
    println(p1.move());

    val p2 = Point(4,3);
    println(p2.move());

    val p3 = Point(5,10);
    println(p3.move());
  }
}

case class Point(a:Int, b:Int) {
  def x:Int = a;
  def y:Int = b;

  def move() = Point(x+1,y+1)
}

