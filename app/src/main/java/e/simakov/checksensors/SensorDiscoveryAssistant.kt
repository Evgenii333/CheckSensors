package e.simakov.checksensors

import android.content.Context
import android.hardware.Sensor
import android.hardware.Sensor.*
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity

abstract class SensorDiscoveryAssistant : AppCompatActivity() {

    private lateinit var sensorManager: SensorManager
    lateinit var magnetometerMessage: String
    lateinit var accelerometerMessage: String
    lateinit var ambientTemperatureMessage: String
    lateinit var gravityMessage: String
    lateinit var gyroscopeMessage: String
    lateinit var lightMessage: String
    lateinit var linearAcceleratorMessage: String
    lateinit var magneticFieldMessage: String
    lateinit var typeOrientationMessage: String
    lateinit var pressureMessage: String
    lateinit var proximityMessage: String
    lateinit var relativeHumidityMessage: String
    lateinit var rotationVectorMessage: String
    lateinit var temperatureMessage: String


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
        const val TEXT_SENSOR_THERE = "Есть"
        const val TEXT_SENSOR_NOT_THERE = "Отсутствует"

    }

    fun checkMagnetometer(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_MAGNETIC_FIELD) != null) {
            magnetometerMessage = TEXT_SENSOR_THERE
            return "$TITLE_MAGNETOMETER"
        } else {
            magnetometerMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_MAGNETOMETER"
        }
    }

    fun checkAccelerometer(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_ACCELEROMETER) != null) {
            accelerometerMessage = TEXT_SENSOR_THERE
            return "$TITLE_ACCELEROMETER"

        } else {
            accelerometerMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_ACCELEROMETER"
        }
    }

    fun checkAmbientTemperature(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_AMBIENT_TEMPERATURE) != null) {
            ambientTemperatureMessage = TEXT_SENSOR_THERE
            return "$TITLE_AMBIENT_TEMPERATURE"
        } else {
            ambientTemperatureMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_AMBIENT_TEMPERATURE"
        }
    }

    fun checkGravity(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_GRAVITY) != null) {
            gravityMessage = TEXT_SENSOR_THERE
            return "$TITLE_GRAVITY"
        } else {
            gravityMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_GRAVITY"
        }
    }

    fun checkGyroscope(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_GYROSCOPE) != null) {
            gyroscopeMessage = TEXT_SENSOR_THERE
            return "$TITLE_GYROSCOPE"
        } else {
            gyroscopeMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_GYROSCOPE"
        }
    }

    fun checkLight(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_LIGHT) != null) {
            lightMessage = TEXT_SENSOR_THERE
            return "$TITLE_LIGHT"
        } else {
            lightMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_LIGHT"
        }
    }

    fun checkLinearAccelerator(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_LINEAR_ACCELERATION) != null) {
            linearAcceleratorMessage = TEXT_SENSOR_THERE
            return "$TITLE_LINEAR_ACCELERATOR"
        } else {
            linearAcceleratorMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_LINEAR_ACCELERATOR"
        }
    }

    fun checkMagneticField(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_MAGNETIC_FIELD) != null) {
            magneticFieldMessage = TEXT_SENSOR_THERE
            return "$TITLE_MAGNETIC_FIELD"
        } else {
            magneticFieldMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_MAGNETIC_FIELD"
        }
    }

    fun checkTypeOrientation(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_ORIENTATION) != null) {
            typeOrientationMessage = TEXT_SENSOR_THERE
            return "$TITLE_TYPE_ORIENTATION"
        } else {
            typeOrientationMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_TYPE_ORIENTATION"
        }
    }

    fun checkPressure(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_PRESSURE) != null) {
            pressureMessage = TEXT_SENSOR_THERE
            return "$TITLE_PRESSURE"
        } else {
            pressureMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_PRESSURE"
        }
    }

    fun checkProximity(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_PROXIMITY) != null) {
            proximityMessage = TEXT_SENSOR_THERE
            return "$TITLE_PROXIMITY"
        } else {
            proximityMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_PROXIMITY"
        }
    }

    fun checkRelativeHumidity(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_RELATIVE_HUMIDITY) != null) {
            relativeHumidityMessage = TEXT_SENSOR_THERE
            return "$TITLE_RELATIVE_HUMIDITY"
        } else {
            relativeHumidityMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_RELATIVE_HUMIDITY"
        }
    }

    fun checkRotationVector(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_ROTATION_VECTOR) != null) {
            rotationVectorMessage = TEXT_SENSOR_THERE
            return "$TITLE_ROTATION_VECTOR"
        } else {
            rotationVectorMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_ROTATION_VECTOR"
        }
    }

    fun checkTemperature(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_TEMPERATURE) != null) {
            temperatureMessage = TEXT_SENSOR_THERE
            return "$TITLE_TEMPERATURE"
        } else {
            temperatureMessage = TEXT_SENSOR_NOT_THERE
            return "$TITLE_TEMPERATURE"
        }
    }
}