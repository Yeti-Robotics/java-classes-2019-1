package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.UserDriveCommand;

public class DrivetrainSubsystem extends Subsystem {

    private TalonSRX leftTalon;
    private TalonSRX rightTalon;
    private VictorSPX left1Victor;
    private VictorSPX left2Victor;
    private VictorSPX right1Victor;
    private VictorSPX right2Victor;

    public DrivetrainSubsystem() {
        leftTalon = new TalonSRX(RobotMap.LEFT_DRIVE_TALON);
        rightTalon = new TalonSRX(RobotMap.RIGHT_DRIVE_TALON);
        left1Victor = new VictorSPX(RobotMap.LEFT_DRIVE_VICTOR_1);
        left2Victor = new VictorSPX(RobotMap.LEFT_DRIVE_VICTOR_2);
        right1Victor = new VictorSPX(RobotMap.RIGHT_DRIVE_VICTOR_1);
        right2Victor = new VictorSPX(RobotMap.RIGHT_DRIVE_VICTOR_2);
    }

    public void driveLeftSide(double power) {
        leftTalon.set(ControlMode.PercentOutput, power);
        left1Victor.set(ControlMode.PercentOutput, power);
        left2Victor.set(ControlMode.PercentOutput, power);
    }

    public void driveRightSide(double power) {
        rightTalon.set(ControlMode.PercentOutput, power);
        right1Victor.set(ControlMode.PercentOutput, power);
        right2Victor.set(ControlMode.PercentOutput, power);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new UserDriveCommand());
    }
}

