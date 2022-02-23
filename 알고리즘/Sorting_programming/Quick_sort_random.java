package Sorting_programming;

public class Quick_sort_random {
	
	Compare cmp_qr = new Compare();
	public void quicksort(int[] array) {
		int[] arr=array.clone();

		long beforetime = System.nanoTime();	// ���� ������ ���ؼ� Syste.nanotime()�Լ� ���
		quicksort(arr,0,arr.length-1);
		long aftertime = System.nanoTime();		// �۵� ���� jvm�� ������ �ð� �ҽ��� ���� ���� longŸ������ ���뼼��Ʈ�� ��ȯ
		long resulttime = aftertime-beforetime;	// �� ���뼼���� ���� ���� ���
		System.out.print("                       "+ cmp_qr.showcount() +"                          "+resulttime);
		
	}
	
	private void quicksort(int[] arr, int start, int end) {	
		int part2=partition(arr,start,end);		//partition �Լ� ȣ��
		if(start>part2-1) {						// �迭�� ����� 1�̻��̾�� ��
			quicksort(arr,start,part2-1);		// ���� partition ���
		}
		if(part2<end) {							// �迭�� ����� 1�̻��̾�� ��
			quicksort(arr,part2,end);			// ������ partiton ���
		}
	}
	
	private int partition(int[] arr, int start, int end) {		//partition ���ϴ� �Լ�
		int pivot = arr[end];
		
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
				cmp_qr.compare();
			}
			while(arr[end]>pivot) {
				end--;
				cmp_qr.compare();
			}
			if(start<=end) {
				swap(arr,start,end);
				start++;
				end--;	
				
			}
		}
		return start;
	}
	private void swap(int[] arr, int start, int end) {		// swap �Լ�
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	
	 void random_p(int[] arr, int start, int end) {
		RandomNumber rp = new RandomNumber();
		int p = (int)(rp.rand()%(end-start));
		swap(arr,p,end);
	}

}


