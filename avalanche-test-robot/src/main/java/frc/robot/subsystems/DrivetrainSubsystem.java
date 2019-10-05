package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.UserDriveCommand;

public class DrivetrainSubsystem extends Subsystem {

    private Spark left1;
    private Spark left2;
    private Spark left3;
    private Spark right1;
    private Spark right2;
    private Spark right3;

    public DrivetrainSubsystem() {
        left1 = new Spark(RobotMap.LEFT_DRIVE_SPARK_1);
        left2 = new Spark(RobotMap.LEFT_DRIVE_SPARK_2);
        left3 = new Spark(RobotMap.LEFT_DRIVE_SPARK_3);
        right1 = new Spark(RobotMap.RIGHT_DRIVE_SPARK_1);
        right2 = new Spark(RobotMap.RIGHT_DRIVE_SPARK_2);
        right3 = new Spark(RobotMap.RIGHT_DRIVE_SPARK_3);
    }

    public void driveLeftSide(double power) {
        left1.set(power);
        left3.set(power);
        right1.set(power);
    }

    public void driveRightSide(double power) {
        left2.set(power);
        right2.set(power);
        right3.set(power);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new UserDriveCommand());
    }
}

