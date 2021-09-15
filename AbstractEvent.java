//Youssef Helal 900142332
package com.company;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public abstract class AbstractEvent {

   private String description;
   private Date start,end;

   public AbstractEvent(String d, Date s, Date e)
   {
       this.description=d;
       this.start=s;
       this.end=e;
   }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setStart(Date s){
        this.start=s;
}
    public void setEnd(Date e){
        this.end=e;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
    public abstract boolean hasMoreOccurrences();
    public abstract Date nextOccurrence();
    public abstract void init();
}
