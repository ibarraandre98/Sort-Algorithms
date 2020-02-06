    import java.util.Scanner;
    public class AlgoritmosSort {
    static int opc;
    static boolean continuar=false;
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        do{
        do{
        	try{
        		continuar=false;
        int n,v;
        System.out.println("\nIngrese el tamaño de su vector: ");
        n=leer.nextInt();
        int vec[]=new int[n];
        System.out.println("Ingrese los valores de su vector: ");
        for(int i=0;i<n;i++){
            v=leer.nextInt();
            vec[i]=v;
        }
        System.out.println("Ingrese cual es el algoritmo de ordenacion que desea usar: " +
                "\n1.-Bubble sort\n2.-Quicksort\n3.-Shellsort\n4.-Radix\n5.-Merge sort\n6.-Intercalacion\n7.-Mezcla directa\n8.-Mezcla natural" +
                "\n9.-Selection sort\n10.-Pigeonhole sort\n0.-Salir\n");
        opc=leer.nextInt();
        switch(opc){
            case 1:
                System.out.println("-------------------BUBBLE SORT--------------------");
                BubbleSort bs=new BubbleSort();
                bs.ordenacion(vec,n);
                System.out.println("");
                break;
            case 2:
                System.out.println("-----------------QUICK SORT------------------");
                QuickSort qs=new QuickSort();
                qs.ordenacion(vec,0,n-1);
                for(int i=0;i<n;i++){
                	System.out.print(vec[i]+" ");
                }
                System.out.println("");
                break;
            case 3:
                System.out.println("------------------SHELL SORT--------------------------");
                ShellSort ss=new ShellSort();
                ss.ordenacion(vec,n);
                System.out.println("");
                break;
            case 4:
                System.out.println("-----------------RADIX-------------------");
                Radix r=new Radix();
                r.ordenacion(vec,n);
                System.out.println("");
                break;
            case 5:
            	System.out.println("-----------------MERGE SORT-------------------");
            	MergeSort ms=new MergeSort();
            	ms.ordenacion(vec,0,n-1);
            	for(int i=0;i<n;i++){
                	System.out.print(vec[i]+" ");
                }
                System.out.println("");
                break;
            case 6:
            	System.out.println("-----------------INTERCALACION-------------------");
            	Intercalacion in=new Intercalacion();
            	in.ordenacion(vec,n);
            	System.out.println("");
                break;
            case 7:
            	System.out.println("-----------------MEZCLA DIRECTA-------------------");
            	MezclaDirecta md=new MezclaDirecta();
            	md.ordenacion(vec);
            	for(int i=0;i<n;i++){
            	System.out.print(vec[i]+" ");
            	}
            	System.out.println("");
                break;
            case 8:
            	System.out.println("-----------------MEZCLA NATURAL-------------------");
            	MezclaNatural mn=new MezclaNatural();
            	mn.mezcladirecta(vec);
            	for(int i=0;i<n;i++){
            		System.out.print(vec[i]+" ");
            	}
            	System.out.println("");
                break;
            case 9:
            	System.out.println("-----------------SELECTION SORT-------------------");
            	SelectionSort sst=new SelectionSort();
            	sst.ordenacion(vec,n);
            	System.out.println("");
                break;
            case 10:
                System.out.println("--------------PIGEONHOLE SORT--------------");
                PigeonholeSort phs=new PigeonholeSort();
                phs.ordenacion(vec,n);
                System.out.println("");
                break;
            case 0:
                System.out.println("Usted ha terminado!");
                break;
        }
        continuar=true;
        	}catch(Exception e){
        		leer.nextLine();
        		System.err.println("Ha ocurrido un error " + e);
        	}
    }while(continuar==false);
        }while(opc!=0);
    }
}