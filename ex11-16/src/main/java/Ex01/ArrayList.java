package Ex01;

import java.util.*;

import Ex01.ArrayList;

public class ArrayList<E> implements List<E> {
	private int size;
	private E[] data;
	
	public ArrayList() {
		this.size = 0;
		resize();
	}
	
	private void resize() {
		if (size == 0) {
			data = (E[]) new Object[5];
		}
		else {
			E[] newData = (E[]) new Object[size + 5];
			System.arraycopy(data,  0, newData,  0, size);
			data = newData;
		}
	}
	
	@Override
	public void add(E element) {
		if(data.length == size) {
			resize();
		}
		
		data[size++] = element;
	}

	@Override
	public void add(int index, E element) {
		checkBoundsInclusive(index);
		
		if(size == data.length)
			resize();
		
		if(index != size)
			System.arraycopy(data, index, data, index+1, size - index);
		
		data[index] = element;
		size++;
	}

	@Override
	public E get(int index) {
		/* 이거는 아닌거같음.
		if (index > size)
		{
			System.out.println("index > size");
			try {
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		try {
			
		} catch(Exception e) {
			//System.out.println(e.toString());
			e.printStackTrace(System.out);
			
			//StackTraceElement[] elem = e.getStackTrace();
			//for ( int i = 0; i < elem.length; i++ )
			//	System.out.println(elem[i]);
		}
		*/
		
		checkBoundsExclusive(index);		
		return data[index];
	}

	@Override
	public E remove(int index) {
		checkBoundsExclusive(index);
		
		E r = data[index];
		if  (index != --size)
			System.arraycopy(data,  index + 1, data, index, size - index);
		//data[size] = null;
		return r;
	}

	@Override
	public void removeAll() {
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}
	
	private void checkBoundsExclusive(int index)
	{
		if  (index  < 0 || index  >= size) {
			throw new  IndexOutOfBoundsException("Index: " + index + ", Size: "  + size);
		}
	}
	
	private void checkBoundsInclusive(int index) {
		if  (index  < 0 || index  > size) {
			throw new  IndexOutOfBoundsException("Index: " + index + ", Size: "  +size);
		}
	}

	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		
		return new Iterator<E>() {
			int i = 0;
			@Override
			public boolean hasNext() {
				if( i < size()) {
					return true;
				}
				else {
					return false;
				}
				//return i < size();
			}

			@Override
			public E next() {
				//if(i == size())
				//	throw new  NoSuchElementException();
				return get(i++);
			}
		};
	}
}