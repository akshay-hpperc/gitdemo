package IListDemo;

public class demo {
public static void main(String[] args) {
	int n1=3, n2=12,i, res1 = 0,res2;
	
	for(i=1;i<=n1 && i<=n2;++i) {
		if(n1%i==0 && n2%i ==0) {
			res1=i;
		}
		res2=(n1*n2)/res1;
		System.out.println(res2);
	}
	
	
}
}
