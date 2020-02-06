public class Radix {

    public Radix() {
    	//0
    }
    public void ordenacion(int []v,int n){
    	int m = v[0], exp = 1;
        int[] a = new int[10];
        
        for (int i = 1; i < n; i++){
        	if (v[i] > m)
                m = v[i];
        }
        while (m/exp>0){
            int[] b = new int[10];
 
            for (int i = 0; i < n; i++)
                b[(v[i] / exp) % 10]++;
            for (int i = 1; i < 10; i++)
                b[i] =b[i]+b[i - 1];
            for (int i = n - 1; i >= 0; i--)
                a[--b[(v[i] / exp) % 10]] = v[i];
            for (int i = 0; i < n; i++)
                v[i] = a[i];
            exp=exp*10;        
        }
        for(int i=0;i<n;i++){
        	System.out.print(v[i]+" ");
        }
    }
    
}