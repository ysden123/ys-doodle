/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.doodle.example

import doodle.core._
import doodle.syntax.all._
import doodle.java2d._
import cats.effect.unsafe.implicits.global

object Line01:
  def main(args: Array[String]): Unit =
    println("==>main")

    val points = Seq(
      Point(0, 0),
      Point(1, 1),
      Point(2, 2),
      Point(3, 3)
    )

    /*
        val lines=points.zipWithIndex.map{
          case (p, i) =>
            OpenPath.interpolatingSpline()
            Picture. Line(p, points((i+1)%points.length))
        }*/
    OpenPath.interpolatingSpline(points).path.strokeColor(Color.black).draw()