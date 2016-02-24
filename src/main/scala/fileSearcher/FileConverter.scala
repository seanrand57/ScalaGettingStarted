package fileSearcher

import java.io.File

/**
  * Created by srand on 1/8/2016.
  */
object FileConverter {

  def convertToIOOBject(file: File) =
  if(file.isDirectory()) DirectoryObject(file)
  else
    FileObject(file)


}
