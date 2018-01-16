package edu.knoldus


class Listoperation {

  def rotationOfList(list1: List[Char], rotateindex: Int): List[Char] = {

    def innerRotationOfList(list1: List[Char], rotateindex: Int, currentindex: Int): List[Char] = {

      list1 match {
        case head :: tail if (currentindex != rotateindex) => innerRotationOfList(tail :+ head, rotateindex, currentindex + 1)
        case _ => list1
      }

    }

    innerRotationOfList(list1, rotateindex, 0)
  }

  def removingDuplicates(List1: List[Int],List2: List[Int]): List[Int] = {

    List1 match {
        case head :: Nil=> List2 :+ head
        case head ::  head2 :: tail if (head == head2)  => removingDuplicates( head2::tail, List2)
        case head :: head2 ::  tail if (head != head2)  => removingDuplicates(head2::tail, List2:+head)

      }
    }

}