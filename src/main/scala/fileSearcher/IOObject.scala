package fileSearcher

import java.io.File

/**
  * Created by srand on 1/7/2016.
  */
trait IOObject {
  val file: File
  val name = file.getName()
}

case class FileObject(file: File) extends IOObject
case class DirectoryObject(file: File) extends IOObject
