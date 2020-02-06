public class Intercalacion {

    public Intercalacion() {
    }
    public void ordenacion(int []v,int n){
    	int v1[]=new int[n];
    	int v2[]=new int[n];
    	int vf[]=new int[n];
    	for(int i=0;i<n;i++){
    		if(i%2==0){
    			v1[i]=v[i];
    		}else{
    			v2[i]=v[i];
    		}
    	}
    	int aux=v1[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(v1[j]<v1[i]){
                    aux=v1[j];
                    v1[j]=v[i];
                    v1[i]=aux;
                }
            }
        }
        int aux1=v2[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(v2[j]<v2[i]){
                    aux1=v2[j];
                    v2[j]=v[i];
                    v2[i]=aux1;
                }
            }
        }
        for(int i=0;i<n;i++){
        	if(i%2==0){
        		vf[i]=v1[i];
        	}else{
        		vf[i]=v2[i];
        	}
        }
        int aux2=v[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(v[j]<v[i]){
                    aux2=v[j];
                    v[j]=v[i];
                    v[i]=aux2;
                }
            }
        }
        for(int i=0;i<n;i++){
        	System.out.print(v[i]+" ");
        }
    }
    
}