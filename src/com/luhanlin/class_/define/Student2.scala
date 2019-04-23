package com.luhanlin.class_.define

import scala.collection.mutable.ArrayBuffer

/**
  * 内部类
  *
  * 需求：定义一个学生类，同时要保存学生的成绩信息
  */
class Student2 {
  //定义学生的属性：
  private var stuName :String = "Tom"
  private var stuAge : Int = 20

  //定义一个数组，来保存学生的课程成绩信息

  private var courseList = new ArrayBuffer[Course]()

  //定义一个函数，用于添加学生课程成绩
  def addNewCourse(cname:String,grade:Int) = {
    //创建课程成绩信息
    var c = new Course(cname,grade)

    //添加到学生对象中
    courseList += c
  }

  //定义课程类
  class Course(var courseName:String,var grade : Int){

  }
}

object Student2 {
  def main(args: Array[String]): Unit = {

    //创建学生对象
    var s = new Student2

    //给学生添加课程信息
    s.addNewCourse("Chinese",70)
    s.addNewCourse("Math",80)
    s.addNewCourse("English",60)

    println(s.stuName +"\t" +s.stuAge)
    println("-------课程信息--------")
    for (c <- s.courseList) println(c.courseName+"\t" +c.grade)

  }

}
