package org.specs2
package matcher

// class MatcherMacrosSpec extends Specification with ResultMatchers { def is = s2"""

//  It is possible to define a matcher with methods matching the public members of a given type

//  We can specify:
//    just the type to match                                               $e0
//    a value for one of the members                                       $e1
//    a matcher for one of the members                                     $e2
//    a function returning a result for one of the members                 $e3
//    several values at once                                               $e4

//  The first member value to fail will return the failure message         $e5

// """

//   val cat = Cat(name = "Kitty", age = 6, kitten = Seq(Cat("Oreo", 1), Cat("Ella", 2)))

//   def e0 = cat must matchA[Cat]
//   def e1 = cat must matchA[Cat].name("Kitty")
//   def e2 = cat must matchA[Cat].age(is(6))
//   def e3 = cat must matchA[Cat].kitten((_:Seq[Cat]) must haveSize(2))
//   def e4 = cat must matchA[Cat].name("Kitty").age(is(6)).kitten((_:Seq[Cat]) must haveSize(2))

//   def e5 = (cat must matchA[Cat].name("Kitty").age(is(7)).kitten((_:Seq[Cat]) must haveSize(2))) returns "'6' is not equal to '7'"

//   def is[A](a: A) = be_==(a)
//   case class Cat(name: String = "", age: Int = 0, kitten: Seq[Cat] = Seq())
// }

