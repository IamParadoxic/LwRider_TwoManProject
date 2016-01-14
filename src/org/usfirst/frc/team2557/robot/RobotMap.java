package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//here are the motors for the wheels
    public static CANTalon 	FrontLeft = new CANTalon(4); 	//Port4
    public static CANTalon 	FrontRight = new CANTalon(5);	//Port5
    public static CANTalon 	BackLeft = new CANTalon(0);		//Port0
    public static CANTalon 	BackRight = new CANTalon(1);	//Port1
}
