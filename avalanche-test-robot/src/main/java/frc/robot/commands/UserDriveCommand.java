package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class UserDriveCommand extends Command {
    public UserDriveCommand() {
        requires(Robot.drivetrainSubsystem);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.drivetrainSubsystem.tankDrive(-Robot.m_oi.leftJoystick.getY(),
            -Robot.m_oi.rightJoystick.getY());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {

    }
}
