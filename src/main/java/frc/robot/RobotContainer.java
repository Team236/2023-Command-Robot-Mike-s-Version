// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
/** 
import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
*/
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants.ControllerConstants;
import frc.robot.commands.Drive_With_Joysticks;
import frc.robot.commands.IntakeExtend;
import frc.robot.commands.IntakeFeed;
import frc.robot.commands.IntakeRetract;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Intake;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...y76;

   // **JOYSTICKS**
   Joystick controller = new Joystick(Constants.USB_CONTROLLER);
   Joystick leftStick = new Joystick(Constants.USB_LEFT_STICK);
   Joystick rightStick = new Joystick(Constants.USB_RIGHT_STICK);
  // **SUBSYTEMS **
  private final Drive drive = new Drive();
  private final Intake intake = new Intake();


  //**COMMANDS */
  private final Drive_With_Joysticks driveWithJoysticks = new Drive_With_Joysticks(drive, leftStick, rightStick);
  private final IntakeFeed intakeFeed = new IntakeFeed(intake);
  private final IntakeRetract intakeRetract = new IntakeRetract(intake);
  private final IntakeExtend intakeExtend = new IntakeExtend(intake);



  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    drive.setDefaultCommand(driveWithJoysticks);

    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
   /* new Trigger(m_exampleSubsystem::exampleCondition)
        .onTrue(new ExampleCommand(m_exampleSubsystem));
/* */
    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    
 //CREATE BUTTON INSTANCES
    //IntakeFeed will be mapped here
    JoystickButton leftTrigger = new JoystickButton(leftStick, ControllerConstants.Thrustmaster.TRIGGER);
    //IntakeExtend will be mapped here
    JoystickButton leftStickLeft = new JoystickButton(leftStick, ControllerConstants.Thrustmaster.BUTTON_LEFT);
    //IntakeRetract will be mapped here
    JoystickButton rightStickRight = new JoystickButton(rightStick, ControllerConstants.Thrustmaster.BUTTON_RIGHT);

    //ASSIGN BUTTONS TO COMMANDS
   // leftTrigger.whileTrue(intakeFeed);
   leftStickLeft.onTrue(intakeExtend);
   //rightStickRight.onTrue(intakeRetract);
   rightStickRight.whileTrue(intakeFeed);
   

  }


}
