package com.sd.sort.v2;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

/*
 * date 입력방법 찾아서 따라했는데 오류는 안뜨나 비교실행이 안됌
 * 리버스는 어떻게 하는지 방법을 모름
 */
public class SorterMainV2 {
    public static void main(String[] args) {
        String[] food_array1={"hotdog", "pizza", "hamburger", "chicken", "cake"};
        Comparator stringComp=new StringComparator();
        Sorter.sort(food_array1, stringComp);
        
        for(int i=0; i<food_array1.length; i++)
            System.out.println("food_array1["+i+"]="+food_array1[i]);
        
        Date d_1=new Date(1995,11,06);
        Date d_2=new Date(1999,03,04);
        Date [] date_array={d_1,d_2};
        Comparator dateComp=new DateComparator();
        Sorter.sort(date_array, dateComp);
        
        for(int i=0; i<date_array.length; i++)
            System.out.println("DateArray["+i+"]="+date_array[i]);

        WeightTurtle wt30 = new WeightTurtle(30);
        WeightTurtle wt10 = new WeightTurtle(10);
        WeightTurtle wt20 = new WeightTurtle(20);
        WeightTurtle[] wts={wt30, wt10, wt20};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wts, turtleComp);

        for(int i=0; i<wts.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+wts[i].getWeight());
        
        String[] food_array2 = {"hotdog", "pizza", "hamburger", "chicken", "cake"};
        Comparator rvsComp=new ReverseComparator(stringComp);
        Sorter.sort(food_array2, rvsComp);
        
        for(int i=0; i<food_array2.length; i++)
            System.out.println("food_array2["+i+"]="+food_array2[i]);
        
        
    }
}

class Sorter {
  public Sorter() {}
    public static void sort(Object[] data, Comparator comp) {
        for(int i=data.length-1; i>=1; i--) {
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(comp.compare(data[j], data[indexOfMax]) > 0)
                    indexOfMax=j;
                }
                Object temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
    }
}

class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        return s1.compareTo(s2);
    }
}

interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}

class DateComparator implements Comparator {
    public DateComparator() {}
    public int compare(Object o1, Object o2) {
      return ((Date) o1).compareTo((Date) o2);
    }
}

class ReverseComparator implements Comparator {
    private final Comparator c;
    public ReverseComparator(Comparator c) {this.c = c; }
    public int compare(Object o1, Object o2) {
        return c.compare(o2, o1);
    }
}

class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
    }
}