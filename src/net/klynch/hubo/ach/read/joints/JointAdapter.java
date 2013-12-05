package net.klynch.hubo.ach.read.joints;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import net.klynch.hubo.ach.read.R;
import net.klynch.hubo.ach.read.joints.JointContent.Joint;

public class JointAdapter extends ArrayAdapter<Joint> {

    public JointAdapter(Context context) {
        super(context, R.layout.list_item_joint, R.id.name, JointContent.JOINTS);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View v = super.getView(position, convertView, parent);
        final Joint joint = JointContent.JOINTS.get(position);

        // TODO use tagObjects of ViewHolder pattern
        final TextView cmd = (TextView) v.findViewById(R.id.cmd);
        final TextView ref = (TextView) v.findViewById(R.id.ref);
        final TextView enc = (TextView) v.findViewById(R.id.enc);
        final TextView cur = (TextView) v.findViewById(R.id.cur);
        final TextView tmp = (TextView) v.findViewById(R.id.tmp);

        cmd.setText(String.valueOf(joint.cmd));
        ref.setText(String.valueOf(joint.ref));
        enc.setText(String.valueOf(joint.enc));
        cur.setText(String.valueOf(joint.cur));
        tmp.setText(String.valueOf(joint.tmp));

        return v;
    }
}
