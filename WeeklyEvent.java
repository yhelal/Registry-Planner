package com.company;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class WeeklyEvent extends AbstractEvent {
    private Date limitDate;
    private Calendar c = Calendar.getInstance();
    private Calendar c2 = Calendar.getInstance();

    public WeeklyEvent(String d, Date s, Date e, Date limit)
    {
        super(d,s,e);
        this.limitDate=limit;
        c.setTime(super.getStart());

    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
        c2.setTime(limitDate);
    }
    public Date getLimitDate()
    {
        return limitDate;
    }

    @Override
    public Date nextOccurrence()
    {

        Date next;
        if(c.getTime()==super.getStart()) {
            next = super.getStart();
            return next;
        }
        else if (c.before(c2))
        {
            c.add(Calendar.DAY_OF_MONTH,7);
            next = c.getTime()
            return next;
        }

    }
    @Override
    public boolean hasMoreOccurrences()
    {
        Calendar c3 = Calendar.getInstance();
        c3.setTime(this.nextOccurence());
        c.add(Calendar.DAY_OF_MONTH,-7);
        if(c3.before(c2))
            return true;
        else return false;


    }
    @Override
    public void init()
    {
        c.setTime(super.getStart());

    }
    @Override
    public String toString()
    {
        return String.format("WeeklyEvent: Description (%s), the start date is %s and the end date is %s%n",super.getDescription(),super.getStart.toString(),super.getEnd.toString());
    }

}
