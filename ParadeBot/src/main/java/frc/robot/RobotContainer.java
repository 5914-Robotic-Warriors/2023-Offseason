// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // Subsystems
  private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();

  // Joystick
  private final PS4Controller stick = new PS4Controller(OperatorConstants.kDriverControllerPort);
  //private final Joystick stick = new Joystick(0);

  // Controller axes
  /*
   * private final int leftStickX = PS4Controller.Axis.kLeftX.value;
   * private final int leftStickY = PS4Controller.Axis.kLeftY.value;
   * private final int rightStickX = PS4Controller.Axis.kRightX.value;
   * private final int rightStickY = PS4Controller.Axis.kRightY.value;
   */

  // Controller buttons
  // private final JoystickButton square = new JoystickButton(stick,
  // PS4Controller.Button.kSquare.value);
  // private final JoystickButton cross = new JoystickButton(stick,
  // PS4Controller.Button.kCross.value);

  public RobotContainer() {
    m_driveSubsystem
        .setDefaultCommand(new ArcadeDriveCmd(m_driveSubsystem, () -> stick.getLeftY(), () -> stick.getLeftX()));

    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return null;
  }
}
