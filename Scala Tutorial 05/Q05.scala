object Q05 {

    def main(args: Array[String]): Unit = {
        println(additionEvenNum(13))
    }

    def additionEvenNum(n:Int):Int = n match{
        case n if (n==0) => 0
        case n if (n%2==0) => n + additionEvenNum(n-2)
        case n if (n%2!=0) => n-1 + additionEvenNum(n-3)
    }

   

    
}