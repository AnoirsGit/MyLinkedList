package app;
class LinkedL<E>{
    Node head;
    Node tail;
    int size= 0;
    LinkedL(){
        this.head=null;
        this.tail=null;
        this.size =0 ;

    }


    private class Node<E>{
        E data;
        Node next;
        Node prev;
        public Node(E data){
            this.data=data;
        }
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }

    public void add(E obj){
        Node data = new Node(obj);
        if(head == null){ 
            head = data;
            tail = data;
        }
        else {
            data.prev = tail;
            tail.next=data;
            tail =data;
            
        }
        size++;
    }
    public E removeLast(){
        if(isEmpty()==false){
            E var = (E) tail.data;
            tail = tail.prev;
            tail.next.prev =null;
            tail.prev.next =tail;
            tail.next=null;
            return var;
        }
        else{
            return null;
        }
    }
    public boolean hasnext(){
        
    }
}