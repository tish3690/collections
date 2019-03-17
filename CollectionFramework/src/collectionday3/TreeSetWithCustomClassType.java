package collectionday3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithCustomClassType {

  public static void main(String[] args) {    
    
    /*
     * Task :   
     * Create a TreeSet of Students 
     * Add 5 students (you can copy previous ones)
     * Print out and see what you get 
     * Create a TreeSet of Students 
     *  by passing Comparator that 
     *    sort by ID asc and name desc
     *  then print out the tree Set 
     * 
     * */
    //Comparator<Student> idCom = Comparator.comparing(w->w.getId());
    
    Comparator<Student> idCom = new IdComparator();
    Comparator<Student> nameCom = new ReversedNameComparator();
    Comparator<Student> bothCom = idCom.thenComparing(nameCom);    
    TreeSet<Student> sTree = new TreeSet<>(bothCom);
    sTree.add(new Student(22, "Adam"));
    sTree.add(new Student(62, "Dave"));
    sTree.add(new Student(62, "Cave"));
    sTree.add(new Student(62, "Rave"));
    sTree.add(new Student(30, "Dave"));
    sTree.add(new Student(32, "Zain"));
    sTree.add(new Student(42, "Bob"));
    
    System.out.println(sTree);


  }

}
