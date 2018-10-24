package command;

/**
 * Created by 99410 on 2018/10/22.
 */
public  class RealCommand implements Command{
    Receiver receiver;

    public RealCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void command() {
        receiver.receiver();
    }
}
