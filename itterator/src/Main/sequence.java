package Main;

import java.util.ArrayList;

public abstract class sequence implements iaggregatable,ifilterable,itterator,Literable {
    public ArrayList<Object>List;
    protected Object start_element;
    protected Object end_element;

     public abstract class sequence_itterator  {
         private int index = 0;
         public boolean HasNext(){
             return this.index<List.size();
         }
         public Object GetNext(){
             return List.get(this.index++);
         }

     }
    public abstract sequence_itterator GetIterator() ;


    public  ArrayList<Object> Generate_list ()
    {
       this.List=new ArrayList<Object>();

       return List;
    }
    public abstract ArrayList<Object> Accept_filter (filter filterobject);
    public abstract Object Accept_aggregator (aggregator aggregatorobject);



}
