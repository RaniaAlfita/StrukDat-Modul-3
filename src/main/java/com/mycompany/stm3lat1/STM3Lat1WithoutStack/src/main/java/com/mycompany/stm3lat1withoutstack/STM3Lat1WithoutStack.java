/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stm3lat1withoutstack;

/**
 *
 * @author USER
 */

public class STM3Lat1WithoutStack {
    private int top;
    private final String[] data;
    private final int size;

    public STM3Lat1WithoutStack(int size) {
        this.top = -1;
        this.size = size;
        this.data = new String[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        data[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return data[top];
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Next: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        STM3Lat1WithoutStack st= new STM3Lat1WithoutStack(5);
        st.push("Aku");
        st.push("anak");
        st.push("Indonesia");
        st.printStack();
        System.out.println("Raya " + st.peek());
        st.pop();
        st.printStack();
    }
}
