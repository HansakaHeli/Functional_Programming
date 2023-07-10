object Q02 {

    def main(args: Array[String]): Unit = {
      primeSeq(7)
    }

    def primeSeq(num: Int, i: Int=2): Unit = {
		if (i==num)
			println();
		else {
			if (prime(i))
				print(s"$i\t");
			primeSeq(num, i+1);
		}
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

