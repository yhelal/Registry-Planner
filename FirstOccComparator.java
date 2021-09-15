package com.company;
import java.util.Comparator;
import java.util.Date;
import java.util.Calendar;
public class FirstOccComparator implements Comparator<AbstractEvent>{

    @Override
    public int compare (AbstractEvent x, AbstractEvent y)
    {
        return(x.getStart().compareTo(y.getStart()));
    }


}
