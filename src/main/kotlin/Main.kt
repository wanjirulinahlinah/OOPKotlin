fun main() {
    val box=Box(8.0,6,7.0)
    box.fillContents()
    box.open()


//    box.length
//    box.height
//    box.width

    println("Height: ${box.height}")
    println("Height: ${box.length}")
    println("Height: ${box.width}")

}
//oop -It is a techique used to break a problem into small bits by creating objects.
//class and objects
//property and functions
//OOP A programming paradigm that concept of clases and objects.
//four main principles of OOP
//Encapsulation
//inheritance
//Abstraction
//polymorphism

//Define a class in kotlin you just start by class
//Properties  you declare them using variables
//behaviours you declare them  using functions
//You will use capital letters for each word in initial in your class name
class Box(val length:Double,var width:Int, var height:Double){


    fun fillContents(){
        println("Box is filled")
    }
    fun open(){
        println("Box is Opened")
    }
}
//object
 //you can use var or val
//to access properties and behaviours we can use  dot.

