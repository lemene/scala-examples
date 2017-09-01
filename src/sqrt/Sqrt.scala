/**
 * 使用Newton法实现sqrt函数
 * 演示如何方便定义函数、内嵌函数
 */

object Sqrt {
  def main(args:Array[String]): Unit = {
    val x = args(0).toDouble
    if (x >= 0)    
      println(sqrt(x))
    else
      println("x must be >= 0")
  }

  def sqrt(x:Double): Double = {
    val ESP = 0.0001;

    def abs(x:Double) = if (x < 0) -x else x
    def isgood(y:Double) = abs(y*y - x) < ESP
    def improve(y:Double) = (y + x/y) / 2
    def iter(y:Double):Double = if (!isgood(y)) iter(improve(y)) else y

    iter(1.0)
  }

}
