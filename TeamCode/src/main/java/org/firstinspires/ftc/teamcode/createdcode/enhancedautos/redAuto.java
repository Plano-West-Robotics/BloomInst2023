package org.firstinspires.ftc.teamcode.createdcode.enhancedautos;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Autonomous
@Config
public class redAuto extends enhancedAutoMode{
    public static double[] xCoordArr = {0, -30, -50};
    private static double[] yCoordArr = {0, 10, 50};
    private static double[] angleArr = {0, 90, 90};
    private static int[] methodIdArr = {0, 0, 0};

    @Override
    public void runOpMode(){
        initThings();

        setXCoords(xCoordArr);
        setYCoords(yCoordArr);
        setAngles(angleArr);
        setMethodIDS(methodIdArr);
        try {
            makeActionObjects();
        } catch (Exception e) {
            e.printStackTrace();
        }

        waitForStart();

        run();
    }

}