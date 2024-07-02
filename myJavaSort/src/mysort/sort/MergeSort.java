package mysort.sort;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length-1);
	}
	
	void mergeSort(T[] dataList, int start, int end) {
		if (start >= end) return;
		
		int mid = (start + end) / 2;
		mergeSort(dataList, start, mid);
		mergeSort(dataList, mid+1, end);
		merge(dataList, start, mid, end);
	}
	
	void merge(T[] dataList, int start, int mid, int end) {
		T[] tempList = Arrays.copyOfRange(dataList, 0, end - start + 1);
		int i = start, j = mid + 1, k = 0;
		while (i <= mid && j <= end) {
			if (dataList[i].compareTo(dataList[j]) >= 1)
				tempList[k++] = dataList[i++];
			else
				tempList[k++] = dataList[j++];
		}
		
		while (i <= mid) tempList[k++] = dataList[i++];
		while (j <= end) tempList[k++] = dataList[j++];
		
		//for (i = start, k = 0; k < tempList.length; i++, k++)
		//	dataList[i] = tempList[k];
		
		System.arraycopy(tempList, 0, dataList, start, end-start+1);
	}

}
