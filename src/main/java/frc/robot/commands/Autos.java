// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Arm;
import frc.robot.subsystems.DriveBase;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;


public final class Autos {

  private final static DriveBase driveBase = new DriveBase();
    private final static Arm arm = new Arm();
  
    /** Example static factory for an autonomous command. */
    public static Command exampleAuto(ExampleSubsystem subsystem) {
      return Commands.sequence(subsystem.exampleMethodCommand(), new ExampleCommand(subsystem));
    }
    //public static Command CartAuto() {
      //return Commands.sequence(Commands.run(()-> arm.setArmPower(0.3)).withTimeout(2), 
      //Commands.run(()-> arm.setArmPower(-0.3)).withTimeout(2),
     // Commands.run(()-> arm.setArmPower(0)),
    //  Commands.run(()-> driveBase.arcadeDrive(0.0, 0.5)).withTimeout(5),
     // Commands.run(()-> driveBase.arcadeDrive(0.5,0.0)).withTimeout(5),
    //  Commands.run(()-> driveBase.arcadeDrive(0.0,0.0)));
 // }
  public static Command TaxiAuto() {
    return Commands.sequence(Commands.run(()-> driveBase.arcadeDrive(0.5, 0.0)).withTimeout(3),
    Commands.run(()-> driveBase.arcadeDrive(0.0,0.0)).withTimeout(5));
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
