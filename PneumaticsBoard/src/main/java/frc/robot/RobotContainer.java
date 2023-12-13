// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.PneumaticsJoystickCMD;
import frc.robot.subsystems.PneumaticsSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final PneumaticsSubsystem m_pneumaticsSubsystem = new PneumaticsSubsystem();

  private final CommandPS4Controller stick = new CommandPS4Controller(0);

  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();

    m_pneumaticsSubsystem.setDefaultCommand(new PneumaticsJoystickCMD(m_pneumaticsSubsystem));
  }

  private void configureBindings() {

    stick.cross().onTrue(new InstantCommand(() -> m_pneumaticsSubsystem.toggleSmallSolenoid()));
    stick.square().onTrue(new InstantCommand(() -> m_pneumaticsSubsystem.toggleBigSolenoid()));

  }

  public Command getAutonomousCommand() {
    return null;
  }
}
