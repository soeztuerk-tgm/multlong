package oeztuerk;

public class Arithmetik {
	public Arithmetik(){

	}
	public long multLong(long a, long b) throws MyException{
		if((Long.MAX_VALUE/a)>b){
			return a*b;
		}
		else if(a<0&&b<0){
			return Long.MIN_VALUE;
		}
		else if(a>0&&b>0){
			return Long.MAX_VALUE;
		}
		else if(a>0&&b<0){
			return Long.MIN_VALUE;
		}
		else if(a<0&&b>0){
			return Long.MIN_VALUE;
		}else{
			return 0;
		}
	}
}

