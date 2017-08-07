package week3ex
/**
  * Created by juanpa on 15/05/17.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false
  override def toString: String = "{" + head + tail + "}"
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")

  override def toString: String = "."
}

object List {
  //List()
  def apply[T](): List[T] = new Nil[T]

  //List(1)
  def apply[T](x1: T): List[T] = new Cons(x1, new Nil)

  //List(2,3)
  def apply[T](x1: T ,x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil[T]))
}