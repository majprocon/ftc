
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@Autonomous(name="Basic: Linear OpMode", group="Linear OpMode")

public class Mahnoor extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor frontleft = null;
    private DcMotor frontright = null;
    private DcMotor backleft = null;
    private DcMotor backright = null;

    @Override
    public void runOpMode() {

        frontleft  = hardwareMap.get(DcMotor.class, "frontleft");
        frontright = hardwareMap.get(DcMotor.class, "frontright");
        backleft = hardwareMap.get(DcMotor.class, "backleft");
        backright = hardwareMap.get(DcMotor.class, "backright");
        
        frontright.setDirection(DcMotor.Direction.REVERSE);
        backright.setDirection(DcMotor.Direction.REVERSE); 
        // frontleft.setDirection(DcMotor.Direction.REVERSE);
        // backleft.setDirection(DcMotor.Direction.REVERSE);

        

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {

            // Setup a variable for each drive wheel to save power level for telemetry
            double leftPower;
            double rightPower;



            frontright.setPower(0.5);
            frontleft.setPower(0.5);
            backright.setPower(0.5);
            backleft.setPower(0.5);
            sleep(1000);
            
            
            

           
        }
    }
}
