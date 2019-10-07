/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DriveForTimeCommand;
import frc.robot.commands.DrivePathCommandGroup;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Joystick leftJoystick;
    public Joystick rightJoystick;

    public OI() {
        leftJoystick = new Joystick(RobotMap.LEFT_JOYSTICK);
        rightJoystick = new Joystick(RobotMap.RIGHT_JOYSTICK);

        JoystickButton driveForwardButton = new JoystickButton(leftJoystick, 2);
        JoystickButton drivePathButton = new JoystickButton(rightJoystick, 2);

        driveForwardButton.whenPressed(new DriveForTimeCommand(0.4, 0.4, 3));
        drivePathButton.whenPressed(new DrivePathCommandGroup());
    }
}
