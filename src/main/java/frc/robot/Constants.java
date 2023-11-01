// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final int USB_LEFT_STICK = 0;
  public static final int USB_RIGHT_STICK = 1;
  public static final int USB_CONTROLLER = 2;

    // Stores motor controller ID numbers
    public static final int ID_LEFT_FRONT = 35;
    public static final int ID_LEFT_REAR = 34;
    public static final int ID_RIGHT_FRONT = 1;
    public static final int ID_RIGHT_REAR = 32;

    //intake motors and solenoid
    public static final int ID_INTAKE = 4;
    public static final int INTAKE_SOL_FOR = 0;
    public static final int INTAKE_SOL_REV = 1;
    public static final double FORWARD_SPEED = 0.85;
    public static final double REVERSE_SPEED = -0.5;

    public static class ControllerConstants {
    
        public static class Thrustmaster {
            public static final int TRIGGER = 1;
            public static final int BUTTON_MIDDLE = 2;
            public static final int BUTTON_LEFT = 3;
            public static final int BUTTON_RIGHT = 4;
            public static final int LEFT_BASE_1 = 11;
            public static final int LEFT_BASE_2 = 16;
            public static final int LEFT_BASE_3 = 13;
            public static final int LEFT_BASE_4 = 14;
            public static final int RIGHT_BASE_5 = 7;
            public static final int RIGHT_BASE_6 = 8;
            public static final int RIGHT_BASE_7 = 5;
            public static final int RIGHT_BASE_8 = 10;

            public static class AxesThrustmaster {
                public static final int X = 0;
                public static final int Y = 1;
                public static final int Z = 2;
                public static final int THROTTLE = 3;
            } 
        }
    }  
}
