package Sorting_programming;

public class Insertion_sort {

		
		public void insertion_sorting(int[] array) {
			int[] arr=array.clone();
			Compare cmp_i = new Compare();
			int i,j,key=0;
			long beforetime = System.nanoTime();	// ���� ������ ���ؼ� Syste.nanotime()�Լ� ���
			for(i=1;i<arr.length;i++) {	// 1���� index���� �� ����
				key = arr[i];			//key ���� ���Ϸ��� index �� ����
				for(j=i-1;j>=0;j--) {	// i-1���� �����ϸ� ��
					cmp_i.compare();			// ���� �� ���� +1
					if(key<arr[j]) {	// key ������ arr[j]�� ũ�ٸ�
						arr[j+1]=arr[j];	// arr[j+1]�� arr[j]�� ����
					}
					else
						break;				// i-1���� ������� �����ϸ� ���ϱ� ������ �ƴ϶�� �ٷ� �ݺ��� Ż��
				}
				arr[j+1]=key;				// key���� �񱳰� ���� �� arr[j+1]�� �־���
				
			}
			long aftertime = System.nanoTime();		// �۵� ���� jvm�� ������ �ð� �ҽ��� ���� ���� longŸ������ ���뼼��Ʈ�� ��ȯ
			long resulttime = aftertime-beforetime;	// �� ���뼼���� ���� ���� ���
			
			System.out.print("                       "+cmp_i.showcount()+"                             "+resulttime);
			
			 
		}
	}


