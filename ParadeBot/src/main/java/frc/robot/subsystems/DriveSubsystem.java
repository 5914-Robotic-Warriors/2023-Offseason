// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

  private final Spark driveLeftMotor = new Spark(0);
  private final Spark driveRightMotor = new Spark(1);
  private final Encoder leftEncoder = new Encoder(0, 1);
  private final Encoder rightEncoder = new Encoder(2, 3);
  private final double kEncoderTick2Meter = 1.0 / 4096.0 * 999.999 * Math.PI; // Encoder tick to meter ratio

  public double getEncoderMeters() {
    return (leftEncoder.get() + -rightEncoder.get()) / 2 * kEncoderTick2Meter;
  }

  public DriveSubsystem() {
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Drive encoder value", getEncoderMeters());
  }

  public void setMotors(double LeftSpeed, double RightSpeed){
      driveLeftMotor.set(LeftSpeed);
      driveRightMotor.set(-RightSpeed);
  }
}
