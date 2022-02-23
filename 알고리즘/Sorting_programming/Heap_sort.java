package Sorting_programming;

public class Heap_sort {

		public void heapsort(int[] arr) {
			heapsort(arr,arr.length);
		}
		
		public void heapsort(int[] arr, int size) {
			
			if(size<2) {
				return ;
			}
			
			int parentIdx = getParent(size-1);
			
			for(int i=parentIdx;i>=0;i--) {
				heapify(arr,i,size-1);
			}
			
			for(int i=size-1;i>0;i--) {
				
				swap(arr,0,i);
				heapify(arr,0,i-1);
			}
		}
		
		private int getParent(int child) {
			return (child-1)/2;
		}
		
		private void swap(int[] arr, int i,int j) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
		}
		
		private void heapify(int []arr, int parentIdx, int lastIdx) {
			int l_child;
			int r_child;
			int largest;
			
			while((parentIdx*2)+1 <=lastIdx){
				l_child = (parentIdx*2)+1;
				r_child = (parentIdx*2)+2;
				largest=parentIdx;
				
				if(arr[l_child]>arr[largest]) {
					largest = l_child;
				}
				
				if(largest != parentIdx) {
					swap(arr,parentIdx,largest);
					parentIdx= largest;
				}
				else
					return ;
				
			}
		}
}