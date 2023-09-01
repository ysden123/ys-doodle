/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.doodle.example

import cats.effect.unsafe.implicits.global
import doodle.core.*
import doodle.java2d.*
import doodle.syntax.all.*

object Shape02:
  def main(args: Array[String]): Unit =
    println("==>main")
    val basicShapes =
      Picture
        .circle(200)
        .strokeColor(Color.blue)
        .on(Picture.rectangle(125,125).strokeColor(Color.darkBlue))
        .on(Picture.triangle(100, 100).strokeColor(Color.crimson))
        .strokeWidth(5.0)

    basicShapes.draw()

