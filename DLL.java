public class DLL<E> {
	private DLLNode<E> first, last;

	public DLL() {
		// Construct an empty SLL
		this.first = null;
		this.last = null;
	}

	public void deleteList() {
		first = null;
		last = null;
	}

	public int length() {
		int ret;
		if (first != null) {
			DLLNode<E> tmp = first;
			ret = 1;
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret++;
			}
			return ret;
		} else
			return 0;

	}

	public void insertFirst(E o) {
		DLLNode<E> ins = new DLLNode<E>(o, null, first);
		if (first == null)
			last = ins;
		else
			first.pred = ins;
			first = ins;
	}

	public void insertLast(E o) {
		if (first == null)
			insertFirst(o);
		else {
			DLLNode<E> ins = new DLLNode<E>(o, last, null);
			last.succ = ins;
			last = ins;
		}
	}

	public void insertAfter(E o, DLLNode<E> after) {
		if (after == last) {
			insertLast(o);
			return;
		}
		DLLNode<E> ins = new DLLNode<E>(o, after, after.succ);
		after.succ.pred = ins;
		after.succ = ins;
	}

	public void insertBefore(E o, DLLNode<E> before) {
		if (before == first) {
			insertFirst(o);
			return;
		}
		DLLNode<E> ins = new DLLNode<E>(o, before.pred, before);
		before.pred.succ = ins;
		before.pred = ins;
	}

	public E deleteFirst() {
		if (first != null) {
            if (first.succ == null){
				last = null;
                first = null;
            }
			else{
				DLLNode<E> tmp = first;
				first = first.succ;
				first.pred = null;
				return tmp.element;
			}			
		}  
		return null;
	}

	public E deleteLast() {
		if (first != null) {
			if (first.succ == null)
				return deleteFirst();
			else {
				DLLNode<E> tmp = last;
				last = last.pred;
				last.succ = null;
				return tmp.element;
			}
		}
		// else throw Exception
		return null;
	}

	@Override
	public String toString() {
		String ret = new String();
		if (first != null) {
			DLLNode<E> tmp = first;
			ret += tmp + "<->";
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret += tmp + "<->";
			}
		} else
			ret = "Prazna lista!!!";
		return ret;
	}

	public DLLNode<E> getFirst() {
		return first;
	}

	public DLLNode<E> getLast() {

		return last;
	}
	
	public void flip(DLL<Integer> inputList, DLL<Integer> outputList) {
		DLLNode<Integer> firstNode = inputList.getFirst();
		DLLNode<Integer> lastNode = inputList.getLast();
		
		while(firstNode.element != null) {
			if(firstNode.element == null) {
				break;
			}
			else {
				if(firstNode.element % 2 == 0) {
					outputList.insertFirst(firstNode.element);
					firstNode = firstNode.succ;
				}
				else {
					outputList.insertLast(lastNode.element);
					
					lastNode = lastNode.pred;
					if(firstNode.succ == null) {
						break;
					}
					else {
						firstNode = firstNode.succ;
					}
				}
			}
		}
	}
	
	public void printList(DLL<Integer> list) {
		DLLNode<Integer> printNode = list.getFirst();
		
		while(printNode.element != null) {
			System.out.print(printNode.element + " ");
			if(printNode.succ == null) {
				break;
			}
			else {
				printNode = printNode.succ;
			}
		}
	}
	
	public DLL<Integer> mergeLists(DLL<Integer> list1, DLL<Integer> list2) {
		DLLNode<Integer> startNode = list1.getFirst();
		DLLNode<Integer> endNode = list2.getLast();
		DLL<Integer> evenList = new DLL<Integer>();
		DLL<Integer> oddList = new DLL<Integer>();

		while(endNode.pred != null) {
			
			if(startNode.element % 2 == 0) {
				if(evenList.getFirst() == null) {
					evenList.insertFirst(startNode.element);
				}
				else {
					evenList.insertAfter(startNode.element, evenList.getLast());
				}
			}

			startNode = startNode.succ;	
			
			if(endNode.element % 2 == 0) {
				if(evenList.getFirst() == null) {
					evenList.insertFirst(endNode.element);
				}
				else {
					evenList.insertAfter(endNode.element, evenList.getLast());
				}
			}
			if(endNode.pred == null) {
				break;
			}
			else {
				endNode = endNode.pred;	
			}
	
			if(startNode.succ == null) {
				evenList.insertLast(startNode.element);
				while(endNode.element != null) {
					if(endNode.element % 2 == 0) {
						if(evenList.getFirst() == null) {
							evenList.insertFirst(endNode.element);
						}
						else {
							evenList.insertAfter(endNode.element, evenList.getLast());
						}
					}
					if(endNode.pred == null) {
						break;
					}
					else {
						endNode = endNode.pred;	
					}
				}
			}
		}
		
		startNode = list1.getFirst();
		
		while(startNode.element != null) {
			if(startNode.element % 2 != 0) {
				if(oddList.getFirst() == null) {
					oddList.insertFirst(startNode.element);
				}
				else {
					oddList.insertAfter(startNode.element, oddList.getLast());
				}
			}
			if(startNode.succ == null) {
				break;
			}
			else {
				startNode = startNode.succ;
			}
		}
		
		endNode = list2.getLast();
		evenList.getLast().succ = oddList.getFirst();
		oddList.getFirst().pred = evenList.getLast().succ;
		
		while(endNode.pred != null) {
			if(endNode.element % 2 != 0) {
				oddList.insertAfter(endNode.element, oddList.getLast());
			}
			if(endNode.pred == null) {
				break;
			}
			else {
				endNode = endNode.pred;
			}
		}
		
		return evenList;
	}

}