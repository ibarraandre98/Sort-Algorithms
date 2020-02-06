public class MezclaDirecta {

    public MezclaDirecta() {
    }
    public int [] ordenacion(int []v){
    	int i, j, k;
if (v.length > 1) {
int nelementosizq = v.length / 2;
int nelementosder = v.length - nelementosizq;
int arregloizq[] = new int[nelementosizq];
int arregloder[] = new int[nelementosder];
for (i = 0; i < nelementosizq; i++) {
arregloizq[i] = v[i];
}
for (i = nelementosizq; i < nelementosizq + nelementosder; i++) {
arregloder[i - nelementosizq] = v[i];
}
arregloizq = ordenacion(arregloizq);
arregloder = ordenacion(arregloder);
i = 0;
j = 0;
k = 0;
while (arregloizq.length != j && arregloder.length != k) {
if (arregloizq[j] < arregloder[k]) {
v[i] = arregloizq[j];
i++;
j++;
} else {
v[i] = arregloder[k];
i++;
k++;
}
}
while (arregloizq.length != j) {
v[i] = arregloizq[j];
i++;
j++;
}
while (arregloder.length != k) {
v[i] = arregloder[k];
i++;
k++;
}
}
return v;
    }
    
}