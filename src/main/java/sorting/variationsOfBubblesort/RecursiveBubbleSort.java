package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import static util.Util.swap;

public class RecursiveBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do bubble sort. Você deve implementar apenas esse
	 * método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex >= 0 && rightIndex < array.length){
			if(leftIndex < rightIndex){
				bubbleSort(array, leftIndex, rightIndex);
				sort(array, leftIndex, rightIndex - 1);
			}
		}
		
	}

	public void bubbleSort(T[] array, int leftIndex, int rightIndex){
		if(leftIndex < rightIndex){
			if (array[leftIndex].compareTo(array[leftIndex + 1]) > 0) {
				swap(array, leftIndex, leftIndex + 1);
			}
			bubbleSort(array, leftIndex + 1, rightIndex);
		}
	}


}
