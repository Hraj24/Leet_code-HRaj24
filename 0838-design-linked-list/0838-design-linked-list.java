class MyLinkedList {

    class Node{
        int data;
        Node next;
    }


    private Node head;
    private Node tail;
    private int size;



    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node();
        nn.data=val;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }      
        else{
            nn.next=head;
            head=nn;
            size++;
        }                                           
    }
    
    public void addAtTail(int val) {
        Node nn=new Node();
        nn.data=val;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }      
        else{
            tail.next=nn;
            tail=nn;
            size++;
        } 
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return ;
        }
        if(index==0){
            addAtHead(val);
        }
        else if(index==size){
            addAtTail(val);
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node nn=new Node();
            nn.data=val;
            nn.next=temp.next;
            temp.next=nn;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=0 && index<size){
            if(index==0){
                head=head.next;
                if(size==1){
                    tail=null;
                }
            }
            else{
                Node temp=head;
                for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                if(index==size-1){
                    tail=temp;
                }
            }
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */