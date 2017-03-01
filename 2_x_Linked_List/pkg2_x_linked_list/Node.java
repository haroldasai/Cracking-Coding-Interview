/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_x_linked_list;
import java.util.*;
/**
 *
 * @author Koichiro
 */
public class Node {
    int data;
    Node next;
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    void printData(){
        Node curr = null;
        curr = this;
        while(curr!=null){
            System.out.printf("%d ", curr.data);
            curr = curr.next;
        }
    }
    void removeDups_2_1(){
        Node curr = this;
        HashSet<Integer> hset = new HashSet<Integer>();
        Node previous = null;
        while(curr!=null){
            if(!hset.contains(curr.data)){
                hset.add(curr.data);
                previous = curr;
            } else {
                previous.next = curr.next;
            }
            curr = curr.next;
        }
    }
    void removeDups_2_1_noBuffer(){
        Node curr = this;
        Node runner = null;
        Node previous = null;
        while(curr != null){
            runner = curr.next;
            previous = curr;
            while(runner!=null){
                if(curr.data == runner.data){
                    previous.next = runner.next;
                } else {
                    previous = runner;
                }
                runner = runner.next;
            }
            curr = curr.next;
        }    
    }
    
    
}
