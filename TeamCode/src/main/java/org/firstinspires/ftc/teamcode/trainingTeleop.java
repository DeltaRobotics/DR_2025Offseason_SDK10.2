package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name="trainingTeleop")
@Disabled

public class trainingTeleop extends LinearOpMode
{
    /**
     *
     *
     * Create all motors, servos, and variables
     *
     *
     */

    public boolean aBoolean = true;//making a boolean
    public boolean buttonA = true;//making a boolean to use for button press A (create new boolean for every button on the controller)
    public Servo aServo = null;//making a servo
    public DcMotor aMotor = null;//creating motor
    public int anInt = 0;//creating int
    public double aDouble = 0;//making a double


    @Override
    public void runOpMode() throws InterruptedException
    {
        /**
         *
         *
         * Call all servos, motors, odometry, hardware map and reset drive encoders (not always needed).
         *
         *
         */

        //EXAMPLES
        /**
        CALLING SERVO FROM CONFIG
        aServo = hardwareMap.servo.get("name of servo in config");


        SETTING MOTOR ENCODER & CALLING MOTOR FROM CONFIG

        aMotor = hardwareMap.dcMotor.get("name of motor in config");   Calling motor from config
        aMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);   Setting the motor to use encode,only if it has an encoder plugged into control/expansion hub and correct motor
        aMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);     Setting the motor to reset encode

         REVERSING THE MOTOR IF NEEDED
         aMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        */


        waitForStart();

        /**
         *
         *
         * INIT
         * reset position and IMU
         *
         *
         */

        //EXAMPLES
        /**
         RESETTING position of odometry and IMU
         robot.odo.resetPosAndIMU();


         SETTING MOTOR TARGET POSITION, POWER, & MOVING TO POSITION IF THE MOTOR IS NOT ON DRIVE TRAIN
         aMotor.setTargetPosition(0);
         aMotor.setPower(.5);
         aMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

         SETTING INIT POSITION OF A SERVO
         aServo.setPosition(0);

         */
        while (opModeIsActive())
        {

            /**            START CODING AND SET DRIVER CONTROLS
             *
             *
             */





            //            SETTING DRIVER CONTROLS AND WHERE YOU CHANGE IT FOR THE DRIVER

             //robot.mecanumDrive(gamepad1.left_stick_y, -gamepad1.left_stick_x, -gamepad1.right_stick_x, 0); //normal people
             //robot.mecanumDrive(gamepad1.right_stick_y, -gamepad1.right_stick_x, -gamepad1.left_stick_x, SPEED); //nolan

             //





            /**            BUTTON PRESS
             *
             * if(gamepad1.a && buttonA){
             *      aServo.setPosition(.5);
             *
             *      buttonA = false; (Needed to set the requirements to false and temporarily disable button till buttonA is true again)
             *
             * }
             *
             *
             *             REQUIRED FOR BUTTON PRESS TO WORK
             *            MAKES buttonA TRUE IN ORDER TO ENTER THE IF STATEMENT
             * if(!gamepad1.a && !buttonA){
             *
             *      buttonA = true;
             *
             * }
             *
             */




                                                //Setting motor position
            /**
             *
             *            aMotor.setTargetPosition(4400);                           Setting (hopefully) tuned motor position
             *            aMotor.setPower(1);                                       The amount of power you let the motor have while doing the action
             *            aMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);          Telling the motor to go to the position you said to go to
             *
             */


            /**
             *
             *                  aServo.setPosition(robot.WRIST_TOP);                How to set servo to a final position
             *
             *                  aServo.setPosition(.6);                             Setting it to normal double position
             *
             */



        }

    }

}