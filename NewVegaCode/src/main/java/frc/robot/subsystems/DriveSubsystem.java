package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

    private final CANSparkMax frontLeftDriveMotor = new CANSparkMax(1, MotorType.kBrushless);
    private final CANSparkMax frontRightDriveMotor = new CANSparkMax(2, MotorType.kBrushless);
    private final CANSparkMax backLeftDriveMotor = new CANSparkMax(3, MotorType.kBrushless);
    private final CANSparkMax backRightDriveMotor = new CANSparkMax(4, MotorType.kBrushless);

    public DriveSubsystem() {
    }

}
