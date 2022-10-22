package e.simakov.checksensors

import android.hardware.Sensor
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import e.simakov.checksensors.adapter.SensorAdapter
import e.simakov.checksensors.databinding.ActivitySensorBinding
import e.simakov.checksensors.model.SensorModel

class SensorsActivity : SensorDiscoveryAssistant() {

    lateinit var binding: ActivitySensorBinding
    lateinit var adapter: SensorAdapter
    lateinit var recyclerView: RecyclerView


    companion object {
        const val TITLE_MAGNETOMETER = "Магнетометр"
        const val TITLE_ACCELEROMETER = "Акселерометр"
        const val TITLE_AMBIENT_TEMPERATURE = "Датчик внешней температуры"
        const val TITLE_GRAVITY = "Датчик гравитации"
        const val TITLE_GYROSCOPE = "Гироскоп"
        const val TITLE_LIGHT = "Датчик света"
        const val TITLE_LINEAR_ACCELERATOR = "Линейный акселератор"
        const val TITLE_MAGNETIC_FIELD = "Датчик магнитного поля"
        const val TITLE_TYPE_ORIENTATION = "Датчик ориентации"
        const val TITLE_PRESSURE = "Датчик давления"
        const val TITLE_PROXIMITY = "Датчик приближения"
        const val TITLE_RELATIVE_HUMIDITY = "Датчик влажности"
        const val TITLE_ROTATION_VECTOR = "Датчик направления вращения"
        const val TITLE_TEMPERATURE = "Датчик температуры"
    }



var listSensors = mapOf("magnetometer" to Sensor.TYPE_MAGNETIC_FIELD,
    "sensorAccelerometer" to Sensor.TYPE_ACCELEROMETER,
    "sensorAmbientTemperature" to Sensor.TYPE_AMBIENT_TEMPERATURE,
    "sensorGravity" to Sensor.TYPE_GRAVITY,
    "sensorGyroscope" to Sensor.TYPE_GYROSCOPE,
    "sensorLight" to Sensor.TYPE_LIGHT,
    "sensorLinearAccelerator" to Sensor.TYPE_LINEAR_ACCELERATION,
    "sensorMagneticField" to Sensor.TYPE_MAGNETIC_FIELD,
    "sensorTypeOrientation" to Sensor.TYPE_ORIENTATION,
    "sensorPressure" to Sensor.TYPE_PRESSURE,
    "sensorProximity" to Sensor.TYPE_PROXIMITY,
    "sensorRelativeHumidity" to Sensor.TYPE_RELATIVE_HUMIDITY,
    "sensorRotationVector" to Sensor.TYPE_ROTATION_VECTOR,
    "sensorTemperature" to Sensor.TYPE_TEMPERATURE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySensorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial(){
        recyclerView = binding.rvUser
        adapter = SensorAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    private fun myUser(): ArrayList<SensorModel>{
        val userList = ArrayList<SensorModel>()

        val sensorMagnetometer = SensorModel(checkSensors(listSensors.getValue("magnetometer"), TITLE_MAGNETOMETER), sensorMessage)
        val userAccelerometer = SensorModel(checkSensors(listSensors.getValue("sensorAccelerometer"), TITLE_ACCELEROMETER), sensorMessage)
        val userAmbientTemperature = SensorModel(checkSensors(listSensors.getValue("sensorAmbientTemperature"), TITLE_AMBIENT_TEMPERATURE), sensorMessage)
        val userGravity = SensorModel(checkSensors(listSensors.getValue("sensorGravity"), TITLE_GRAVITY), sensorMessage)
        val userGyroscope = SensorModel(checkSensors(listSensors.getValue("sensorGyroscope"), TITLE_GYROSCOPE), sensorMessage)
        val userLight = SensorModel(checkSensors(listSensors.getValue("sensorLight"), TITLE_LIGHT), sensorMessage)
        val userLinearAccelerator = SensorModel(checkSensors(listSensors.getValue("sensorLinearAccelerator"), TITLE_LINEAR_ACCELERATOR), sensorMessage)
        val userMagneticField = SensorModel(checkSensors(listSensors.getValue("sensorMagneticField"), TITLE_MAGNETIC_FIELD), sensorMessage)
        val userTypeOrientation = SensorModel(checkSensors(listSensors.getValue("sensorTypeOrientation"), TITLE_TYPE_ORIENTATION), sensorMessage)
        val userPressure = SensorModel(checkSensors(listSensors.getValue("sensorPressure"), TITLE_PRESSURE), sensorMessage)
        val userProximity = SensorModel(checkSensors(listSensors.getValue("sensorProximity"), TITLE_PROXIMITY), sensorMessage)
        val userRelativeHumidity = SensorModel(checkSensors(listSensors.getValue("sensorRelativeHumidity"), TITLE_RELATIVE_HUMIDITY), sensorMessage)
        val userRotationVector = SensorModel(checkSensors(listSensors.getValue("sensorRotationVector"), TITLE_ROTATION_VECTOR), sensorMessage)
        val sensorTemperature = SensorModel(checkSensors(listSensors.getValue("sensorTemperature"), TITLE_TEMPERATURE), sensorMessage)

        userList.add(sensorMagnetometer)
        userList.add(userAccelerometer)
        userList.add(userAmbientTemperature)
        userList.add(userGravity)
        userList.add(userGyroscope)
        userList.add(userLight)
        userList.add(userLinearAccelerator)
        userList.add(userMagneticField)
        userList.add(userTypeOrientation)
        userList.add(userPressure)
        userList.add(userProximity)
        userList.add(userRelativeHumidity)
        userList.add(userRotationVector)
        userList.add(sensorTemperature)

        return userList
    }
}