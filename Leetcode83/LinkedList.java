/**
 * @author Jaankee
 * @version 1.2
 * Creates LinkedList Class
 */
public class LinkedList<T>{

    private static class Node<T>{

        //creates static inner class for node

        //creates string placeholder for node data
        private T data;
    
        //creates next node in the linked list
        private Node<T> next;
    
        private void setNext(Node<T> head){
            //creates setter for next node
    
            next = head;
    
        }
    
        private T getData(){
            //creates getter for node's data
    
            return data;
    
        }

        private void setData(T data) {

            this.data = data;

        }
    
        private Node<T> getNext(){
            //creates getter for next node in list
    
            return next;
            
        }
    
        //constructor for node
        private Node(T d){
            
            this.setData(d);
    
        }
    
    }

    //creates base node
   private Node<T> head;

   //instance variable for counting length of list
   private int size = 1;

   private T tempT;

   public void sort(){

        if (head == null) {

            return;

        }

        Node<T> currentNode = head;

        Node<T> index;

        Node<T> tempNode = new Node<T>(null);

        while(currentNode != null){

            index = currentNode.getNext();

            while(index != null){

                if((int)currentNode.getData() > (int)index.getData()){

                    tempNode.setData(currentNode.getData());
                    currentNode.setData(index.getData());
                    index.setData(tempNode.getData());

                }

                index = index.getNext();

            }

            currentNode = currentNode.getNext();
 
        }
 
   }

   public T fetch(T data){

        Node<T> currentNode = head;
        
        while(currentNode != null){

            if(currentNode.getData() == data) return data;

            currentNode = currentNode.getNext();

        }

        return null;

   }

   public void addToFront(T data){
    
    //method for adding next node in list

    if (data == null) {

        //if node's data passed in is null, kill program

        throw new IllegalArgumentException("illegal arguememt: null");

    } else {

        //data is not null

        Node<T> nodeToAdd = new Node<T>(data);
        
        nodeToAdd.setNext(this.head);

        this.head = nodeToAdd;

        size++;

        }

    }

    public void insertAfter(T existingData, T newData){
        // Start at the head
        Node<T> currentNode = head;
            
        // Traverse the list until either the end or the data is found
        while(currentNode != null && !(currentNode.getData().equals(existingData))) currentNode = currentNode.getNext();
        
        // Only insert if the item was found
        if(currentNode != null) {

            Node<T> nextNode = currentNode.getNext();

            Node<T> newNode = new Node<T>(newData);

            currentNode.setNext(newNode);

            newNode.setNext(nextNode);

            size++;

        }
        
    }

    public void addToEnd(T data){

        Node<T> currentNode = head;

        Node<T> nodeToAdd = new Node<T>(data);

        if(head == null) {
            
            head = nodeToAdd;

            return;

        }

        while(currentNode.getNext() != null) {

            currentNode = currentNode.getNext();

        }

        currentNode.setNext(nodeToAdd);

        size++;

    }

    public T remove(){ 

        //method for removing nodes from list

         if (this.head == null){

            //if list is empty, throw exception

            throw new NullPointerException("cannot remove null");

        } else {

            //if there is another node in line, replace current node

            tempT = this.head.getData();

            this.head = this.head.getNext();

            size--;

            return tempT;
    
        }

    }

    public void removeMiddle(T existingData){
        // Start at the head
        Node<T> currentNode = head;
            
        // Traverse the list until either the end or the data is found
        while(currentNode != null && !(currentNode.getData().equals(existingData))) currentNode = currentNode.getNext();
        
        // Only insert if the item was found
        if(currentNode != null) {

            if(currentNode.getNext() != null){

                currentNode.setNext(currentNode.getNext().getNext());

            } else {

                currentNode = null;

            }

            size--;

        }
        
    }

    public T removeLast(){

        if (this.head == null){

            //if list is empty, throw exception

            throw new NullPointerException("cannot remove null");

        } else if (this.head.getNext() == null) {

            return this.remove();

        } else {

            Node<T> lastNode = head;

            Node<T> currentNode = head.getNext();
            
            // Run until last element
            while(currentNode.getNext() != null) {

                lastNode = currentNode;

                currentNode = currentNode.getNext();
            }
            
            // Get the data from the last element
            T data = currentNode.getData();
            
            // Set the second-last element's pointer to null
            lastNode.setNext(null);
            
            // Decrement size
            size--;
            
            // Return the data
            return data;

        }

    }

    public int getSize(){

        //return length of list

        return size;

    }

    public String toString(){

        String output = "[ ";
 
        if (head != null) {

            Node<T> current = head;

            while (current != null) {

                output += current.getData().toString() + " ";

                current = current.getNext();
            }
 
        }

        return output += "]";

    }

    public int locatePosition(int x){
        // Start at the head
        Node<T> currentNode = head;
        int y = 0;
            
        // Traverse the list until either the end or the data is found
        while(y != x) {
            
            currentNode = currentNode.getNext();
            y++;

        }

        return (int)currentNode.getData();

    }

    public static void main(String[] args){


    }  
     
}




    

