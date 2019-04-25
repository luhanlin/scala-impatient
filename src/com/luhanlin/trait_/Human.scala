package com.luhanlin.trait_

/**
  * trait demo2
  * <类详细描述> 
  *
  * @author luhanlin 
  * @version [V_1.0.0, 2019/4/23 22:46] 
  * @see [相关类/方法] 
  * @since [产品/模块版本] 
  */
trait Human {
    val id :Int
    val name :String
}

trait Action {
    def getActionName() :String
}


class Student(val id :Int, val name :String) extends Human with Action {
    override def getActionName(): String = "action is running"
}

object Demo extends App {

    val allen = new Student(10, "allen")
    println(allen.id + "\t" + allen.name)

    println(allen.getActionName())
}

