package Axolotl;

import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import battlecode.common.RobotType;
import battlecode.common.Team;

public class General {
    public static RobotController rc;
    public static MapLocation myLocation;
    public static Team myTeam;
    public static Team EnemyTeam;
    public static int myID;
    public static RobotType myType;
    public static float mySightRadius;
    public static float myBodyRadius;

    public static void init(RobotController RC) {
        rc = RC;
        myTeam = rc.getTeam();
        EnemyTeam = myTeam.opponent();
        myID = rc.getID();
        myType = rc.getType();
        mySightRadius = myType.sensorRadius;
        myBodyRadius = myType.bodyRadius;
    }
    public static void update() {
        myLocation = rc.getLocation();
    }

}
