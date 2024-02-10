package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;


public class SwerveModule {

   private final CANSparkMax m_driveMotor;
   private final CANSparkMax m_turnMotor;
   private final RelativeEncoder m_driveEncoder;

   //Do I need the relativeEncoder and the CANcoder or just one?
   private final RelativeEncoder m_turnEncoder;
   private final CANcoder m_cancoder;



}
