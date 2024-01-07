// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */

  private CANSparkMax intakeMotor;
  private DoubleSolenoid intakeSolenoid;

  public Intake() {
    intakeMotor = new CANSparkMax(Constants.ID_INTAKE, MotorType.kBrushless);
    intakeMotor.setInverted(true);
    intakeSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.INTAKE_SOL_FOR, Constants.INTAKE_SOL_REV);
  }

  public void setIntakeSpeed(double speed) {
    intakeMotor.set(speed);

  }

  public void stopIntake() {
    intakeMotor.set(0);
  }

  public void extend() {
    intakeSolenoid.set(Value.kForward);
  }

  public void retract() {
    intakeSolenoid.set(Value.kReverse);
  }

  public boolean isExtended() {
   if (intakeSolenoid.get() == Value.kForward) {
    return true;
   } else {
    return false;
   }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
