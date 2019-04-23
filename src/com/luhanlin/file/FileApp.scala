package com.luhanlin.file

import java.io.{BufferedReader, File, FileInputStream, PrintWriter}

import scala.io.{BufferedSource, Source}

object FileApp extends App {

    //    private val source: BufferedSource = Source.fromFile("E:\\big_data\\test.txt", "UTF-8")
    //
    //    private val reader: BufferedReader = source.bufferedReader()

    //    val lines = source.getLines()
    //    lines.foreach(println)

    //    print(reader.readLine())
    //    print(source.mkString)

    //    println("------------------- fromUrl-----------------")
    //    val source = Source.fromURL("http://www.baidu.com", "UTF-8")
    //    println(source.mkString)

    // 读取二进制文件
//    println("------------------- read bytes---------------")
//    var file = new File("E:\\big_data\\test\\test.zip")
//    var in = new FileInputStream(file)
//    var buffer = new Array[Byte](file.length().toInt)
//
//    in.read(buffer)
//    println(buffer.length)
//
//    in.close()

    // 写文件
    println("-----------------write file --------------------")
    val out = new PrintWriter("E:\\big_data\\test\\number.txt")
    for (i <- 0 until 10) out.println(i)

    out.close()
}
