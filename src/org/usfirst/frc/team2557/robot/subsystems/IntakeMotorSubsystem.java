package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeMotorSubsystem extends Subsystem {
	public void motorintake(){
		RobotMap.intakemotor.set(1);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void IntakeMotorStop(){
		RobotMap.intakemotor.set(0);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}