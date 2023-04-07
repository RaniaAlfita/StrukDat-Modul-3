/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.queue;

/**
 *
 * @author USER
 */
class Queue {

    LinkedList list;
    
    public Queue() {
        list = new LinkedList();
    }
    
    public void add(Object data) {
        list.add(data);
    }
    
    public Object remove() {
        return list.remove();
    }
    
    public Object element() {
        return list.peek();
    }
    
    public Object poll() {
        return list.remove();
    }
    
    public Object peek() {
        return list.peek();
    }
}
