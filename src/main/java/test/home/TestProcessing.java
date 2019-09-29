package test.home;

//import KinectPV2.*;
//import KinectPV2.KJoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import processing.core.PApplet;

import java.util.ArrayList;


public class TestProcessing extends PApplet {

    static final Logger logger = LogManager.getLogger(StartKinect.class.getName());

    public static void start(String[] args) {

        PApplet.main("test.home.TestProcessing");

    }

    public void setup() {

    }

    public void draw(){

        ellipse(56, 46, 55, 55);
    }

}