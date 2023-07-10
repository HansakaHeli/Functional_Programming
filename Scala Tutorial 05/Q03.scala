object Q03 {

    def main(args: Array[String]): Unit = {
        println(addition(5))
    }

    def addition(n:Int):Int = {
        if(n>1){
            n + addition(n-1)
        }
        else{
            1
        }

    }
    
}