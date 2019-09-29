package test.home.processing;

//import KinectPV2.*;
//import KinectPV2.KJoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import processing.core.PApplet;


public class TestProcessing extends PApplet {

    static final Logger logger = LogManager.getLogger(StartKinect.class.getName());

    public static void start(String[] args) {

        PApplet.main("test.home.processing.TestProcessing");

    }

    public void setup() {

    }

    public void draw(){

        ellipse(56, 46, 55, 55);
    }

}