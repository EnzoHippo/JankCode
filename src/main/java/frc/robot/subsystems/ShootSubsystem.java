package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants.DriveConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShootSubsystem extends SubsystemBase
{
    private final CANSparkMax m_shooter = new CANSparkMax(DriveConstants.shooterMotor, MotorType.kBrushless);
    public ShootSubsystem()
    { 

    }
    public void shoot(double speed)
    {
        System.out.println(speed);
        m_shooter.set(speed);
    }
}
