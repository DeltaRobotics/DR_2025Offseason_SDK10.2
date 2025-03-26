package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Autonomous(name="trainingAuto") //MAKING IT A AUTO AND NAMING IT ON DRIVER HUB
@Disabled  /**         ^
                       |
                       |
                       |
           (NEEDS TO BE THE SAME AS "public class ______ extends LinearOpMode")
 */
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
    public void runOpMode() throws InterruptedException  //     Call all servos, motors, odometry, hardware map and reset drive encoder
    {







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










    }
}