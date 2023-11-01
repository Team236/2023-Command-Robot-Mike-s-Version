// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class Drive_With_Joysticks extends CommandBase {
  /** Creates a new Drive_With_Joysticks. */
  private Drive drive;
  private Joystick leftstick, rightstick;
  public Drive_With_Joysticks(Drive drive, Joystick leftstick, Joystick rightstick) {
    this.drive = drive;
    this.leftstick = leftstick;
    this.rightstick = rightstick;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
          // Sets each side of robots speeds to correspond to joystick Y-axis
          drive.setLeftSpeed(-leftstick.getY());
          drive.setRightSpeed(-rightstick.getY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drive.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
