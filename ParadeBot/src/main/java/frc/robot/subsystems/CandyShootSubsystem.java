package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CandyShootSubsystem extends SubsystemBase {

    private final TalonSRX candyMotor = new TalonSRX(5);

    public CandyShootSubsystem() {
    }

    @Override
    public void periodic() {
    }

    public void setCandyMotor(double speed) {
        candyMotor.set(ControlMode.PercentOutput, speed);
    }
}
