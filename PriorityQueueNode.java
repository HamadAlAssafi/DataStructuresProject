/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

/**
 *
 * @author sherif.matar
 */
public class PriorityQueueNode<Key, T> {
    private T data; 
    private Key key;              
    private PriorityQueueNode<Key, T> next;    

    PriorityQueueNode(Key key, T data, PriorityQueueNode<Key, T> next){
        this.data = data; 
        this.key = key;
        this.next = next;
    }
    PriorityQueueNode(Key key, T data){
        this.data = data;  
        this.key = key;
    }
    PriorityQueueNode<Key, T> getNext() { 
        return next; 
    }  
    PriorityQueueNode<Key, T> setNext(PriorityQueueNode<Key, T> next){ 
        return this.next = next; 
    }    
    T getData() { 
        return data; 
    }  
    T setData(T data) { 
        return this.data = data; 
    }
    Key getKey() { 
        return key; 
    }  
    Key setKey(Key key) { 
        return this.key = key; 
    }
}
