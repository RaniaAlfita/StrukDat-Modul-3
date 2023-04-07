/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stm3lat2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author USER
 */
public class STM3Lat2 {

    public void queueExample() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove: " + queue.remove());
        System.out.println("element: " + queue.element());
        System.out.println("poll: " + queue.poll());
        System.out.println("peek: " + queue.peek());
    }

    public static void main(String[] args) {
        new STM3Lat2().queueExample();
    }
}
