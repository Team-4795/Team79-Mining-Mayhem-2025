package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.ArmConstants;
import frc.robot.Constants.OperatorConstants;
public class Arm extends SubsystemBase{
     private PWMSparkMax armMotor;

     public Arm () {
          armMotor = new PWMSparkMax(OperatorConstants.arm_Motor_ID); // change canID
     }

     public void setArmPower (double speed) {
          armMotor.set(speed);     
     }
     
}