package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FeederSubsystem extends SubsystemBase {
    
    private final TalonSRX leftFeederMotor = new TalonSRX(6);
    private final TalonSRX rightFeederMotor = new TalonSRX(7);

    public FeederSubsystem(){}
}
