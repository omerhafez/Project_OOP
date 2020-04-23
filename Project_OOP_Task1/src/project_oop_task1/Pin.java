package project_oop_task1;

import java.util.ArrayList;
import java.util.List;

public class Pin implements PinObservee{
  private boolean value;
  private int width;
  private int height;
  private ArrayList<PinObserver> sub=new ArrayList<PinObserver>();
  
    @Override
    public void AddObserver(PinObserver o) {
    sub.add(o);
    }

    @Override
    public void DeleteObserver(PinObserver o) {
    sub.remove(o);
    }

    @Override
    public void Notify() {
  for(PinObserver po:sub)
  {
  po.Update();
  }

    }
}
