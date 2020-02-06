public class ShellSort {
    public ShellSort() {
    	//1
    }
        public void ordenacion(int []v,int n) {
        int salto = n, aux, aux2;
        do {
            salto=salto/2;
            for (int i = 0; i < n; i++) {
                if ((i + salto < n) && (v[i] > v[i + salto])) {
                    aux = v[i];
                    v[i] = v[i + salto];
                    v[i + salto] = aux;
                    if ((i >= salto) && (v[i] < v[i - salto])) {
                        aux2 = v[i];
                        v[i] = v[i - salto];
                        v[i - salto] = aux2;
                    }
                }
            }
        }while(salto>1);
        for(int i=0;i<n;i++){
            System.out.print(v[i]+" ");
        }
    }
}