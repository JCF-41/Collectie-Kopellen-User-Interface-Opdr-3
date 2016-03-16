/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortClasses;

import java.util.PriorityQueue;

/**
 *
 * @author Loek
 */
public class HuffNode implements Comparable {

    private int value;
    private String name;
    private String adress;
    private String location;
    private HuffNode leftChild = null, rightChild = null;

    public HuffNode(String name, int value, String location) {
        this.value = value;
        this.name = name;
        this.location = location;
    }

    public HuffNode(String name, HuffNode leftChild, HuffNode rightChild, String location) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.value = leftChild.value + rightChild.value;
        this.location = location;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public String getNameValue() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        HuffNode n = (HuffNode) o;
        int returnvalue;
        if (n.getValue() > this.getValue()) {
            returnvalue = 1;
        } else if (n.getValue() == this.getValue()) {
            returnvalue = 0;
        } else {
            returnvalue = -1;
        }
        return returnvalue;
    }

    @Override
    public String toString() {
        return this.name.toString();
    }

    public Boolean hasLeftChild() {
        if (this.leftChild != null) {
            return true;
        }
        return false;
    }

    public Boolean hasRightChild() {
        if (this.rightChild != null) {
            return true;
        }
        return false;
    }

    public HuffNode getLeftChild() {
        return this.leftChild;
    }

    public HuffNode getRightChild() {
        return this.rightChild;
    }

    public void printTree(String location) {
        if (this.hasLeftChild()) {
            this.leftChild.location += location + "0";
            this.leftChild.printTree(location + "0");
        }
        if (this.hasRightChild()) {
            this.rightChild.location += location + "1";
            this.rightChild.printTree(location + "1");
        } else {
            System.out.println("Node:" + this.name + "\nValue:" + this.value + "\nSource:" + this.location + "\n------------");
        }
    }

}
