public class SelectionSort {
    public SelectionSort() {
    }
        public void ordenacion(int []v,int n){
    	for (int i = 0; i < n - 1; i++) {
     int min = i;
     for (int j = i + 1; j < n; j++) {
        if (v[j] < v[min]) {
           min = j;
        }
     }
     if (i != min) {
        int aux= v[i];
        v[i] = v[min];
        v[min] = aux;
     }
   }
   for(int i=0;i<n;i++){
   	System.out.print(v[i]+" ");
   }
	}
    
}