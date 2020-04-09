/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 12 - List
 * 
 * *
 */

package ua.lviv.lgs.hw12.task3;

/**
 * * Class SimpleArrayList
 * * Resizable-array implementation of the <tt>List</tt> interface. (simplicity remade of original ArrayList by Oracle )
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

import java.util.Arrays;
import java.util.Collection;

public class SimpleArrayList {

	/**
	 * Default initial capacity.
	 */
	private static final int DEFAULT_CAPACITY = 10;

	

	/**
	 * The array buffer into which the elements of the SimpleArrayList are stored.
	 * The capacity of the ArrayList is the length of this array buffer. Any empty
	 * SimpleArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA will be
	 * expanded to DEFAULT_CAPACITY when the first element is added.
	 */
	transient Object[] elementData; // non-private to simplify nested class access

	/**
	 * The size of the SimpleArrayList (the number of elements it contains).
	 *
	 * @serial
	 */
	private int size;

	/**
	 * Constructs an empty list with an initial capacity of ten.
	 */
	public SimpleArrayList() {
		this.elementData = new Object[DEFAULT_CAPACITY];

	}

	public Object[] getElementData() {
		return elementData;
	}

	public void setElementData(Object[] elementData) {
		this.elementData = elementData;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "SimpleArrayList [elementData=" + Arrays.toString(elementData) + ", size=" + size + "]";
	}

	/**
	 * Appends the specified element to the end of this list.
	 *
	 * @param e element to be appended to this list
	 * @return <tt>true</tt> (as specified by {@link Collection#add})
	 */
	public boolean add(Object e) {

		if (size < elementData.length) {
			elementData[size++] = e;
		} else {

			elementData = Arrays.copyOf(elementData, elementData.length + 1);
			elementData[size++] = e;

		}

		return true;
	}

	/**
	 * Removes the element at the specified position in this list. Shifts any
	 * subsequent elements to the left (subtracts one from their indices).
	 *
	 * @param index the index of the element to be removed
	 * @return the element that was removed from the list
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Object remove(int index) {

		Object oldValue = elementData[index];

		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		elementData[--size] = null; // clear to let GC do its work

		return oldValue;
	}

}
