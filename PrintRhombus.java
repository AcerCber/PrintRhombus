
public class weiyi {
	public static void main(String[] args){
		printlx(20);
	}	
	
	
	public static void printlx(int size){
		for(int j=size/2;;j--){
			for(int i=1;i<size;i++){
				System.out.print(" ");
				if(i==j||i==size-j)
					System.out.print("*");
			}
			if(j==2)
				break;
			else
			    System.out.print("\r");		
			}		
		//¤U¥b³¡¤À
		for(int j=0;;j++){
			for(int i=1;i<size;i++){
				System.out.print(" ");
				if(i==j||i==size-j)
					System.out.print("*");
			}
			if(j==size/2)
				break;
			else
			    System.out.print("\r");	
		}
	}	
}
