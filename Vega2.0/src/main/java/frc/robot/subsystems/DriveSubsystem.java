// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

  private final CANSparkMax frontLeftDrivemotor = new CANSparkMax(4, MotorType.kBrushless);
  private final CANSparkMax frontRightDrivemotor = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax backLeftDrivemotor = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax backRightDrivemotor = new CANSparkMax(1, MotorType.kBrushless);

  private final MecanumDrive m_robotDrive = new MecanumDrive(frontLeftDrivemotor, backLeftDrivemotor,
      frontRightDrivemotor, backRightDrivemotor);

  /** Creates a new ExampleSubsystem. */
  public DriveSubsystem() {
    frontRightDrivemotor.setInverted(true);
    backRightDrivemotor.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double xSpeed, double ySpeed, double zRotation) {
    m_robotDrive.driveCartesian(xSpeed, ySpeed, zRotation);
  }
}
