package design

import net.joewing.scalacad._
import net.joewing.scalacad.primitives._
import net.joewing.scalacad.parts.Threads

import net.joewing.scalacad.io
import net.joewing.scalacad.io.AwtRenderer

object Screw {
  val threads = Threads(4, 30, 12, 0.75, .075)
  val cylinder = Cylinder(30, 4, 4, 30)
  val bumpPlate = Cylinder(2, 5.2, 5.2, 30)
  val obj = Union(
    Union(threads, Translate(cylinder, 0, 0, -30)),
    Translate(bumpPlate, 0, 0, -2)
  )

  def main(args: Array[String]) = {
    AwtRenderer.show(obj)
  }
}
