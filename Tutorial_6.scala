import scala.io.StdIn
object Tutorial_6 {

    val alphabet = 26

    def main(args: Array[String]): Unit = {
		
        print("Enter the text: ")
        val txt = StdIn.readLine()

        print("Shift by: ");
        val shift = StdIn.readInt()

        var encryptedTxt = ciper(txt, shift , encryption);

        println("Encrypted text: " + encryptedTxt)
        println("Decrypted text: " + ciper(encryptedTxt,shift,decryption))
    }

    def ciper(txt:String,shift:Int,callback:(String,Int)=>String):String={
        callback(txt,shift)
    }

    def encryption(txt: String, shift: Int):String = {
        
        txt.map { char =>
        if (char.isLetter) {
            val base = if (char.isUpper) 'A' else 'a'
            ((char - base + shift) % alphabet + base).toChar
        }
        else
            char
        }
    }

    def decryption(txt: String, shift: Int): String = {
        encryption(txt, alphabet - shift)
    }


}