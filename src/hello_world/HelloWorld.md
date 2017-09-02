# Hello World
学习新语言的第一个程序，演示程序的基本结构和编译运行方式。

```Scala
/**
 * @file HelloWorld.scala
 * @brief 第一个程序
 */

object HelloWorld {
    def main(args:Array[String]): Unit = {
        println("Hello World!!!")
    }
}
```
Scala类似Java，它代码元素和其它语言近似：
    + /\* \*/ 为注释块
    + object和def为关键字，定义对象和函数；
    + {} 用于划分代码块，()表示函数参数区
    + Array、String和Unit表示类型，分别表示数组、字符串和空
    + println为库函数，执行输出动作
    + main 程序的入口函数，args是它的参数
    + HelloWorld对象名称，需要和文件名一致；

# 编译运行

Scala代码可以直接运行，也可以编译成class文件再运行，class文件与Java兼容，可以使用java指令运行。

    scale HelloWorld.scala        # 直接运行
    scalac HelloWorld.scala       # 编译成class文件
    scala HelloWorld              # 运行class文件，不需要后缀    
    java  -cp .;scala-x.xx.xx/lib/* HelloWorld	# 需要再classpath加入scala的库

