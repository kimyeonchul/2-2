package Sorting_programming;

public class Insertion_sort {

		
		public void insertion_sorting(int[] array) {
			int[] arr=array.clone();
			Compare cmp_i = new Compare();
			int i,j,key=0;
			long beforetime = System.nanoTime();	// 성능 측정을 위해서 Syste.nanotime()함수 사용
			for(i=1;i<arr.length;i++) {	// 1번쨰 index부터 비교 시작
				key = arr[i];			//key 값에 비교하려는 index 값 저장
				for(j=i-1;j>=0;j--) {	// i-1부터 감소하며 비교
					cmp_i.compare();			// 비교할 때 마다 +1
					if(key<arr[j]) {	// key 값보다 arr[j]가 크다면
						arr[j+1]=arr[j];	// arr[j+1]에 arr[j]값 넣음
					}
					else
						break;				// i-1부터 순서대로 감소하며 비교하기 때문에 아니라면 바로 반복문 탈출
				}
				arr[j+1]=key;				// key값을 비교가 끝난 후 arr[j+1]에 넣어줌
				
			}
			long aftertime = System.nanoTime();		// 작동 중인 jvm의 정밀한 시간 소스의 현재 값을 long타입으로 나노세컨트를 반환
			long resulttime = aftertime-beforetime;	// 두 나노세컨드 값의 차이 계산
			
			System.out.print("                       "+cmp_i.showcount()+"                             "+resulttime);
			
			 
		}
	}


