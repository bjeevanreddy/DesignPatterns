package StructuralDesignPattern.AdapterDesignPattern;

import StructuralDesignPattern.AdapterDesignPattern.FriendWhoHasOtherPen.MarkerPen;

public class PenAdapter implements Pen{


    // Creating the object of marker pen class and using its method mark for the write method.
    MarkerPen mp = new MarkerPen();
    @Override
    public void write(String str) {
        mp.mark(str);
    }
}
