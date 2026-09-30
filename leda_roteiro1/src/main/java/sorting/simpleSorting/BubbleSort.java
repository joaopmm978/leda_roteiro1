package sorting.simpleSorting;

import sorting.AbstractSorting;
import static util.Util.swap;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex >= 0 && rightIndex <= array.length){
			boolean swapped = true;
			while(swapped && leftIndex < rightIndex){
				swapped = false;
				for(int idx = leftIndex; idx < rightIndex; idx++){
					if(array[idx].compareTo(array[idx + 1]) > 0){
						swapped = true;
						swap(array, idx, idx + 1);
					}
				
				}
			rightIndex--;

			}
		}
	}
}
