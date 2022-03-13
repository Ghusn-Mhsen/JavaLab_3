package Main;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*--------------------- //// LAB 2 //// ----------------------------*/
        Fib_sequence x = new Fib_sequence(10);
        System.out.print("even number:\n");
         x.Accept_filter(new even_number_filter());
         x.print_List();
        x.Accept_filter(new even_number_filter());
        System.out.println();
        System.out.print(" sum of even number:\n");
        int m = (int) x.AcceptAggregator(new sum_aggregator());
        System.out.println(m);
        System.out.print(" Square of even number:\n");
        x.Square_number();

        text_sequence text = new text_sequence("java");
        System.out.println("the word:");
        text.print_List();
        System.out.println("convert the word to numbers:");
        text.replace_word();
        /*--------------------- //// LAB 3 //// ----------------------------*/
        System.out.println("Print list using Iteratorr:");
        sequence.sequence_itterator MyIterator = x.GetIterator();
        x.Itterator_Print(MyIterator);
        System.out.println("count how many value repeat in list using Iteratorr:");
        System.out.println("the value repeat : " + x.Itterator_count_value(MyIterator, 1) + " times");


    }
}
/*---------------------                 //// LAB 3- Question_2  ////                  ----------------------------*/
/*
- Both Iterator and Iterable  are Interface in java Which looks very Similar,But both are two different things:       *
***********************************************************************************************************************
- Any Class that Implements the ( Iterable )  interface needs to Override ( Iterator() ) method provided By the       *
- Iterable Interface the Iterator() method  returns an ( Iterator ) Which then can be used to iterator over an Object *
- of that class                                                                                                       *
-  in Iterable we can't modify Element                                                                                *
 **********************************************************************************************************************
- Any Class that Implements the ( Iterator )  interface needs to Override ( hasNext() and Next() ) method provided By *
- the Iterator Interface the hasNext() method  returns true if the iteration has more Element,the Next() method       *
- returns the next Element in Iteration                                                                               *
- the contract for Iterator is that it should produce new instance of an Iterator every Time                          *
-  in Iterator we can modify Element use ( remove() ) method                                                          *
***********************************************************************************************************************
*/
/*---------------------             //// LAB 3- Question_3  ////                ----------------------------*/
/*
*************************************   advantage of inner class ******************************************************
- it helps in code optimization                                         ************************************************
- it requires code to write                                             ************************************************
- more readable and maintainable                                        ************************************************
- it can access all the members of outer class including private member ************************************************
- logically group  classes and interface in one place only              ************************************************
************************************************************************************************************************
************************************************************************************************************************
************************************************************************************************************************
*************************************   Disadvantage of inner class ****************************************************
************************************************************************************************************************
- inner class difficult to understand for  Beginners *******************************************************************
- increase the total number of classes in your code  *******************************************************************
************************************************************************************************************************
****************************************** Static inner class **********************************************************
************************************************************************************************************************
- is nested class which is a Static member of the Outer class , it can be accessed Without instance the outer class    *
- using other static member.                                                                                           *
- Static inner class not have access to the instance variable and methods of the outer class.                          *
************************************************************************************************************************
* * */
/*---------------------             //// LAB 3- Question_4  ////                ----------------------------*/
/*
- we can modify aggregator class using inner class, we can define method in inner class which calculate sum of Element
- and deal with this method in outer class
this modify make code more protection and more readable and future modification.
* */

