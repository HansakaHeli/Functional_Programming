object Q01 {

    def main(args: Array[String]): Unit = {
      println(prime(7))
    }

    def prime(n: Int, i: Int=2): Boolean = {
		if (n<=1)
			false
		else if (n==i)
			true;
		else if (n%i==0)
			false;	
		else
			prime(n, i+1);
	}
 
}

