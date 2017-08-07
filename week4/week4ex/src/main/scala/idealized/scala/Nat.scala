
//Peano numbers
package idealized.scala.ex2

/**
  * Created by juanpa on 28/05/17.
  */
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

object Zero extends  Nat {
  def isZero: Boolean = true

  def predecessor: Nat = throw new UnsupportedOperationException("no natural predecessor for zero")

  def + (that: Nat): Nat = that

  def - (that: Nat): Nat =
    if (that.isZero) this
    else throw new UnsupportedOperationException("negative number")
}

class Succ(n: Nat) extends Nat{
  def isZero: Boolean = false

  def predecessor: Nat = n

  def + (that: Nat): Nat = new Succ(n + that)
  def - (that: Nat): Nat = if (that.isZero) this else n - that.predecessor

}