package idealized.scala

/**
  * Created by juanpa on 28/05/17.
  */
/*
abstract class Boolean {
  def ifThenElse[T](t: => T, e: => T): T

  def && (x: => Boolean): Boolean =  ifThenElse(x, false)

  def || (x: => Boolean): Boolean = ifThenElse(true, x)

  def unary_! : Boolean

  def == (x: => Boolean): Boolean = ifThenElse(x, x.unary_!)

  def =! (x: => Boolean): Boolean =  ifThenElse(x.unary_!, x)

  def < (x: => Boolean): Boolean = ifThenElse(false, x)
}


object true extends Boolean {
  def ifThenElse[T](t: => T, e: => T): T = t
}

object false extends Boolean {
  def ifThenElse[T](t: => T, e: => T): T = e
}*/
