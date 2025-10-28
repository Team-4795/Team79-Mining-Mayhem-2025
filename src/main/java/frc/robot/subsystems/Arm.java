package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
     private SparkMax armMotor;

     public Arm () {
          armMotor = new SparkMax(2, null); // change canID
     }

     public void setArmPower (double speed) {
          armMotor.set(speed);
     }
     
}