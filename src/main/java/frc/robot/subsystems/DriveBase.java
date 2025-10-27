package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBase extends SubsystemBase{
    VictorSP right_Motor;
    VictorSP left_Motor;
    DifferentialDrive robot_DifferentialDrive;

    public DriveBase() {
        left_Motor = new VictorSP(0);
        right_Motor = new VictorSP(1);
        robot_DifferentialDrive = new DifferentialDrive(left_Motor, right_Motor);
    }
    
    public void arcadeDrive(double xSpeed, double zRotation){
        robot_DifferentialDrive.arcadeDrive(xSpeed, zRotation);
    }
}
