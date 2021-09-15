package com.company;
import java.util.Date;
import java.util.Calendar;


public class DailyEvent extends AbstractEvent {
    private int recurrence;
    private int count=0;
    private Calendar c = Calendar.getInstance();

    public DailyEvent(String d, Date s, Date e, int rec )
    {
        super(d,s,e);
        this.recurrence=rec;
        c.setTime(s);
    }

    public void setRecurrence(int recurrence) {
        this.recurrence = recurrence;
    }

    public int getRecurrence() {
        return recurrence;
    }

    @Override
    public Date nextOccurrence(){
        Date next;
        if(count == 0)
        {
            count++;
            next = super.getStart();
            return next;
        }
       else if (count<=recurrence)
        {
            c.add(Calendar.DAY_OF_MONTH,1);
            count++;
            next=c.getTime();
            return next;
        }



    }
    @Override
    public boolean hasMoreOccurrences()
    {

        if (this.nextOccurrence()!=null)
            return true;
        else return false;
    }
    @Override
    public void init()
    {
        count =0;
        c.setTime(super.getStart());
    }
    @Override
    public String toString()
    {
        return String.format("DailyEvent: Description (%s), the start date is %s and the end date is %s%n",super.getDescription(),super.getStart.toString(),super.getEnd.toString());
    }

}
