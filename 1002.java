import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int T=in.nextInt();
    	for(int i=0;i<T;i++) {
    	int x1=in.nextInt();
    	int y1=in.nextInt();
    	int r1=in.nextInt();
    	int x2=in.nextInt();
    	int y2=in.nextInt();
    	int r2=in.nextInt();
    	System.out.println(target(x1,y1,r1,x2,y2,r2));
    	}
    	
    }
    public static int target(int x1,int y1,int r1,int x2,int y2,int r2) {
    	double d=(int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    	
    	if(x2==x1&&y2==y1&&r2==r1) {
    		return -1;
    	}else if(d>Math.pow(r1+r2,2)) {
    		return 0;
    	}else if(d<Math.pow(r2-r1,2)) {
    		return 0;
    	}		else if(d== Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		
		
		else if(d== Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
    	
    }
}
