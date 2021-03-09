package org.knoldus.main.queue

import scala.collection.mutable
trait Queue{
  def  enqueue(list :List[Int],element:Int):List[Int]
  def dequeue(list :List[Int]):List[Int]={
    list.tail
  }
}
class DoubleQueue extends Queue{
 override def enqueue(list: List[Int], element: Int): List[Int] =
    {
      list:+(element * 2)
    }
}
class SquareQueue extends Queue{
  override def enqueue(list: List[Int], element: Int): List[Int] = {

    list:+(element * element)
  }
}
object queue {
  def main(args: Array[String]): Unit = {
   val list=List(1,2,3,4)
    println("Element in the list  are  : ")
    for(elemnet <- list){
      print("\t"+elemnet)
    }
    /*
    //object of double class
     */
    val doubleQueue= new DoubleQueue
    /*
    // object of square class
     */
    val squareQueue= new SquareQueue
    // enqueue element  by doubling
    println("\nElement after  double enqueue : "+doubleQueue.enqueue(list,5))
    // dequeue element
    println("\nElement after dequeue : "+doubleQueue.dequeue(list))
    // enqueue element by square
    println("\nElement after square  enqueue : "+squareQueue.enqueue(list,6))
    // dequeue element
    println("\nElement after denqueue : "+squareQueue.dequeue(list))

  }
}