package design_pattern.behavioural.command;

import java.util.Random;

public abstract class AbstractCommand implements Command{

    Receiver_TextFile textFile;

    public AbstractCommand(Receiver_TextFile textFile){
        this.textFile = textFile;
    }

    public abstract void execute();

    public abstract void  undo();

    @Override
    public boolean redo() {
        return new Random().nextBoolean();
    }

}
