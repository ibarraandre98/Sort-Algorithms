public class MergeSort {

    public MergeSort() {
    }
    public void ordenacion(int v[],int izq, int der){
    if (izq<der){
            int m=(izq+der)/2;
            ordenacion(v,izq, m);
            ordenacion(v,m+1, der);
            merge(v,izq, m, der);
    }
}
   public void merge(int v[],int izq, int m, int der){
   int i, j, k;
   int [] aux = new int[v.length];
   for (i=izq; i<=der; i++) 
             aux[i]=v[i];

             i=izq; j=m+1; k=izq;
             while (i<=m && j<=der)
             if (aux[i]<=aux[j])
                     v[k++]=aux[i++];
             else
                     v[k++]=aux[j++];
             while (i<=m) 
                           v[k++]=aux[i++]; 
 }
    
}