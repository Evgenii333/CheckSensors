package e.simakov.checksensors.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import e.simakov.checksensors.R
import e.simakov.checksensors.model.SensorModel
import kotlinx.android.synthetic.main.item_sensor_layout.view.*

class SensorAdapter : RecyclerView.Adapter<SensorAdapter.SensorViewHolder>() {

    private var sensorList = emptyList<SensorModel>()


    class SensorViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SensorViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_sensor_layout, parent, false)
        return SensorViewHolder(view)
    }

    override fun onBindViewHolder(holder: SensorViewHolder, position: Int) {
        holder.itemView.tv_sensor_name.text = sensorList[position].sensorName
        holder.itemView.tv_sensor_message.text = sensorList[position].sensorMessage
    }

    override fun getItemCount(): Int {
        return sensorList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<SensorModel>) {
        sensorList = list
        notifyDataSetChanged()
    }
}