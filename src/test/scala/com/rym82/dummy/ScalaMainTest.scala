package com.rym82.dummy
import org.junit.Test

class ScalaMainTest {
  @Test
  def shouldSum() {
    def main = new ScalaMain
    assert (3 == main.sum (1, 2))
    assert (5 == main.sum (2, 3))
  }
}
