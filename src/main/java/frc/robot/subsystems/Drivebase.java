// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivebase extends SubsystemBase {
  /** Creates a new Drivebase. */
  public TalonFX frontRT = new TalonFX(Constants.frontRT);
  public TalonFX frontLT = new TalonFX(Constants.frontLT);
  //public TalonFX rearRT = new TalonFX(Constants.rearRT);
  //public TalonFX rearLT = new TalonFX(Constants.rearLT);

  public DifferentialDrive myDiffDrive = new DifferentialDrive(frontLT,frontRT);
  
  public Drivebase() {}
    

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
