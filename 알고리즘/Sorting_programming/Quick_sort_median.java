package Sorting_programming;

public class Quick_sort_median {

	Compare cmp_qm = new Compare();
	public void quicksort(int[] array) {
		int[] arr=array.clone();

		long beforetime = System.nanoTime();	// 성능 측정을 위해서 Syste.nanotime()함수 사용
		quicksort(arr,0,arr.length-1);
		long aftertime = System.nanoTime();		// 작동 중인 jvm의 정밀한 시간 소스의 현재 값을 long타입으로 나노세컨트를 반환
		long resulttime = aftertime-beforetime;	// 두 나노세컨드 값의 차이 계산
		System.out.print("                      "+cmp_qm.showcount()+"                           "+resulttime);
		
	}
	
	private void quicksort(int[] arr, int start, int end) {	
		int part2=partition(arr,start,end);		//partition 함수 호출
		if(start>part2-1) {						// 배열의 사이즈가 1이상이어야 함
			quicksort(arr,start,part2-1);		// 왼쪽 partition 재귀
		}
		if(part2<end) {							// 배열의 사이즈가 1이상이어야 함
			quicksort(arr,part2,end);			// 오른쪽 partiton 재귀
		}
	}
	
	private int partition(int[] arr, int start, int end) {		//partition 구하는 함수
		int mid = (start+end)/2;
	   median(arr,start,mid,end);
		int pivot = arr[end];
		
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
				cmp_qm.compare();
			}
			while(arr[end]>pivot) {
				end--;
				cmp_qm.compare();
			}
			if(start<=end) {
				
				swap(arr,start,end);
				start++;
				end--;	
			}
			
		}
		return start;
	}
	private void swap(int[] arr, int start, int end) {		// swap 함수
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

	private void median(int []arr, int front, int mid, int rear){
		if(arr[front]>arr[mid]) swap(arr, front, mid);
		if(arr[mid]>arr[rear]) swap(arr, mid, rear);
		if(arr[front]>arr[mid]) swap(arr, front, mid);
	}
}
