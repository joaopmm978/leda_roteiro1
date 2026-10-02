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
				int idxMaior = achaMenor(array, leftIndex, rightIndex);
				swap(array, leftIndex, idxMaior);
				sort(array, leftIndex + 1, rightIndex);
			}
		}
	}

	public int achaMenor(T[] array, int leftIndex, int rightIndex){
		int idxMenor;
		
		if(leftIndex == rightIndex){
			idxMenor = leftIndex;
		}
		else{
			idxMenor = achaMenor(array, leftIndex + 1, rightIndex);
		}

		if(array[leftIndex].compareTo(array[idxMenor]) < 0){
			idxMenor = leftIndex;
		}

		return idxMenor;


	}

}
