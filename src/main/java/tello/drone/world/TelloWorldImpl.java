package tello.drone.world;

import tello.drone.communication.TelloCommunication;
import tello.drone.communication.TelloCommunicationImpl;
import tello.drone.model.TelloConnection;
import tello.drone.model.TelloDrone;
import tello.drone.model.TelloDroneImpl;
import tello.drone.model.TelloFlip;
import tello.drone.model.command.BasicTelloCommand;
import tello.drone.model.command.TelloCommand;
import tello.drone.model.command.TelloCommandValues;
import java.util.logging.Logger;

public class TelloWorldImpl implements TelloWorld {

  private static final Logger logger = Logger.getLogger(TelloWorldImpl.class.getName());


  private TelloDrone telloDrone;

  private TelloCommunication telloCommunication;

  public TelloWorldImpl() {
    telloDrone = new TelloDroneImpl();
    telloCommunication = new TelloCommunicationImpl();
  }

  @Override
  public void connect() {
    boolean connectionSuccessful = telloCommunication.connect();
    if (connectionSuccessful) {
      telloDrone.setTelloConnection(TelloConnection.CONNECTED);
      logger.info("Connected!");
    }
  }

  @Override
  public void disconnect() {

  }

  @Override
  public void enterCommandMode() {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.COMMAND_MODE);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful) {
      logger.info("Entering command mode successful");
    }
  }


  @Override
  public void takeOff() {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.TAKE_OFF);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful) {
      logger.info("Taking off command was executed successfully");
    }
  }

  @Override
  public void land() {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.LAND);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful) {
      logger.info("Landing command was executed successfully");
    }
  }

  @Override
  public void doFlip(TelloFlip telloFlip) {

  }

  @Override
  public void setSpeed(Integer speed) {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.SPEED + " " + speed);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful){
      logger.info("Speed command was executed successfully");
    }
  }

  @Override
  public void forward(Integer distance) {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.FORWARD + " " + distance);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful){
      logger.info("Forward command was executed successfully");
    }
  }

  @Override
  public void backward(Integer distance) {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.BACK + " " + distance);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful){
      logger.info("Backward command was executed successfully");
    }
  }

  @Override
  public void right(Integer distance) {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.RIGHT + " " + distance);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful){
      logger.info("Right command was executed successfully");
    }
  }

  @Override
  public void left(Integer distance) {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.LEFT + " " + distance);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful){
      logger.info("Left command was executed successfully");
    }
  }

  @Override
  public void rotateRight(Integer angle) {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.CW + " " + angle);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful) {
      logger.info("Rotate right command was executed successfully");
    }
  }

  @Override
  public void rotateLeft(Integer angle) {
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.CCW + " " + angle);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful) {
      logger.info("Rotate left command was executed successfully");
    }
  }

  @Override
  public void getBattery(){
    TelloCommand command = new BasicTelloCommand(TelloCommandValues.CURRENT_BATTERY);
    boolean executionSuccessful = telloCommunication.executeCommand(command);
    if (executionSuccessful) {
      logger.info("Output battery command was executed successfully");
    }
  }

}
