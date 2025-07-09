package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name="centerPositionTesting")
@Disabled

public class centerPositionTesting extends LinearOpMode
{

    @Override
    public void runOpMode() throws InterruptedException
    {

        robotHardware robot = new robotHardware(hardwareMap);

        waitForStart();

        while (opModeIsActive())
        {



        }
    }
}