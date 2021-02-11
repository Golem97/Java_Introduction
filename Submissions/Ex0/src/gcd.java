public gcd (n1 ,n2){                   // Here we receive the 2 natural numbers
    int gcd=0;                         // Init gcd=0 
for( int i=1; i < n1 && i < n2; i++){  // For i=1 while n1>i and n2>i :  i = i+1
   if(n1% I == 0 && n2%i == 0) {       // Find the common value with norest 
	                  gcd=i;           // Variable gcd takes the common value i
	                  }                // the end of the “if” block
	}                                  // the end of the“for” block
	return gcd;                                             

}