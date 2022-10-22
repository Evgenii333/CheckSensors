package e.simakov.checksensors

import android.content.Context
import android.hardware.Sensor.*
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity

abstract class SensorDiscoveryAssistant : AppCompatActivity() {

    private lateinit var sensorManager: SensorManager
    lateinit var sensorMessage: String

    fun checkSensors(nameSensors: Int, title:String): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        return if (sensorManager.getDefaultSensor(nameSensors) != null) {
            sensorMessage = "Есть"
            "$title"
        } else {
            sensorMessage = "Отсутствует"
            "$title"
        }
    }
}