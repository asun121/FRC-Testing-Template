package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class TemplateCommand extends CommandBase {


  //In this command, we will be coding a basic drive function
  public TemplateCommand() 
  {
    //These are the subsystems required in order to create a 'drive' command
    addRequirements(Robot.drive); //This is the driveTrain. This will allow us to set the motor speeds
    addRequirements(Robot.pad); //This is the XBOX controller. This will allow us to map button presses to the motors
  }

  /*
  * If you recall, commands can be called by the robot whenever
  * Commands are simply used to accomplish certain tasks using the subsystems
  * In this command, we are going to program a basic 'Drive' function, that will allow the
  * driver to simply drive the robot around
  */

  //Initialize:
  //Initialize is the first thing that runs when the command is called
  //For now, don't put anything in here, as we are only writing a very basic system
  @Override
  public void initialize() 
  {

  }

  //Execute is possibly the most important aspect of a command
  //The 'execute' function is run every 20 milliseconds
  //Think of it as an infinite loop whenever the command is run
  //This is where you need to write the code to drive the robot
  //Check out the 'ArcadeDrive' command (should be in the same folder) to have an idea of how this command works
  @Override
  public void execute() 
  {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() 
  {
    return false;
  }
}
