object Q01 {

    def main(args: Array[String]): Unit = {

        val celsiusList = List (0, 10, 20, 30)
        calculateAverage(celsiusList)
    }

    def calculateAverage(celsiusList: List[Int]): Unit  = {


        val fahrenheitList = celsiusList.map(x=>(((x*9.0/5.0) + 32.0),1))

        val avgList = fahrenheitList.reduce((a,b)=>( a._1 + b._1, a._2 + b._2 ))

        println("Average = "+ avgList._1/avgList._2.toFloat)
        
    }

  
}
