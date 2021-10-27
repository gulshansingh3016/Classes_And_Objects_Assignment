package com.knoldus.Nat

object CallNat extends App {
  val zero = new Succ(Zero)
  val one = new Succ(zero)

  val integer = IntegerNumber(one)
  val integer1 = IntegerNumber(zero, Negative)
  println(integer)
  println(integer1)

}
