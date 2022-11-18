
package frc.robot.subsystems;
import frc.robot.Constants.DriveConstants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class IntakeSubsystem extends SubsystemBase
{
    public IntakeSubsystem()
    {

    }
    private final WPI_TalonSRX m_intake = new WPI_TalonSRX(DriveConstants.convayor);
    public void intake(double speed)
    {
        m_intake.set(speed);
    }
}

