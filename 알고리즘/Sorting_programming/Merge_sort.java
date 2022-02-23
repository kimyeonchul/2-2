package Sorting_programming;

public class Merge_sort {
	Compare cmp_m = new Compare();
	public void merge_sort(int[] array) {
		int[] arr=array.clone();
		int[] temp = new int[arr.length];
		
		
		long beforetime = System.nanoTime();	// 성능 측정을 위해서 Syste.nanotime()함수 사용
		merge_sort(arr, temp, 0, arr.length-1);
		long aftertime = System.nanoTime();		// 작동 중인 jvm의 정밀한 시간 소스의 현재 값을 long타입으로 나노세컨트를 반환
		long resulttime = aftertime-beforetime;	// 두 나노세컨드 값의 차이 계산
		
		System.out.print("                           "+cmp_m.showcount()+"                            "+resulttime);
	}
	
	private void merge_sort(int[] arr, int[] temp, int start, int end) {
	
		if(start<end) {
			int mid = (start+end)/2;
			merge_sort(arr,temp,start,mid);
			merge_sort(arr,temp,mid+1,end);
			merge(arr,temp,start,mid,end);
		}
	}
	
	private void merge(int[] arr, int[] temp, int start, int mid, int end) {
		
		for(int i=start;i<=end;i++) {
			temp[i]=arr[i];
		}		
		
		int po1 = start;
		int po2 = mid+1;
		int index = start;
		
		while(po1<=mid&&po2<=end) {
			if(temp[po1]<=temp[po2]) {
				arr[index]=temp[po1];
				po1++;
				cmp_m.compare();
			}
			else {
				arr[index]=temp[po2];
				po2++;
				cmp_m.compare();
			}
			
			index++;
		}
		for(int i=0;i<=mid-po1;i++) {
			arr[index+i]=temp[po1+i];
		}
	}
	
}