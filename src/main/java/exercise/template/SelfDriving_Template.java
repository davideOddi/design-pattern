package exercise.template;

public abstract class SelfDriving_Template {

    private final void drive(){
        start();
        steer();
        acceleration();
        breaking();
        stop();
    }

    abstract void steer();
    abstract void acceleration();
    abstract void breaking();

    private void start(){
        System.out.println("Engine is ON");
    }

    private void stop(){
        System.out.println("Engine is off");
    }

}
