package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CandyShootSubsystem;

public class CandyShootCmd extends CommandBase {
    private final CandyShootSubsystem candyShootSubsystem;
    private final double speed;

    public CandyShootCmd(CandyShootSubsystem candyShootSubsystem, double speed){
        this.candyShootSubsystem = candyShootSubsystem;
        this.speed = speed;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        candyShootSubsystem.setCandyMotor(speed);
    }

    @Override
    public void end(boolean interrupted){
        candyShootSubsystem.setCandyMotor(0);
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
