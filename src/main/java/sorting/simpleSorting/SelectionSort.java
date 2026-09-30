package sorting.simpleSorting;

import sorting.AbstractSorting;
import static util.Util.swap;;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// selecionamos o menor eai trocamos com a posicao inicial,
		// em seguida, começamos de leftindex + 1 selecionando novamente,
		// trocamos com a posicao inicial + 1. 
		while(leftIndex < rightIndex){
			int idxmenor = leftIndex;
			for(int i = leftIndex + 1; i < rightIndex; i++){
				if(array[idxmenor].compareTo(array[i]) > 0){
					idxmenor = i;
				}
			}
			swap(array, leftIndex, idxmenor);
			leftIndex++;
		}
	}
}
