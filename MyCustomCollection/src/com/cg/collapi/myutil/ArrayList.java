package com.cg.collapi.myutil;

public class ArrayList<E> implements List<E> {

	private static final int DEFAULT_CAPACITY = 10;
	private Object[] objArray = new Object[DEFAULT_CAPACITY];
	private int elementCount = 0;

	@Override
	public void add(E element) {
		if (ensureCapacity()) {
			increaseCapacity();
		}
		objArray[elementCount] = element;
		elementCount++;

	}

	@Override
	public int capacity() {
		return objArray.length;
	}

	@Override
	public int size() {

		return elementCount;
	}

	@Override
	public Object get(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Problem : " + index);
		}
		return objArray[index];
	}

	@Override
	public Object remove(int index) {
		checkRange(index);

		Object removedObj = get(index);
		for (int i = index; i < elementCount - 1; i++) {
			objArray[i] = objArray[i + 1];
		}
		set(elementCount - 1, null);
		elementCount--;
		return removedObj;
	}

	@Override
	public Object set(int index, E element) {
		checkRange(index);
		objArray[index] = element;
		return get(index);
	}
	
	/**
	 * Return the list Representation of collection
	 * Iterate the array till elementCount
	 * Append value in StringBuffer object and return final value
	 */
	
	@Override
	public String toString() {
		StringBuilder sb =  new StringBuilder("[");
		for (int i = 0; i < elementCount; i++) {
			sb.append(objArray[i]);
			if(i<elementCount-1)
			sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	/**
	 * this ensures that elementCount is equal to the total length of original
	 * array.
	 * 
	 * @return true if element count is equal to the length of original array
	 *         otherwise false
	 */
	private boolean ensureCapacity() {
		return elementCount == objArray.length;
	}

	/**
	 * This method is used to increase capacity of array by 2 times the original
	 * array. This method will perform below operations. 1. Creating new Array
	 * with two time capacity of the original array 2. Copy the original array
	 * elements in new array 3. Assign the new array to original array and make
	 * the old array eligible to garbadge collection
	 */
	private void increaseCapacity() {

		int newCapacity = objArray.length * 2;
		Object[] newArray = new Object[newCapacity];

		copy(newArray);

		objArray = newArray;

	}

	/**
	 * This method will copy the original array to new array
	 * 
	 * @param newArray
	 *            will be passed as argument where data need to be copied.
	 */
	private void copy(Object[] newArray) {
		for (int i = 0; i < objArray.length; i++) {
			newArray[i] = objArray[i];
		}
	}
	
	private void checkRange(int index) {
		if(index<0 || index>=size()){
			throw new IndexOutOfBoundsException("Problem : "+index);
		}
	}

}
