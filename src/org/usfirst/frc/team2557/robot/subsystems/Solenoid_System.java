package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid_System extends Subsystem {
//SS is the SuperShifter
	public void Intake_Up(){
		RobotMap.IntakeSol.set(Value.kReverse);//brings the arm up
	}
	public void Intake_Down(){
		RobotMap.IntakeSol.set(Value.kForward);//brings the arm down
		
	}
	public void Wench_Lock(){
		RobotMap.WenchSol.set(Value.kReverse);//locks the winch
	}
	public void Wench_Unlock(){
		RobotMap.WenchSol.set(Value.kForward);//unlocks the winch
		
	}
	public void SS_Down(){
		RobotMap.SuperShifterSol.set(Value.kReverse);//brings the SS down
	}
	public void SS_Up(){
		RobotMap.SuperShifterSol.set(Value.kForward);//Brings the SS up
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

