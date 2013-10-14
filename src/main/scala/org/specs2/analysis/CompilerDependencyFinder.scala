package org.specs2
package analysis

import org.specs2.io.fs
import scala.collection.mutable.{Map, HashMap}
import scala.tools.nsc._
import interactive._
import io._
import java.net.URLClassLoader
import java.net.URLDecoder
import reflect.PackageName._
import scala.reflect.io.PlainDirectory

/**
 * Implementation of the DependencyFinder trait using the compiler dependency analysis
 */
trait CompilerDependencyFinder extends DependencyFinder {

  /**
   * @return the class depending on the classes of a given package
   */
  override def getPackageDependents(packageName: String, sourceDir: String, targetDir: String): Seq[Dependency] = ???

  /**
   * @return a seq of all scala files in the source directory
   */
  def selectFiles(sourceDir: String) = fs.filePaths(sourceDir, "**/*.scala")
}
