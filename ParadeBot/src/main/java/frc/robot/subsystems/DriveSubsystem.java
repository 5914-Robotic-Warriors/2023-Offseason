// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

  private final CANSparkMax left1 = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax left2 = new CANSparkMax(4, MotorType.kBrushless);
  private final CANSparkMax right1 = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax right2 = new CANSparkMax(2, MotorType.kBrushless);

  public DriveSubsystem() {
    right1.setInverted(true);
    right2.setInverted(true);
  }

  @Override
  public void periodic() {}

  public void setMotors(double LeftSpeed, double RightSpeed){
      left1.set(LeftSpeed);
      left2.set(LeftSpeed);
      right1.set(RightSpeed);
      right2.set(RightSpeed);
  }
}
