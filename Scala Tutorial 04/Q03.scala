object Q03 {

    def main(args: Array[String]): Unit = {

        var name1 = "Benny"
        println(formatNames(name1)(toUpper))

        var name2 = "Niroshan"
        println(formatNames(name2.substring(0,2))(toUpper) + formatNames(name2.substring(2,8))(toLower))

        var name3 = "Saman"
        println(formatNames(name3)(toLower))

        var name4 = "Kumara"
        println(formatNames(name4.substring(0,1))(toUpper) + formatNames(name4.substring(1,5))(toLower) + formatNames(name4.substring(5,6))(toUpper))
    }

    def toUpper(string1: String):String = {
        val str = string1.toUpperCase()
        str
    }
    
    def toLower(string2: String):String = {
        val str = string2.toLowerCase()
        str
    }

    def formatNames(name: String)(formatFunc: String => String):String = {
        formatFunc(name)
    }
    

}





