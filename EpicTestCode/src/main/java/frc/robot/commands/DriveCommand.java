package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase {
    private final DriveSubsystem driveSubsystem;
    private final Supplier<Double> setdriveMotor, setturnMotor;

    public DriveCommand(DriveSubsystem driveSubsystem, Supplier<Double> setdriveMotor, Supplier<Double> setTurnMotor) {
        addRequirements(driveSubsystem);
        this.driveSubsystem = driveSubsystem;
        this.setdriveMotor = setdriveMotor;
        this.setturnMotor = setTurnMotor;
    }
}
