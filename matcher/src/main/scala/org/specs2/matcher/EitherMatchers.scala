package org.specs2
package matcher

import text.NotNullStrings._
import text.Quote._
import org.specs2.execute._
import ValueChecks._

/**
 * Matchers for the Either datatype
 */
trait EitherMatchers extends EitherBaseMatchers with EitherBeHaveMatchers
object EitherMatchers extends EitherMatchers

private[specs2]
trait EitherBaseMatchers {
  
  def beRight[T](t: ValueCheck[T]) = RightCheckedMatcher(t)
  def beRight[T] = new RightMatcher[T]

  def right[T](t: ValueCheck[T]) = beRight(t)
  def right[T] = beRight

  def beLeft[T](t: ValueCheck[T]) = LeftCheckedMatcher(t)
  def beLeft[T] = LeftMatcher[T]()

  def left[T](t: ValueCheck[T]) = beLeft(t)
  def left[T] = beLeft
}

private[specs2]
trait EitherBeHaveMatchers { outer: EitherBaseMatchers =>
  implicit class EitherResultMatcher[L, R](result: MatchResult[Either[L, R]]) {
    def right(r: =>R) = result(outer.beRight(r))
    def left(l: =>L) = result(outer.beLeft(l))
    def beRight(r: =>R) = result(outer.beRight(r))
    def beLeft(l: =>L) = result(outer.beLeft(l))

    def right = result(outer.beRight)
    def left = result(outer.beLeft)
    def beRight = result(outer.beRight)
    def beLeft = result(outer.beLeft)
  }
}

object EitherMatchersSupport {
  type EitherRight[a]=Either[_, a]
  type EitherLeft[a]=Either[a, _]
}
import EitherMatchersSupport._

case class RightMatcher[T]() extends OptionLikeMatcher[EitherRight, T]("Right", (_:Either[Any, T]).right.toOption)
case class RightCheckedMatcher[T](check: ValueCheck[T]) extends OptionLikeCheckedMatcher[EitherRight, T]("Right", (_:Either[Any, T]).right.toOption, check)

case class LeftMatcher[T]() extends OptionLikeMatcher[EitherLeft, T]("Left", (_:Either[T, Any]).left.toOption)
case class LeftCheckedMatcher[T](check: ValueCheck[T]) extends OptionLikeCheckedMatcher[EitherLeft, T]("Left", (_:Either[T, Any]).left.toOption, check)
