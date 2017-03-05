/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg2_x_linked_list;
import java.util.*;
/**
 *
 * @author Koichiro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = generateArray(8,12);
        System.out.println("\nPrinting Array");
        printArray(a);
        Node list = makeList_r2(a);
        System.out.println("\nPrinting LinkedList");
        printLinkedList(list);
        System.out.println("\nPrinting LinkedList Using Class method");
        list.printData();
        System.out.println("\nPrinting Reverse LinkedList Using Class method");
        list.printReverse(list);
        int kth = 4;
        System.out.println("\nPrinting "+ kth + "th" +" to last element");
        list.kthToLast_2_2(kth, list);
        System.out.println("\n2_1 Remove Dups");
        //list.removeDups_2_1();        
        list.removeDups_2_1_noBuffer();
        list.printData(); 
        System.out.println("\n");      
    }
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
    }
    
    public static int[] generateArray(int range, int arraylen ){
        int[] array = new int[arraylen];
        Random rnd = new Random();
        for (int i = 0; i < arraylen; i++){
            array[i] = rnd.nextInt(range);
        }
        return array;
    }
    
    public static Node makeList(int[] array){
        if(array.length ==0){
            return null;
        } else {    
            Node previous = new Node(array[array.length-1], null);
            Node head = null;
            for(int i = 1; i < array.length ; i++){
                head = new Node(array[array.length-1-i],previous);
                previous = head;
            }
            return head;
        }
    }
    public static Node makeList_r2(int[] array){
        if(array.length ==0){
            return null;
        } else {    
            Node head = new Node(array[0],null);
            Node curr = head;
            for(int i = 1; i < array.length ; i++){
                curr.next = new Node(array[i],null);
                curr = curr.next;
            }
            return head;
        }
    }
    public static void printLinkedList(Node node){
        while(node != null){
            System.out.printf("%d ", node.data);
            node = node.next;
        }
    }
}
