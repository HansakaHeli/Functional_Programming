object Q02 {

    def main(args: Array[String]): Unit = {

        var number: Int = args(0).toInt
        println(numberCharacteristics(number))
    }

    def numberCharacteristics(num: Int): String = num match {

        case num if (num<=0) => "Negative/Zero"
        case num if (num%2 == 0) => "Even"
        case _ => "Odd"

    }

}





