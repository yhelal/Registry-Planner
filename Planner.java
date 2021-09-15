package com.company;
import java.util.ArrayList;
import java.util.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Planner {
    private int maxsize;
    private ArrayList<AbstractEvent> planner;
    private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
    public Planner(int maxsize)
    {
        this.maxsize=maxsize;
        planner = new ArrayList<AbstractEvent>(maxsize);
    }
    public int size()
    {
        return planner.size();
    }

    boolean addEvent(AbstractEvent x)
    {
        if(planner.size()<maxsize)
        {
            notifyListeners(x,"Add new event",planner.get(size-1).toString(),x.toString());
            planner.add(x);

            return true;
        }
        else return false;
    }
    public AbstractEvent eventAt(int pos)
    {
        if(pos<size)
            return planner.get(pos);
        else throw new IllegalArgumentException("Position is out of bounds");
    }

    public AbstractEvent remove(int pos)
    {
        planner.remove(pos);

    }

    public void display (Date date)
    {
        for(int i=0;i<planner.size();i++)
        {
            if(planner.get(i).nextOccurrence()==date)
                planner.get(i).toString();

        }
    }

    public void sort(Comparator <AbstractEvent> c)
    {
        Collections.sort(planner,Comparator<AbstractEvent>);

    }

    private void notifyListeners(Object object, String property, String oldValue, String newValue) {
        for (PropertyChangeListener name : listener) {
            name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener) {
        listener.add(newListener);
    }

}
