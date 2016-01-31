
package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2557.robot.commands.*;
import org.usfirst.frc.team2557.robot.subsystems.*;

import org.usfirst.frc.team2557.robot.subsystems.IntakeMotorSubsystem;
import org.usfirst.frc.team2557.robot.subsystems.MotorWinch;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {


	public static OI oi;
	public static DriveTrain DriveTrain; //Drive train Subsystem
	public static Solenoid_System Solenoid_System;
	public static IntakeMotorSubsystem intakemotorsubsystem;
	public static MotorWinch motorwinch;


    Command autonomousCommand;
    Command AutoCommand;
    Command TankDrive; //this command is for the Drive Train
    Command Intake_Down;
    Command Wench_Lock;
    Command SS_Up;
    Command IntakeMotorCommand;
    Command MotorWinchCommand;
    Command GWinch;
    
    
    
    
    
    SendableChooser chooser;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    	DriveTrain = new DriveTrain();
    	Solenoid_System = new Solenoid_System();
    	intakemotorsubsystem = new IntakeMotorSubsystem();
    	motorwinch = new MotorWinch();
    	
        Wench_Lock = new Wench_Lock();
        Intake_Down = new Intake_Down();
        SS_Up = new SS_Up();
        IntakeMotorCommand = new IntakeMotorCommand();
        MotorWinchCommand = new MotorWinchCommand();
		TankDrive = new TankDrive();
		GWinch = new GyroWinch();
		
		
		oi = new OI();
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", new AutoCommand());
//        chooser.addObject("My Auto", new MyAutoCommand());
        SmartDashboard.putData("Auto mode", chooser);
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
        autonomousCommand = (Command) chooser.getSelected();
        
		/* String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "My Auto":
			autonomousCommand = new MyAutoCommand();
			break;
		case "Default Auto":
		default:
			autonomousCommand = new ExampleCommand();
			break;
		} */
    	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        TankDrive.start();
       SmartDashboard.putNumber("The gyo Value si ", RobotMap.GWinch.getAngle());
        }	
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
