package fileSearcher

import java.io.File

import org.scalatest.FlatSpec

/**
  * Created by srand on 1/7/2016.
  */
class FilterCheckerTests extends FlatSpec {

  "FilterChecker passed a list where one file matches the filter" should
    "return a list with that file" in {
    val matchingFile = FileObject(new File("matchMe"))
    val listOfFiles = List(FileObject(new File("random")), matchingFile)
    val matchedFiles = FilterChecker("matchMe") findMatchedFiles listOfFiles
    assert(matchedFiles == List(matchingFile))
  }

  "FilterChecker passed a list where NO file matches the filter" should
    "NOT return a list that matches" in {
    val matchingFile = FileObject(new File("FAILURE"))
    val listOfFiles = List(FileObject(new File("random")), matchingFile)
    val matchedFiles = FilterChecker("matchMe") findMatchedFiles listOfFiles
    assert(matchedFiles != List(matchingFile))
  }

  "FilterChecker passed a list with a File Directory that matches the filter" should
    "NOT return the directory" in {
    val listofObjects = List( FileObject(new File("random")), DirectoryObject(new File("E:")))
    val matchedFiles = FilterChecker("E:") findMatchedFiles listofObjects
    assert(matchedFiles.length == 0)
  }

}
