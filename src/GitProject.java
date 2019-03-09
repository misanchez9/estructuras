
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;

public class GitProject {

	public static void main(String[] args) {
		
		
		int tam=1000;
				
		int []x=generateArray(tam);
		long inc=System.nanoTime();
					
				quickSort(x,0,x.length-1);
		
				
				long fin=System.nanoTime();
				
				System.out.println(Arrays.toString(x));
				
				
				
			
			System.out.println();
			System.out.println((fin-inc )+" Nanosegundos");
			
		}
	
		static int[]generateArray(int tam){
			int arr[]=new int [tam];
			Random rnd = new Random();
			for (int i = 0; i < arr.length; i++) 
				arr[i]=rnd.nextInt();
						
			return arr;
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
		public static int[] mergeSort(int[]a) {
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
	    
	    public static int[]merge(int[]a_1,int[]a_2){
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
	    
	    
	    //QUICKSORT
	    
	    public static int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than or 
	            // equal to pivot 
	            if (arr[j] <= pivot) 
	            { 
	                i++; 
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	  
	  
	    /* The main function that implements QuickSort() 
	      arr[] --> Array to be sorted, 
	      low  --> Starting index, 
	      high  --> Ending index */
	    public static void quickSort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(arr, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            quickSort(arr, low, pi-1); 
	            quickSort(arr, pi+1, high); 
	        } 
	    } 
	    
	    //RADIX SORT
	    static int getMax(int arr[], int n) 
	    { 
	        int mx = arr[0]; 
	        for (int i = 1; i < n; i++) 
	            if (arr[i] > mx) 
	                mx = arr[i]; 
	        return mx; 
	    } 
	  
	   
	    static void countSort(int arr[], int n, int exp) 
	    { 
	        int output[] = new int[n]; // output array 
	        int i; 
	        int count[] = new int[10]; 
	        Arrays.fill(count,0); 
	  
	        
	        for (i = 0; i < n; i++) 
	            count[ (arr[i]/exp)%10 ]++; 
	  
	       
	        for (i = 1; i < 10; i++) 
	            count[i] += count[i - 1]; 
	  
	       
	        for (i = n - 1; i >= 0; i--) 
	        { 
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
	            count[ (arr[i]/exp)%10 ]--; 
	        } 
	  
	       
	        for (i = 0; i < n; i++) 
	            arr[i] = output[i]; 
	    } 
	  
	    
	    static void radixsort(int arr[], int n) 
	    { 
	       
	        int m = getMax(arr, n); 
	  
	        for (int exp = 1; m/exp > 0; exp *= 10) 
	            countSort(arr, n, exp); 
	    } 
	    
	    //COUNTING SORT
	    void sort(char arr[]) 
	    { 
	        int n = arr.length; 
	  
	       
	        char output[] = new char[n]; 
	  
	      
	        int count[] = new int[256]; 
	        for (int i=0; i<256; ++i) 
	            count[i] = 0; 
	  
	       
	        for (int i=0; i<n; ++i) 
	            ++count[arr[i]]; 
	  
	        
	        for (int i=1; i<=255; ++i) 
	            count[i] += count[i-1]; 
	  
	       
	        for (int i = n-1; i>=0; i--) 
	        { 
	            output[count[arr[i]]-1] = arr[i]; 
	            --count[arr[i]]; 
	        } 
	  
	        for (int i = 0; i<n; ++i) 
	            arr[i] = output[i]; 
	    } 
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