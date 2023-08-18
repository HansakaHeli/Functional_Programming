object NumberClassifier {

    def main(args: Array[String]): Unit = {

    var number: Int = args(0).toInt
    val result = classifyNumber(number)
    
}


    val classifyNumber = (n:Int) => {
        if(n<=0){
            println("Negative/Zero")
        }
        else if(n%2 == 0){
            println("Even")
        }
        else{
            println("Odd")
        }
    }

}
