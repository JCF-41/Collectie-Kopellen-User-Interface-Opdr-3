/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.PriorityQueue;

/**
 *
 * @author Loek
 */
public class List_Setup {

    private Collection<Character> karakters;
    private Map<Character, Integer> karakterCount = null;
    private PriorityQueue<HuffNode> Queue = null;
    private static final String DEFAULT_TEXT = "Banaan";

    public List_Setup() {
        karakterCount = createkarakterCount();
        Queue = createHuffNodeList();
        Queue = createHuffNodeTree();
        Queue.poll().printTree("");
    }

    public Map<Character, Integer> createkarakterCount() {
        karakterCount = new TreeMap<>();
        karakters = new ArrayList<>();
        for (char c : DEFAULT_TEXT.toCharArray()) {
            karakters.add(c);
            if (karakterCount.containsKey(c)) {
                int value = karakterCount.get(c);
                value++;
                karakterCount.put(c, value);
            } else {
                karakterCount.put(c, 1);
            }
        }
        return karakterCount;
    }


    public PriorityQueue<HuffNode> createHuffNodeList() {
    Queue = new PriorityQueue<>(karakters.size(),Collections.reverseOrder());
        for (Map.Entry<Character, Integer> karakter : karakterCount.entrySet()) {
            HuffNode hf = new HuffNode(Character.toString(karakter.getKey()), karakter.getValue(),"0");
            System.out.println(karakter.getKey());
            Queue.add(hf);
        }
        return Queue;
    }
    
    public PriorityQueue<HuffNode> createHuffNodeTree(){
        while(Queue.size() > 1){
            HuffNode high =  Queue.poll();
            HuffNode low =  Queue.poll();
            String highname = high.getNameValue();
            String lowname = low.getNameValue();
            HuffNode newHuffNode = new HuffNode(highname + lowname,high,low,"0");
            Queue.add(newHuffNode);
        }     
        return Queue;
    }  
}
