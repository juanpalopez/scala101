package week3ex

/**
  * Created by juanpa on 23/06/17.
  */

trait Expre
case class Sum(e1: Expre, e2: Expre) extends Expre
case class Number(n:Int) extends Expre