package Classes;



public class SLL<E> {
    private static class Node<E> { 
    	private E element; 
		private Node<E> next; 
		public Node(E e, Node<E> node) {
			element = null; 
			next= null;
		}
		public E getElement() {
			return element;
		}
		public void setElement(E data) {
			this.element = data;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
		public void clean() { 
			element = null; 
			next = null; 
		}
      // ... class for nodes of the singly linked list... as seen in the past
    }
    private Node<E> first = null; 
    private int size = 0; 
    public void addFirst(E e) { 
        Node<E> nuevo = new Node<>(e, first); 
        first = nuevo; 
        size++; 
   }
   public String toString() { 
	   String s = ""; 
	   Node<E> current = first; 
	   while (current != null) { 
	      s += " " + current.getElement(); 
	      current = current.getNext(); 
        }
        return s; 
   }
   // NO NEED FOR OTHER METHODS FOR THE MOMENT...
  // ... we will add more methods as part of the exercises below...
   
   public void reverse() { 
	   if (size > 1)  
		     first=recReverse(first).fi;
   }
   
   private Node<E> recReverse(Node<E> b) { 
       if  (b==null) return null;
       Node<E> a=recReverse(b.getNext()); 
       addLast(a,b);
       return a;
   }
   public void addLast(Node<E> F, Node<E> n) {
	   while(F.getNext() != null)
		   F = F.getNext();
	   F.setNext(n);
	   n.setNext(null);
   }
   
}
