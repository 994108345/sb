package command;

/**
 * Created by 99410 on 2018/10/22.
 */
public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    void invoke(){
        command.command();
    }
}
