 package Ex01;

import java.util.*;

public class LinkedList<E> implements List<E> {

	private int size;
	private Node<E> head;
	
    @Override
    public void add(E element) {

    	Node<E> newNode = new Node<E>(element);
    	
    	if(head == null)
    		head = newNode;
    	else  {
    		Node<E> last = head;
    		while(last.next != null) {
    			last = last.next;
    		}
    		last.next = newNode;
    	}
    	size++;
    }

    @Override
    public void add(int index, E element) {
    	checkBoundsExclusive(index);
    	
    	if(index == size) {
    		add(element);
    		return;
    	}
    	Node<E> newNode = new Node<E>(element);
    	Node<E> x = head;
    	for(int i = 0; i < index - 1; i++) {
    		x = x.next;
    	}
    	
    	if(index == 0) {
    		head = newNode;
    		newNode.next = x;
    	}
    	else {
    		newNode.next = x.next;
    		x.next = newNode;
    	}
    	size++;
    }

    @Override
    public E get(int index) {
    	checkBoundsExclusive(index);
    	Node<E> x = head;
    	for(int i = 0; i < index; i++)
    		x = x.next;
    
        return x.data;
    }

    @Override
    public E remove(int index) {
        checkBoundsExclusive(index);
        E element;
        if(index == 0) {
        	element = head.data;
        	head = head.next;
        } else {
        	Node<E> x = head;
        	for(int i = 0; i < index - 1; i++)
        		x = x.next;
        	
        	element = x.next.data;
        	x.next = x.next.next;
        }
        size--;
        return  element;
    }

    @Override
    public void removeAll() {
    	for(Node<E> x = head; x != null;) {
    		Node<E> next  = x.next;
    		x.data = null;
    		x.next = null;
    		x = next;
    	}
    	head = null;
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
	
	private static class Node<E> {
		private Node<E> next;
		private E data;
			
		private Node( E element ) {
			this.data = element;
			this.next = null;
		}
			
		private Node( E element, Node<E> next ) {
			this.data = element;
			this.next = next;
		}
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
			//int i = 0;
			private Node<E> pos = head;
			@Override
			public boolean hasNext() {
				/*
				if( i < size()) {
					return true;
				}
				else {
					return false;
				}
				*/
				return (pos != null);
			}

			@Override
			public E next() {
				//if(i == size())
				//	throw new NoSuchElementException();
				//return get(i++);
				
				if (pos == null)
					throw new NoSuchElementException();
				E data = pos.data;
				pos = pos.next;
				return data;
			}		
		};
	}
}