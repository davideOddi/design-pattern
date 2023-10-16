package design_pattern.behavioural.command;

public interface Command {

    public void execute();

    public void undo();

    public boolean redo();

}
