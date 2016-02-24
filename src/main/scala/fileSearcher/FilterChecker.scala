package fileSearcher

import fileSearcher.IOObject

/**
  * Created by srand on 1/7/2016.
  */
class FilterChecker(filter: String) {
  def matches(content: String) = content contains filter

  def findMatchedFiles(iOObjects: List[IOObject]) = {
    for (iOObject <- iOObjects
         if (iOObject.isInstanceOf[FileObject])
         if (matches(iOObject.name)))
      yield iOObject
  }
}
  object FilterChecker{
    def apply(filter: String) = new FilterChecker(filter)
  }
