/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int LEFT_DRIVE_TALON = 3;
    public static final int RIGHT_DRIVE_TALON = 5;

    public static final int LEFT_DRIVE_VICTOR_1 = 0;
    public static final int LEFT_DRIVE_VICTOR_2 = 2;
    public static final int RIGHT_DRIVE_VICTOR_1 = 1;
    public static final int RIGHT_DRIVE_VICTOR_2 = 5;

    public static final int LEFT_JOYSTICK = 0;
    public static final int RIGHT_JOYSTICK = 1;
    public static final int SECONDARY_JOYSTICK = 2;
}
