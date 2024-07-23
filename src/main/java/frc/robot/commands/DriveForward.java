// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivebase;

public class DriveForward extends Command {
  /** Creates a new DriveForward. */
  public final Drivebase m_Subsystem;
  public DriveForward(Drivebase Bubba) {
    m_Subsystem = Bubba;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Bubba);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Subsystem.FrontLeft.set(1.0);
    m_Subsystem.FrontRight.set(1.0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
