package com.company;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Notifications implements PropertyChangeListener {

    public Notifications(Planner p)
    {
        p.addChangeListener(this);
    }

    @Override
    public void propertyChange (PropertyChangeEvent event){
        System.out.println("Change: " + event.getPropertyName() + " Old final event was: "
                + event.getOldValue() + " new final event is: " + event.getNewValue());
    }
    }




}
