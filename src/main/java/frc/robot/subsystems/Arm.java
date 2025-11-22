package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
     private PWMSparkMax armMotor;

     public Arm () {
          armMotor = new PWMSparkMax(2); // change canID
     }

     public void setArmPower (double speed) {
          armMotor.set(speed);     
     }
     
}