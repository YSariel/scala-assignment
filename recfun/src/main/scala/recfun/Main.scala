package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println(balance("(if (zero? x) max (/ 1 x))".toList))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c == r || c == 0)1 else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def isbalance(ct:List[Char],c:Int):Int = {
      if(ct.isEmpty)c
      else if (c >= 0 ) {

        if (ct.head == '(') {
          isbalance(ct.tail, c + 1)
        }
        else if (ct.head == ')') {
          isbalance(ct.tail, c - 1)
        }
        else
          isbalance(ct.tail, c)
      }
      else c
    }
    isbalance(chars,0)==0

  }


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0)1
    else if(money < 0 || coins.isEmpty)0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}