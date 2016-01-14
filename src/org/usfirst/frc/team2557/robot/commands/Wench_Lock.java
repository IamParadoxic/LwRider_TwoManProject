package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Wench_Lock extends Command {

    public Wench_Lock() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.Solenoid_System);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Solenoid_System.Wench_Lock(); //when toggled on
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Solenoid_System.Wench_Unlock(); //when toggle off
    }
}
