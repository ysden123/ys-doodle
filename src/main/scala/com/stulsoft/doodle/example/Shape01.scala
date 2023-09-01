/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.doodle.example

import doodle.core._
import doodle.java2d._
import doodle.syntax.all._
import cats.effect.unsafe.implicits.global

object Shape01:
  def main(args: Array[String]): Unit =
    println("==>main")
    val basicShapes =
      Picture
        .circle(200)
        .strokeColor(Color.blue)
        .on(Picture.square(125).strokeColor(Color.darkBlue))
        .on(Picture.triangle(100, 100).strokeColor(Color.crimson))
        .strokeWidth(5.0)

    basicShapes.draw()

