package frc.robot.subsystems;

//These are imports for external libraries
//These allow us to control the motors
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

public class TemplateSystem extends SubsystemBase 
{
  //These are initializations of motor controllers
  //The motor controllers allow us to control the speed and properties of motors
  //If you don't know much java or object oriented programming, I wouldn't worry about this now
  private CANSparkMax sparkLeftOne = new CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax sparkLeftTwo = new CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax sparkRightOne = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax sparkRightTwo = new CANSparkMax(7, CANSparkMaxLowLevel.MotorType.kBrushless);

  public TemplateSystem() 
  {
    //This piece of code resets all the motors to factory settings
    //While this isn't necessary, in order to reduce jank, try to write this every time
    sparkLeftOne.restoreFactoryDefaults();
    sparkLeftTwo.restoreFactoryDefaults();
    sparkRightOne.restoreFactoryDefaults();
    sparkRightTwo.restoreFactoryDefaults();

    //This line causes one motor to follow the other
    //This is really helpful, as sparkLeftOne automatically copies everything that sparkLeftTwo does
    //For example, if you set the power of sparkLeftTwo to 100%, sparkLeftOne will do the same thing
    sparkLeftOne.follow(sparkLeftTwo); 
    sparkRightTwo.follow(sparkRightOne);
  }

  /*
  * Write some code that will set the speed of the motor in here
  * To set the speed of the motor, write '(INSERT_MOTOR_NAME).setSpeed(INSERT_MOTOR_SPEED)'
  * Hint: Notice how you have already created 4 motors
  */
  public void setSpeeds(double leftSpeed, double rightSpeed)
  {
    
  }

}

