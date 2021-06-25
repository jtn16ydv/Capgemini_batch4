package com.cg.collapi.myutil;

public interface List<E> {
	
	/**
	 * Add Specified object into this list, Append the element in the last
	 * @param object to be stored in this list
	 */
	void add (E element);
	
	/**
	 * Returns the maximum capacity of this list
	 * 
	 * @return maximum capacity of this list as int value
	 */
	
	int capacity();
	
	/**
	 * This method will return the total number of elements that are available in collection
	 * @return total number of elements. 
	 */
	int size();
	
	/**
	 * This method should return the Object based on the specific index position
	 * @param index is provided as position
	 * @return object based on index value
	 */
	Object get(int index);
	
	/**
	 * Removes the element at the specified position in this list. 
	 * Shifts any subsequent elements to the left (subtracts one from their indices
	 * @return Removed Object
	 * @throws IndexOutOfBoundsException if specified index is not in range
	 * (index<0 || index>=size())
	 */
	Object remove(int index);
	
	/**
	 * Replaces the element at specified index in this list
	 * @param index of element to be replaced
	 * @param element to be replaced
	 * @return previously available object on specified index position
	 * @throws IndexOutOfBoundsException if index is out of range
	 * (index<0 || index>=size())
	 */
	Object set(int index, E element);
	
	

}
