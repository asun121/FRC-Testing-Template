/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Joystick;

public class JoystickControl extends SubsystemBase
{
    private final Joystick m_stick = new Joystick(0);
    private double driveLimiter = 0.5;

    /**
     * Gets the right stick Y value
     * @return double
     */
    public double getRYValue()
    {
        return m_stick.getRawAxis(5) * -1 * driveLimiter;
    }
    /**
     * Gets left stick Y value
     * @return double
     */
    public double getLYValue()
    {
        return m_stick.getRawAxis(1) * -1 * driveLimiter;
    }
    /**
     * Gets left stick X value
     * @return double
     */
    public double getLXValue()
    {
        return m_stick.getRawAxis(0) * driveLimiter;
    }
    /**
     * Gets right stick X value
     * @return double
     */
    public double getRXValue()
    {
        return m_stick.getRawAxis(4) * driveLimiter;
    }
    /**
     * Gets right trigger value
     * @return double
     */
    public double getTriggerR()
    {
        return m_stick.getRawAxis(3);
    }

    /**
     * Gets right trigger value
     * @return double
     */
    public double getTriggerL()
    {
        return m_stick.getRawAxis(2);
    }


}