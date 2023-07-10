object Q06 {
	def main(args: Array[String]) = {
	
		fibonacciSeq(7);
		
	}
	
	def fibonacci(n: Int): Int = {
		if (n==0)
			0
		else if (n==1)
			1
		else
			fibonacci(n-1) + fibonacci(n-2);
	}


	def fibonacciSeq(n: Int): Unit = {
		if (n>0)
			fibonacciSeq(n-1);

		print(s"${fibonacci(n)}\t")
	}
}