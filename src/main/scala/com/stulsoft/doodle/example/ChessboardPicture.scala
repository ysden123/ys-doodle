/*
 * Copyright (c) 2023. StulSoft
 * See original source: http://www.creativescala.org/doodle/
 */

package com.stulsoft.doodle.example

import doodle.core._
import doodle.syntax.all._
import doodle.java2d._
import cats.effect.unsafe.implicits.global
object ChessboardPicture:
  def main(args: Array[String]): Unit =
    println("==>main")
    val blackSquare = Picture.rectangle(30, 30).fillColor(Color.black)
    val redSquare = Picture.rectangle(30, 30).fillColor(Color.red)

    // A chessboard, broken into steps showing the recursive construction
    val twoByTwo = redSquare.beside(blackSquare)
      .above(blackSquare.beside(redSquare))

    val fourByFour = twoByTwo.beside(twoByTwo)
      .above(twoByTwo.beside(twoByTwo))

//    val chessboard = redSquare.beside(blackSquare)
    val chessboard = fourByFour.beside(fourByFour)
      .above(fourByFour.beside(fourByFour))

    chessboard.draw()