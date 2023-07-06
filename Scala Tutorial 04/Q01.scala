import scala.io.StdIn.readLine

object Q01 {

    def main(args: Array[String]): Unit = {

        println("Enter Your Deposit Amount : ")
        var amount: Double = readLine().toDouble

        printf("Your Interent is %.2f" , calculateInterest(amount))

    }

   
    def calculateInterest(amount: Double): Double ={
        
        var interest: Double = 0.0

        if (amount>= 2000000){
            interest = amount * 0.065
            interest.toDouble
        }
        else if(amount>= 200000){
            interest = amount * 0.035
            interest.toDouble
        }
        else if(amount>= 20000){
            interest = amount * 0.04
            interest.toDouble
        }
        else{
            interest = amount * 0.02
            interest.toDouble
        }

    }

}





