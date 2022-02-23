package Sorting_programming;

public class Main {

	public static void main(String[] args) {
		
		final int LARGESIZE = 1024;				//large size(1024) ��� ����
		 int [] arr = new int[LARGESIZE];			
		 
		 RandomNumber ran = new RandomNumber();			// ���� ���� ��ü
		 
		 for(int i=0;i<LARGESIZE-1;i++) {				// �迭�� ������ ���� �־���
			 arr[i]=(int)ran.rand();
		 }
		 
		 System.out.println("Sorting name                    Number of compare                     measured time");
		 System.out.println("-------------Large array sizes (n=2^10=1024)---------------- ");		// input ���� ū �迭
		// Print.printarr(arr);
		 
		 System.out.print("Insertion_sort: ");
		 Insertion_sort IS = new Insertion_sort();
		 IS.insertion_sorting(arr);
		 System.out.println("");
		// Print.printarr(arr);
		 
		 System.out.print("Merge_sort: ");
		 Merge_sort MG = new Merge_sort();
		 MG.merge_sort(arr);
		 System.out.println("");
		// Print.printarr(arr);
		 
		 System.out.print("Heap_sort: ");			//heap sort�� ���� ����

		 System.out.println(" ");
		 //Print.printarr(arr);
		 
		 
		 System.out.print("Quick_sort_firstelement: ");
		 Quick_sort_fistelement QSF = new Quick_sort_fistelement();
		 QSF.quicksort(arr);
		 System.out.println(" ");
		 //Print.printarr(arr);
		 
		 
		 System.out.print("Quick_sort_median");
		 Quick_sort_median QSM = new Quick_sort_median();
		 QSM.quicksort(arr);
		 System.out.println(" ");
		// Print.printarr(arr);
		 
		 System.out.print("Quick_sort_random");
		 Quick_sort_random QSR = new Quick_sort_random();
		 QSR.quicksort(arr);
		 System.out.println(" ");
		 
		 
		 //Print.printarr(arr);
		 
		 System.out.println("");
		 System.out.println("---------------A small array size, n = 32----------------");			// input�� ���� �迭�� ���ؼ�
		 final int SMALLSIZE = 32;
		 int[] arr2 = new int [SMALLSIZE];
		
		 System.out.println("");
		 System.out.println("---------------For Sorted array------------------");					// �̹� ���ĵ� �迭
			for(int i=0;i<arr2.length;i++) {
				arr2[i]=i+1;
			}
		// Print.printarr(arr2);
		 
		 System.out.print("Insertion_sort: ");
		 Insertion_sort IS2 = new Insertion_sort();
		 IS2.insertion_sorting(arr2);
		 System.out.println("");
		// Print.printarr(arr2);
		 
		 System.out.print("Merge_sort: ");
		 Merge_sort MG2  =new Merge_sort();
		 MG2.merge_sort(arr2);
		 System.out.println("");
		// Print.printarr(arr2);
		 
		 System.out.print("Heap_sort: ");
		 
		 
		 
		 
		 System.out.println(" ");
		 //Print.printarr(arr2);
		 
		 System.out.print("Quick_sort_firstelement: ");
		 Quick_sort_fistelement QSF2 = new Quick_sort_fistelement();
		 QSF2.quicksort(arr2);
		 System.out.println(" ");
		 //Print.printarr(arr2);
		 
		 
		 System.out.print("Quick_sort_median");
		 Quick_sort_median QSM2 = new Quick_sort_median();
		 QSM2.quicksort(arr2);
		 System.out.println(" ");
		 //Print.printarr(arr2);
		 
		 System.out.print("Quick_sort_random");
		 Quick_sort_random QSR2 = new Quick_sort_random();
		 QSR2.quicksort(arr2);
		 System.out.println(" ");
		 

		// Print.printarr(arr2);
		 
		 System.out.println("");
		 System.out.println("----------------- Randomly generated------------------");				// ������ �迭
		 System.out.println("");
		 
			for(int i=0; i<SMALLSIZE-1; i++) {
				arr2[i]=(int) ran.rand();
			}
			
			//Print.printarr(arr2);
			 System.out.print("Insertion_sort: ");
			 Insertion_sort IS3 = new Insertion_sort();
			 IS3.insertion_sorting(arr2);
			 System.out.println("");
			// Print.printarr(arr2);
			 
			 System.out.print("Merge_sort: ");
			 Merge_sort MG3  =new Merge_sort();
			 MG3.merge_sort(arr2);
			 System.out.println("");
			// Print.printarr(arr2);
			 
			 System.out.print("Heap_sort: ");
			 
			 
			 System.out.println(" ");
			// Print.printarr(arr2);
			
			 System.out.print("Quick_sort_firstelement: ");
			 Quick_sort_fistelement QSF3 = new Quick_sort_fistelement();
			 QSF3.quicksort(arr2);
			 System.out.println(" ");
			// Print.printarr(arr2);
			 
			 System.out.print("Quick_sort_median");
			 Quick_sort_median QSM3 = new Quick_sort_median();
			 QSM3.quicksort(arr2);
			 System.out.println(" ");
			 //Print.printarr(arr2);
			 
			 System.out.print("Quick_sort_random");
			 Quick_sort_random QSR3 = new Quick_sort_random();
			 QSR3.quicksort(arr2);
			 System.out.println(" ");
			 
	
			// Print.printarr(arr2);
	}

}


