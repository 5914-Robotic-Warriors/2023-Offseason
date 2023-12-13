// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {

  PneumaticHub pHub = new PneumaticHub();

  Compressor comp = new Compressor(PneumaticsModuleType.REVPH);

  DoubleSolenoid sol1 = new DoubleSolenoid(PneumaticsModuleType.REVPH, 0, 1);
  DoubleSolenoid sol2 = new DoubleSolenoid(PneumaticsModuleType.REVPH, 2, 3);

  /** Creates a new ExampleSubsystem. */
  public PneumaticsSubsystem() {
    sol1.set(Value.kReverse);
    sol2.set(Value.kReverse);
    comp.enableAnalog(110, 120);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  // Toggle pneumatics
  public void toggleSmallSolenoid() {
    sol1.toggle();
  }

  // Toggle pneumatics
  public void toggleBigSolenoid() {
    sol2.toggle();
}

//Disable compressor
public void disableCompressor(){
  comp.disable();
}
}
