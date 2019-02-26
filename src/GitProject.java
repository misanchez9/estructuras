
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class GitProject {

	public static void main(String[] args) {
		
		
		int tam=10;
				
		int []x=generateArray(tam);
		long inc=System.nanoTime();
					
				insertionSort(x);
		
				int z= binarySearch(x,0,x.length,9);
				
				System.out.println(z);
				
				
			long fin=System.nanoTime();
			System.out.println();
			System.out.println((fin-inc )* Math.pow(10, 9)+" Nanosegundos");
			
		}
	
		static int[]generateArray(int tam){
			int arr[]=new int [tam];
			Random rnd = new Random();
			for (int i = 0; i < arr.length; i++) 
				arr[i]=rnd.nextInt(10);
						
			return arr;
		}
		
		public static void experiments() {
			int[]array_100= generateArray(100);
			int[]array_500=generateArray(500);
			int[]array_1000=generateArray(1000);
			
			
			
			
		}
		
		public static void printArray(int a[]) throws IOException {
			FileWriter fw= new FileWriter("experimentos.cvs");
			
			BufferedWriter bw= new BufferedWriter(fw);
			for (int i = 0; i < a.length; i++) {
				bw.write(String.valueOf(a[i]));
				
			}
		}
		// BUBBLE SORT 
		static void bubbleSort(int[]a ) {
			
			int temp;
			boolean swapped=false;
			do {
				swapped=false;
				for (int i = 0; i < a.length-1; i++) {
					if(a[i]>a[i+1]) {
						temp=a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
						swapped=true;
					}
				}
			}while(swapped);
		}
		
		// INSERTION SORT
		static void insertionSort(int []x){
			for (int i = 1; i < x.length; i++) {
				int copia=x[i];
				int j=i-1;
				while(j>=0&&x[j]>copia) {
					x[j+1]=x[j];
					j=j-1;
					x[j+1]=copia;
				}
			}
	}
		
		//MERGE SORT
		public int[] mergeSort(int[]a) {
	        int size=a.length;
	        if(size>1) {
	            int size_par=size/2;
	            int[]a_1=new int[size_par];
	            int[]a_2= new int[size-size_par];
	            for (int i = 0; i < size_par; i++) 
	                a_1[i]=a[i];
	            for (int i = size_par; i <size; i++) 
	                a_2[i-size_par]=a[i];
	                
	            a_1=mergeSort(a_1);
	            a_2=mergeSort(a_2);
	            a=merge(a_1,a_2);    
	        }
	        return a;
	    }
	    
	    public int[]merge(int[]a_1,int[]a_2){
	        int[]resp=new int[a_1.length+a_2.length];
	        int index_a_1=0,index_a_2=0,index=0;
	        while(index_a_1<a_1.length && index_a_2<a_2.length ) {
	            if(a_1[index_a_1]<a_2[index_a_2]) {
	                resp[index]=a_1[index_a_1];
	                index+=1; index_a_1+=1;
	            }else {
	                resp[index]=a_2[index_a_2];
	                index+=1; index_a_2+=1;
	            }
	        }
	        if(index_a_1<a_1.length) {
	            for(int i=index_a_1;i<a_1.length;i++) {
	                resp[index]=a_1[i];
	                index+=1;
	            }
	        }else {
	            for (int i = index_a_2; i < a_2.length; i++) {
	                resp[index]=a_2[i];
	                index+=1;
	            }
	        }
	        return resp;
	    }
		static void quickSort(int[]x,int piv1,int piv2) {
			int temp=x[0];
			for (int i = 1; i < x.length; i++) {
				
				
			}
		}
		static //casierrav@poligran.edu.co
		
		//BUSQUEDA BINARIA
		
		 int binarySearch(int arr[], int l, int r, int x) 
	    { 
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            if (arr[mid] == x) 
	                return mid; 
	  
	            if (arr[mid] > x) 
	                return binarySearch(arr, l, mid - 1, x); 
	  
	         
	            return binarySearch(arr, mid + 1, r, x); 
	        } 
	  
	        return -1; 
	    } 
		
	}