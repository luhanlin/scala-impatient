package com.luhanlin.file

import java.io.BufferedReader

import scala.io.{BufferedSource, Source}

object FileApp extends App {

    private val source: BufferedSource = Source.fromFile("filePath.txt", "UTF-8")

    private val reader: BufferedReader = source.bufferedReader()

//    print(reader.readLine())
//    print(source.mkString)

}
