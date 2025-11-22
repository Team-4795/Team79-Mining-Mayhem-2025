package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.OperatorConstants;


public class DriveBase extends SubsystemBase{
    VictorSP right_Motor = new VictorSP(OperatorConstants.right_Motor_ID);
    VictorSP left_Motor = new VictorSP(OperatorConstants.left_Motor_ID);
    DifferentialDrive robot_DifferentialDrive = new DifferentialDrive(left_Motor, right_Motor);

    public DriveBase() {
    }
    
    public void arcadeDrive(double xSpeed, double zRotation){
        robot_DifferentialDrive.arcadeDrive(xSpeed, zRotation);
    }
}
