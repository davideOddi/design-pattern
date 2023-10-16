package design_pattern.behavioural.command;

public class ConcreteCommand_SAVE extends AbstractCommand{

    public ConcreteCommand_SAVE(Receiver_TextFile textFile) {
        super(textFile);
    }

    @Override
    public void execute() {
        this.textFile.save();
    }

    @Override
    public void undo() {
        System.out.println(" Not Saving " + this.textFile);
    }


}
