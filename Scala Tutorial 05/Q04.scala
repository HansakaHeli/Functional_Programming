object Q04 {

    def main(args: Array[String]): Unit = {
        println(isEven(4))
        println(isEven(3))
        println(isOdd(9))
        println(isOdd(2))
    }

    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = {
        !(isEven(n))
    }

    
}