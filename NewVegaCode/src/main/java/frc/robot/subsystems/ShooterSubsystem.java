package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {

    private final TalonSRX leftShooterMotor = new TalonSRX(8);
    private final TalonSRX rightShooterMotor = new TalonSRX(9);

    public ShooterSubsystem(){}

}
