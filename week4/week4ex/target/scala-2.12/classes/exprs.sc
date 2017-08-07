import week3ex.{Expre,Number,Sum}

object exprs {
  def show(e: Expre): String = e match {
    case Number(x) => x.toString
    case Sum(x1,x2) => show(x1) + " + " + show(x2)
  }
}

Number(1)
Number(2)
week3ex.Sum(Number(1),Number(2))
//show(Sum(Number(1),Number(3)))