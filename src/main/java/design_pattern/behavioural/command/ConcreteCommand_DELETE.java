package design_pattern.behavioural.command;

public class ConcreteCommand_DELETE extends AbstractCommand{

    public ConcreteCommand_DELETE(Receiver_TextFile textFile) {
        super(textFile);
    }

    @Override
    public void execute() {
        this.textFile.open();
    }

    @Override
    public void undo() {
        System.out.println("Closing " + this.textFile);
    }
}
