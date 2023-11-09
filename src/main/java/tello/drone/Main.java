package tello.drone;

import static java.lang.Thread.sleep;

import tello.drone.world.TelloWorld;
import tello.drone.world.TelloWorldImpl;

public class Main {

  public static void main(String[] args) {
    TelloWorld telloWorld = new TelloWorldImpl();

    telloWorld.connect();
    telloWorld.getBattery();
    telloWorld.enterCommandMode();
    telloWorld.takeOff();

    telloWorld.setSpeed(50);
    telloWorld.forward(250);
    telloWorld.rotateRight(90);
    telloWorld.forward(400);

    // adding a new path to the tello

    telloWorld.setSpeed(50);
    telloWorld.forward(250);
    telloWorld.rotateRight(90);
    telloWorld.forward(400);

    telloWorld.land();
  }

}
