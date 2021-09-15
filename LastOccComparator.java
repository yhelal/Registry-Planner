package com.company;
import java.util.Comparator;
import java.util.Date;
import java.util.Calendar;
public class LastOccComparator implements Comparator<AbstractEvent> {
    @Override
    public int compare (AbstractEvent x, AbstractEvent y)
    {

        return (x.getEnd().compareTo(y.getEnd()));

    }

}
