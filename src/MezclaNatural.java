public class MezclaNatural {
	public MezclaNatural(){
		
	}
public void mezclanatural(int arreglo[]) {
        int izquierda = 0, izq = 0, derecha = arreglo.length - 1, der = derecha;
        boolean ordenado = false;
        do {
            ordenado = true;
            izquierda = 0;
            while (izquierda < derecha) {
                izq = izquierda;
                while (izq < der && arreglo[izq] <= arreglo[izq + 1]) {
                    izq++;
                }
                der = izq + 1;
                while (der == derecha - 1 || der < derecha && arreglo[der] <= arreglo[der + 1]) {
                    der++;
                }
                if (der <= derecha) {
                    mezcladirecta2(arreglo);
                    ordenado=false;
                }
                izquierda=izq;
            }
        } while (!ordenado);
    }
    
    public int[] mezcladirecta(int arreglo[]) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nelementosizq = arreglo.length / 2;
            int nelementosder = arreglo.length - nelementosizq;
            int arregloizq[] = new int[nelementosizq];
            int arregloder[] = new int[nelementosder];
            for (i = 0; i < nelementosizq; i++) {
                arregloizq[i] = arreglo[i];
            }
            for (i = nelementosizq; i < nelementosizq + nelementosder; i++) {
                arregloder[i - nelementosizq] = arreglo[i];
            }
            arregloizq = mezcladirecta(arregloizq);
            arregloder = mezcladirecta(arregloder);
            i = 0;
            j = 0;
            k = 0;
            while (arregloizq.length != j && arregloder.length != k) {
                if (arregloizq[j] < arregloder[k]) {
                    arreglo[i] = arregloizq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloder[k];
                    i++;
                    k++;
                }
            }
            while (arregloizq.length != j) {
                arreglo[i] = arregloizq[j];
                i++;
                j++;
            }
            while (arregloder.length != k) {
                arreglo[i] = arregloder[k];
                i++;
                k++;
            }
        }
        return arreglo;
    }
    
    public void mezcladirecta2(int arreglo[]) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nelementosizq = arreglo.length / 2;
            int nelementosder = arreglo.length - nelementosizq;
            int arregloizq[] = new int[nelementosizq];
            int arregloder[] = new int[nelementosder];
            for (i = 0; i < nelementosizq; i++) {
                arregloizq[i] = arreglo[i];
            }
            for (i = nelementosizq; i < nelementosizq + nelementosder; i++) {
                arregloder[i - nelementosizq] = arreglo[i];
            }
            arregloizq = mezcladirecta(arregloizq);
            arregloder = mezcladirecta(arregloder);
            i = 0;
            j = 0;
            k = 0;
            while (arregloizq.length != j && arregloder.length != k) {
                if (arregloizq[j] < arregloder[k]) {
                    arreglo[i] = arregloizq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloder[k];
                    i++;
                    k++;
                }
            }
            while (arregloizq.length != j) {
                arreglo[i] = arregloizq[j];
                i++;
                j++;
            }
            while (arregloder.length != k) {
                arreglo[i] = arregloder[k];
                i++;
                k++;
            }
        }
    }
}