package org.specs2
package matcher

import scala.reflect.macros.Context
import scala.annotation.StaticAnnotation

/**
 * Macro definitions to generate matchers for the members of a type T
 */
trait MatcherMacros {
  def matchA[T]  = macro ???
  def matchAn[T] = macro ???

  class fieldMatcherBody(tree: Any) extends StaticAnnotation
}

/**
 * Macros implementations
 *
 * The bulk of the implementation is credited to:
 *
 * - @travisbrown for his ["vampire methods"](http://meta.plasm.us/posts/2013/08/31/feeding-our-vampires/)
 * - @retronym for his help on [range positions](https://groups.google.com/forum/#!topic/scala-internals/fmWKw5TDz98)
 * - @xeno_by for his help on macros in general!
 */
object MatcherMacros extends MatcherMacros {

}

