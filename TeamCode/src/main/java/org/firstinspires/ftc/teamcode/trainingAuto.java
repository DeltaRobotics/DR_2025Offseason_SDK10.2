package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Autonomous(name="trainingAuto") //MAKING IT A AUTO AND NAMING IT ON DRIVER HUB
@Disabled



//(NEEDS TO BE THE SAME NAME EVERYWHERE)
public class trainingAuto extends LinearOpMode
{
    /**
     *
     *
     *      MAKING SERVOS, MOTORS, AND VARIABLES
     *
     *
     */

    @Override
    public void runOpMode() throws InterruptedException
    {


        /**
         *
         *
         * Call all servos, motors, odometry, hardware map and reset drive encoder
         *
         *
         */





        while (!isStarted() && !isStopRequested())
        {

            /**
             *
             *
             *             INIT
             *
             *
             */


        }

        /**

         CHANGING ACCURACY
         robot.changeAccuracy(1, angle accuracy ("Math.toRadians(1)" is needed to change from radians to degrees));

         CHANGING SPEED
         robot.changeSpeed(.8,.8);


         */


                                //go to position single
        /**
         *
         *  while((Math.abs(x-robot.GlobalX) > robot.moveAccuracy || Math.abs(y-robot.GlobalY) > robot.moveAccuracy || Math.abs(robot.angleWrapRad(finalAngle - robot.GlobalHeading)) > robot.angleAccuracy) && deltaTime > currentTime.milliseconds()){
         *
         *             robot.goToPosSingle(x, y, finalAngle, Math.toRadians(30));
         *          }
         *
         * Makes it possible to drive while bringing slides in or moving other parts of the robot
         *
         *          (put the command to move robot and the other part of the robot in the curly brackets {} )
         *
         */


                                //normal go to position
        /**
         *
         *         x = 18;                                     where you want it to go in the x-direction
         *         y = 12;                                     where you want it to go in the Y-direction
         *         finalAngle = Math.toRadians(0);             where you need to put final angle in a normal go to position
         *
         *         robot.goToPos(x,y,finalAngle,Math.toRadians(180));           where you decide follow angle and call all other positions
         *
         */


        /**
         *
         *     time = robot.timerInit( THE AMOUNT OF TIME ALLOWED TO DO THE ACTION IN MILLISECONDS );
         *
         *             while (!robot.boolTimer(time)){          MAKES IT UNABLE TO STOP ACTION TILL THE boolTimer has added the amount of time you give it
         *
         *                 robot.refresh(robot.odometers);
         *
         *                 PUT WHAT YOU WANT TO DO IN THE TIME DRIVE IN HERE
         *
         *             }
         *             robotHardware.timerInitted = false;
         *
         *             robot.mecanumDrive(0,0,0,1);        braking fully / giving no power to drive motors
         *
         */

    }
}