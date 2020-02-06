public class PigeonholeSort {
    public PigeonholeSort(){
    }
    public void ordenacion(int []v,int n){
        int menor=v[0],aux1=0,mayor=v[0],aux3=0,rango,u;
        int vi[]=new int[n];
        for(int i=0;i<n;i++){
            vi[i]=v[i];
        }
        int vf[];
        for(int i=1;i<n;i++){
            if(menor>v[i]){
                aux1=v[i];
                v[i]=menor;
                menor=aux1;
            }
        }
        for(int i=1;i<n;i++){
            if(mayor<v[i]){
                aux3=v[i];
                v[i]=mayor;
                mayor=aux3;
            }
        }
        rango=(mayor-menor)+1;
        vf=new int [rango];
        for(int i=0;i<rango;i++){
        	vf[i]=-1;
        }
        for(int i=0;i<n;i++){
            u=vi[i]-menor;
            vf[u]=vi[i];
        }
        for(int i=0;i<rango;i++){
            if(vf[i]!=-1)
            System.out.print(vf[i]+" ");
        }
    }
}
