// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.commands.CandyShootCmd;
import frc.robot.subsystems.CandyShootSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.PS4Controller.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // Subsystems
  private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  private final CandyShootSubsystem m_candyShootSubsystem = new CandyShootSubsystem();

  // Joystick
  private final PS4Controller stick = new PS4Controller(OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    m_driveSubsystem
        .setDefaultCommand(new ArcadeDriveCmd(m_driveSubsystem, () -> stick.getLeftY(), () -> stick.getLeftX()));

    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(stick, 1).whileTrue(new CandyShootCmd(m_candyShootSubsystem, 1));
    new JoystickButton(stick, 2).whileTrue(new CandyShootCmd(m_candyShootSubsystem, -1));
    new InstantCommand(() -> m_driveSubsystem.switchHeading(stick.getTouchpad()));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
