package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    //this here set the motor spped/power to the joysticks on controler one
	public void Drive(){
		RobotMap.FrontLeft.set(Robot.oi.gamepad1.getRawAxis(1));
		RobotMap.BackLeft.set(Robot.oi.gamepad1.getRawAxis(1));
		RobotMap.FrontRight.set(-Robot.oi.gamepad1.getRawAxis(5));
		RobotMap.BackRight.set(-Robot.oi.gamepad1.getRawAxis(5));
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

