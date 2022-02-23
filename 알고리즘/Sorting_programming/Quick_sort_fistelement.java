package Sorting_programming;

public class Quick_sort_fistelement {
	
		Compare cmp_qf = new Compare();
		public void quicksort(int[] array) {
			int[] arr=array.clone();

			long beforetime = System.nanoTime();	// 성능 측정을 위해서 Syste.nanotime()함수 사용
			quicksort(arr,0,arr.length-1);
			long aftertime = System.nanoTime();		// 작동 중인 jvm의 정밀한 시간 소스의 현재 값을 long타입으로 나노세컨트를 반환
			long resulttime = aftertime-beforetime;	// 두 나노세컨드 값의 차이 계산
			System.out.print("               "+cmp_qf.showcount()+"                          "+resulttime);
			
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
			int pivot = arr[start];
			
			while(start<=end) {
				while(arr[start]<pivot) {
					start++;
					cmp_qf.compare();
				}
				while(arr[end]>pivot) {
					end--;
					cmp_qf.compare();
				}
				if(start<=end) {
					swap(arr,start,end);
					start++;
					end--;	
				}
			}
			return start;
		}
		private static void swap(int[] arr, int start, int end) {		// swap 함수
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}

	}

