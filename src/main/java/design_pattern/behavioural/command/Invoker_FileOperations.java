package design_pattern.behavioural.command;

import java.util.List;
import java.util.Stack;

public class Invoker_FileOperations {

    public Stack<Command> getOperations() {
        return operations;
    }

    public void setOperations(Stack<Command> operations) {
        this.operations = operations;
    }

    private Stack<Command> operations;

    public Invoker_FileOperations(Stack<Command> operations) {
        this.operations = operations;
    }

    public void executeOperations(){
        Stack<Command> redos = new Stack<>();
        while (!operations.empty()){
            Command operation = operations.pop();
            operation.execute();
            if(operation.redo()){
                redos.push(operation);
            }
        }

        operations = redos;
    }
}
