object Chapter2 {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def recursiveCalc(c: Int, n1: Int, n2:Int): Int = {
      if (c==n) n2
      else recursiveCalc(c+1, n2, n1+n2)
    }
    if (n==1) 0
    else if (n==2) 1
    else recursiveCalc(2, 0, 1)
  }

  def isSorted[A](as: Array[A], ordered: (A,A)=>Boolean): Boolean = {
    def compare(i: Int): Boolean = {
      if (i==as.length-1) true
      else if (!ordered(as(i),as(i+1))) false
      else compare(i+1)
    }
    compare(0)
  }

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = (a: A) => ((b: B)=>f(a,b))

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def compose[A,B,C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))
}
