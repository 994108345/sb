package command;

/**
 * Created by 99410 on 2018/10/22.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new RealCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.invoke();
    }
}
