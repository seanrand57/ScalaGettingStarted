package fileSearcher

import org.scalatest.FlatSpec

/**
  * Created by srand on 1/8/2016.
  */
class MatcherTests extends FlatSpec {

  "Matches that is passed a file matching the filter" should
  "return a list with that file name" in {
    val matcher = new Matcher("fake", "fakePath")
    val results = matcher.execute()

    assert(results == List("fakePath"))
  }

  "Matches that is passed a file matching the filter" should
    "return ONE result" in {
    val matcher = new Matcher("fake", "fakePath")
    val results = matcher.execute()
    assert(results.length == 1)
  }
}
