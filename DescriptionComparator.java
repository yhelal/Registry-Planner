package com.company;

import java.util.Comparator;

public class DescriptionComparator implements Comparator<AbstractEvent> {

    @Override
    public int compare (AbstractEvent x, AbstractEvent y)
    {

      return(x.getDescription().compareTo(y.getDescription()));

    }
}
