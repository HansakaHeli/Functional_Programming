object Q02 {

    def main(args: Array[String]): Unit = {

        val wordList = List ("apple", "banana", "cherry", "date")
        countLetterOccurrences(wordList)
    }

    def countLetterOccurrences(wordList: List[String]): Unit  = {


        val lengthList = wordList.map(x=>x.length())

        println(lengthList)

        val letterCoutn = lengthList.reduce((a,b)=>a+b)

        println("Total count of letter occurrences: " + letterCoutn)

        
        
    }

  
}
