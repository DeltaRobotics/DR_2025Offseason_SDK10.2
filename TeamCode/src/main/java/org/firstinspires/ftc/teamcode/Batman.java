package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name="Batman")

public class Batman extends LinearOpMode
{

    public Servo wrist = null;
    public Servo claw = null;
    public Servo REH = null;
    public Servo LEH = null;

    public boolean buttonY = true;
    public double SPEED = .75;

    @Override
    public void runOpMode() throws InterruptedException
    {
        robotHardware robot = new robotHardware(hardwareMap);

        wrist = hardwareMap.servo.get("wrist");
        claw = hardwareMap.servo.get("claw");
        REH = hardwareMap.servo.get("REH");
        LEH = hardwareMap.servo.get("LEH");

        while (!isStarted() && !isStopRequested()) {

            wrist.setPosition(.5);
            //claw.setPosition(.5);

            //REH.setPosition(.5);
            //LEH.setPosition(.5);

        }

        while (opModeIsActive())
        {
            robot.mecanumDrive(gamepad1.left_stick_y, -gamepad1.left_stick_x, -gamepad1.right_stick_x, SPEED);


            if(gamepad1.y && buttonY){

                wrist.setPosition(-.1);

                buttonY = false;
            }

            if(!gamepad1.y && !buttonY){

                buttonY = true;
            }











        }
    }
}