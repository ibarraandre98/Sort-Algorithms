public class BubbleSort {
    public BubbleSort() {
    	//1
    }
        public void ordenacion(int []v,int n){
        int aux=v[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(v[j]<v[i]){
                    aux=v[j];
                    v[j]=v[i];
                    v[i]=aux;
                }
            }
        }
        System.out.println("Su vector ordenado es:");
        for(int i=0;i<n;i++){
            System.out.print(v[i]+" ");
        }
    }
}