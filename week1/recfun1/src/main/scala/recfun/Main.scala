package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if (c == 0 | c == r) {
        return 1
      } else {
        val sum = pascal(c-1,r-1) + pascal(c,r-1)
        return sum
      }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def parethensis_counter(acc: Int, chars: List[Char]): Int = {
        if (chars.isEmpty || acc < 0) acc
        else if (chars.head == '(') {
          parethensis_counter(acc + 1, chars.tail)
        } else if (chars.head == ')') {
          parethensis_counter(acc - 1, chars.tail)
        } else {
          parethensis_counter(acc, chars.tail)
        }
      }

      parethensis_counter(0, chars) == 0

    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
      if(money == 0)
        1
      else if (money > 0 && !coins.isEmpty)
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      else
        0
  }

