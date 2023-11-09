package tello.drone.model.command;

public class SimpleTelloCommand extends AbstractTelloCommand {

  public SimpleTelloCommand(String command) {
    super(command);
  }

  @Override
  public String composeCommand() {
    return null;
  }
}
