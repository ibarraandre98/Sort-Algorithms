public class QuickSort {
    public QuickSort() {
    	//1
    }
    	public void ordenacion(int[] v, int izquierda, int derecha) {
        int pivote = v[izquierda];
        int n=derecha+1;
        int i = izquierda;
        int j = derecha;
        int aux;
        while (i < j) {
            while (v[i] <= pivote && i < j) {
                i++;
            }
            while (v[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }
        v[izquierda] = v[j];
        v[j] = pivote;
        if (izquierda < j - 1) {
            ordenacion(v, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            ordenacion(v, j + 1, derecha);
        }
    }
}