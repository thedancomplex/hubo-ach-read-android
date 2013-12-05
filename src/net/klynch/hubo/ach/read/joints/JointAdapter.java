package net.klynch.hubo.ach.read.joints;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import net.klynch.hubo.ach.read.R;
import net.klynch.hubo.ach.read.joints.JointContent.Joint;

public class JointAdapter extends ArrayAdapter<Joint> {

    private static class ViewHolder {
        final TextView cmd;
        final TextView ref;
        final TextView enc;
        final TextView cur;
        final TextView tmp;

        ViewHolder(final View v) {
            cmd = (TextView) v.findViewById(R.id.cmd);
            ref = (TextView) v.findViewById(R.id.ref);
            enc = (TextView) v.findViewById(R.id.enc);
            cur = (TextView) v.findViewById(R.id.cur);
            tmp = (TextView) v.findViewById(R.id.tmp);
        }

        final void update(final Joint joint) {
            cmd.setText(String.valueOf(joint.cmd));
            ref.setText(String.valueOf(joint.ref));
            enc.setText(String.valueOf(joint.enc));
            cur.setText(String.valueOf(joint.cur));
            tmp.setText(String.valueOf(joint.tmp));
        }
    }

    public JointAdapter(Context context) {
        super(context, R.layout.list_item_joint, R.id.name, JointContent.JOINTS);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View v = super.getView(position, convertView, parent);
        final Joint joint = JointContent.JOINTS.get(position);

        final ViewHolder holder;
        final Object tag = v.getTag();
        if (tag instanceof ViewHolder) {
            holder = (ViewHolder) tag;
        } else {
            holder = new ViewHolder(v);
            v.setTag(holder);
        }

        holder.update(joint);

        return v;
    }
}
