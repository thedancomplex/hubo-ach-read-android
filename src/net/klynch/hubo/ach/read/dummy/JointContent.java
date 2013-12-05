package net.klynch.hubo.ach.read.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing joint content. This is lazily based off of the Android template wizard
 * code.
 */
public class JointContent {

    /**
     * An array of joints.
     */
    public static final List<Joint> JOINTS = new ArrayList<Joint>();

    /**
     * A map of joints, by ID.
     */
    public static final Map<String, Joint> JOINT_MAP = new HashMap<String, Joint>();

    static {
        addItem(new Joint("WST"));
        addItem(new Joint("NKY"));
        addItem(new Joint("NK1"));
        addItem(new Joint("NKP"));
        addItem(new Joint("LSP"));
        addItem(new Joint("LSR"));
        addItem(new Joint("LSY"));
        addItem(new Joint("LEB"));
        addItem(new Joint("LWY"));
        addItem(new Joint("LWR"));
        addItem(new Joint("LWP"));
        addItem(new Joint("RSP"));
        addItem(new Joint("RSR"));
        addItem(new Joint("RSY"));
        addItem(new Joint("REB"));
        addItem(new Joint("RWY"));
        addItem(new Joint("RWR"));
        addItem(new Joint("RWP"));
        addItem(new Joint("LHY"));
        addItem(new Joint("LHR"));
        addItem(new Joint("LHP"));
        addItem(new Joint("LKN"));
        addItem(new Joint("LAP"));
        addItem(new Joint("LAR"));
        addItem(new Joint("RHY"));
        addItem(new Joint("RHR"));
        addItem(new Joint("RHP"));
        addItem(new Joint("RKN"));
        addItem(new Joint("RAP"));
        addItem(new Joint("RAR"));
        addItem(new Joint("RF1"));
        addItem(new Joint("RF2"));
        addItem(new Joint("RF3"));
        addItem(new Joint("RF4"));
        addItem(new Joint("RF5"));
        addItem(new Joint("LF1"));
        addItem(new Joint("LF2"));
        addItem(new Joint("LF3"));
        addItem(new Joint("LF4"));
        addItem(new Joint("LF5"));
    }

    private static final void addItem(final Joint item) {
        JOINTS.add(item);
        JOINT_MAP.put(item.id, item);
    }

    /**
     * An item representing a Hubo Joint.
     */
    public static class Joint {
        public final String id;

        public volatile double cmd;
        public volatile double ref;
        public volatile double enc;
        public volatile double cur;
        public volatile double tmp;

        public Joint(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}
