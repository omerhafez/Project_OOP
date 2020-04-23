package project_oop_task1;
public interface PinObservee {
    
    public void AddObserver(PinObserver o);
    public void DeleteObserver(PinObserver o);
    public void Notify();
    
}
