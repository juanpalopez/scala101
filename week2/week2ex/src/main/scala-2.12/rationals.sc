object rationals {
}
val x = new Rational(1,3)
val y  = new Rational(5,7)
val z  = new Rational(3,2)
//x.numer
//x.denom
x - y - z
y + y
x + y
x < y
x max y

//val strange = new Rational(1,0)

new Rational(2)


class Rational(x:Int, y:Int) {
  require(y != 0, "Denominator must not be zero")

  def this(x:Int) = this(x,1)

  private def gcd(a:Int,b:Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x,y)

  def numer = x
  def denom = y

  def <(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  def +(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def unary_- : Rational = new Rational(-numer, denom)

  //More Elegant way to define substraction
  def - (that:Rational) = this + -that

  override def toString = numer/g + "/" + denom/g
}