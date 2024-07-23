// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivebase extends SubsystemBase {
  /** Creates a new Drivebase. */
  public TalonFX FrontRight = new TalonFX (Constants.FR);
  public TalonFX FrontLeft = new TalonFX (Constants.FL);
  public TalonFX RearRight = new TalonFX (Constants.RR);
  public TalonFX RearLeft = new TalonFX (Constants.RL);
  public Drivebase() {
    RearLeft.setControl(new Follower(FrontLeft.getDeviceID(), false));
    RearRight.setControl(new Follower(FrontRight.getDeviceID(), false));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
