package bk4_05CreatingGenericCollectionClasses;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object clone() {
		try {
			ArrayList<E> v = (ArrayList<E>) super.clone();
			v.elementData = (E[]) new Object[size];
			System.arraycopy(elementData, 0, v.elementData, 0, size);
			v.modCount = 0;
			return v;
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen since we're Cloneable
			throw new InternalError();
		}
	}
}
