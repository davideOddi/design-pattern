package design_pattern.behavioural.command;

import java.util.List;
import java.util.Stack;

public class CommandMain {

    public static void main(String[] args) {

        Receiver_TextFile newFile = new Receiver_TextFile("MyFile");
        Receiver_TextFile newFile2 = new Receiver_TextFile("MyFile2");

        Stack<Command> commands = new Stack();

        commands.push(new ConcreteCommand_OPEN(newFile));
        commands.push(new ConcreteCommand_OPEN(newFile));
        commands.push(new ConcreteCommand_OPEN(newFile2));
        commands.push(new ConcreteCommand_DELETE(newFile2));
        commands.push(new ConcreteCommand_DELETE(newFile));
        commands.push(new ConcreteCommand_SAVE(newFile2));
        commands.push(new ConcreteCommand_SAVE(newFile));
        commands.push(new ConcreteCommand_SAVE(newFile));


        Invoker_FileOperations invoker = new Invoker_FileOperations(commands);
        System.out.println("All Operations " + invoker.getOperations().size());
        invoker.executeOperations();
        System.out.println("Redo Operations " + invoker.getOperations().size());


    }



}
