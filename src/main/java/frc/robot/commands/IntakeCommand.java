// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.ArmSubsystem;

public class IntakeCommand extends CommandBase {
  
  private ArmSubsystem armSubsystem;
  private double intakeSpeed;
  

  public IntakeCommand(ArmSubsystem armSubsystem, double intakeSpeed) {
    this.armSubsystem = armSubsystem;
    this.intakeSpeed = intakeSpeed;
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    armSubsystem.setIntakeSpeed(intakeSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    armSubsystem.setIntakeSpeed(0);
  }

}
