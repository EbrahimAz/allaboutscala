package com.allaboutscala.ch1.tutorial6

object HelloWorldWithArgss extends App {
  println("Hello World From Scala with Arguments")
  println("command line arguments are: ")
  println(args.mkString(","))
  println(args(0))
  println("done!")



}
