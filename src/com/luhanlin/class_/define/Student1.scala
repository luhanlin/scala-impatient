package com.luhanlin.class_.define

/**
  * class 定义变量，私有变量
  */
class Student1 {
  //定义学生的属性
  private[this] var stuId : Int = 0
  private var stuName : String = "Tom"
  private var age : Int = 20

  // 定义方法（函数） set get
  def getStuName():String = stuName
  def setStuName(newName :String) = this.stuName = newName

  def getStuage():Int = age
  def setStuage(age :Int) = this.age = age

}

/*
* 注意：object 和 class 的名字 可以不一样
*
* 如果一样的话，这个object就叫做class的 伴生对象
*
* */

object Student1{
  def main(args: Array[String]): Unit = {
    //测试
    //创建一个学生对象
    var s1 = new Student1

    // 访问他的属性并输出
    println(s1.getStuName()+"\t"+s1.getStuage())

    //访问set方法
    s1.setStuName("Andy")
    s1.setStuage(50)
    println(s1.getStuName()+"\t"+s1.getStuage())

    /*
    * 直接访问私有属性
    *
    * */

    println("-------访问私有属性--------")
    //println(s1.stuId+"\t"+s1.stuName+"\t"+s1.age)

    /*
    * 为什么我们可以访问私有成员
    *
    * s1.stuId
    *
    * 属性的set get方法
    * 1、当一个属性是private的时候，scala会自动为其生成对应的set get方法
    * s1.stuId    .stuId 调用了get方法，get方法的名字就叫 stuId
    *
    * 2、如果只希望生产get方法而不生产set方法的时候，可以定义为常量
    *
    * 3、如果希望属性不能被外部访问 使用 private[this] 关键字
    *
    * */

  }
}
