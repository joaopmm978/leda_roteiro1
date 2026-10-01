package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import static util.Util.swap;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex >= 0 && rightIndex < array.length){
			if(leftIndex < rightIndex){
				int idxMaior = achaMaior(array, leftIndex, rightIndex);
				swap(array, rightIndex, idxMaior);
				sort(array, leftIndex, rightIndex - 1);
			}
		}
	}

	public int achaMaior(T[] array, int leftIndex, int rightIndex){
		int idxMaior;
		
		if(leftIndex == rightIndex){
			idxMaior = leftIndex;
		}
		else{
			idxMaior = achaMaior(array, leftIndex + 1, rightIndex);
		}
		if(array[leftIndex].compareTo(array[idxMaior]) > 0){
			idxMaior = leftIndex;
		}

		return idxMaior;


	}

}
