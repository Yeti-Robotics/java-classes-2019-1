package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class DrivePathCommandGroup extends CommandGroup {

    public DrivePathCommandGroup() {
        /*
        addSequential(someCommand)
        addSequential(someOtherCommand)

        addParallel(someCommand)
        addSequential(someOtherCommand)
         */

        for (int i = 0; i < 4; i++) {
            addSequential(new DriveForTimeCommand(0.3, 0.3, 1.5));
            addSequential(new DriveForTimeCommand(0.2, -0.2, 1));
        }
    }
}
