package edu.knoldus
import org.apache.log4j.Logger

object Operation extends App {

  val log = Logger.getLogger(this.getClass)
  val object1 = new Listoperation
  val list3 = List(2,3,3,3,1,1,4,5,5,1,1,2)
  val list2 = List()
  val numberofrotation = 3
  val l1 = 'a'
  val l2 = 'b'
  val l3 = 'c'
  val l4 = 'd'
  val l5 = 'e'
  val l6 = 'f'
  val l7 = 'g'
  val list1 =List(l1,l2,l3,l4,l5,l6,l7)
  log.info(object1.rotationOfList(list1,numberofrotation ))
  log.info("\n")
  log.info(object1.removingDuplicates(list3,list2))

}
