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
        private const val TITLE_MAGNETOMETER = "Магнетометр"
        private const val TITLE_ACCELEROMETER = "Акселерометр"
        private const val TITLE_AMBIENT_TEMPERATURE = "Датчик внешней температуры"
        private const val TITLE_GRAVITY = "Датчик гравитации"
        private const val TITLE_GYROSCOPE = "Гироскоп"
        private const val TITLE_LIGHT = "Датчик света"
        private const val TITLE_LINEAR_ACCELERATOR = "Линейный акселератор"
        private const val TITLE_MAGNETIC_FIELD = "Датчик магнитного поля"
        private const val TITLE_TYPE_ORIENTATION = "Датчик ориентации"
        private const val TITLE_PRESSURE = "Датчик давления"
        private const val TITLE_PROXIMITY = "Датчик приближения"
        private const val TITLE_RELATIVE_HUMIDITY = "Датчик влажности"
        private const val TITLE_ROTATION_VECTOR = "Датчик направления вращения"
        private const val TITLE_TEMPERATURE = "Датчик температуры"
    }

    fun checkMagnetometer(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_MAGNETIC_FIELD) != null) {
            magnetometerMessage = "Есть"
            return "$TITLE_MAGNETOMETER"
        } else {
            magnetometerMessage = "Отсутствует"
            return "$TITLE_MAGNETOMETER"
        }
    }

    fun checkAccelerometer(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_ACCELEROMETER) != null) {
            accelerometerMessage = "Есть"
            return "$TITLE_ACCELEROMETER"

        } else {
            accelerometerMessage = "Отсутствует"
            return "$TITLE_ACCELEROMETER"
        }
    }

    fun checkAmbientTemperature(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_AMBIENT_TEMPERATURE) != null) {
            ambientTemperatureMessage = "Есть"
            return "$TITLE_AMBIENT_TEMPERATURE"
        } else {
            ambientTemperatureMessage = "Отсутствует"
            return "$TITLE_AMBIENT_TEMPERATURE"
        }
    }

    fun checkGravity(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_GRAVITY) != null) {
            gravityMessage = "Есть"
            return "$TITLE_GRAVITY"
        } else {
            gravityMessage = "Отсутствует"
            return "$TITLE_GRAVITY"
        }
    }

    fun checkGyroscope(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_GYROSCOPE) != null) {
            gyroscopeMessage = "Есть"
            return "$TITLE_GYROSCOPE"
        } else {
            gyroscopeMessage = "Отсутствует"
            return "$TITLE_GYROSCOPE"
        }
    }

    fun checkLight(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_LIGHT) != null) {
            lightMessage = "Есть"
            return "$TITLE_LIGHT"
        } else {
            lightMessage = "Отсутствует"
            return "$TITLE_LIGHT"
        }
    }

    fun checkLinearAccelerator(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_LINEAR_ACCELERATION) != null) {
            linearAcceleratorMessage = "Есть"
            return "$TITLE_LINEAR_ACCELERATOR"
        } else {
            linearAcceleratorMessage = "Отсутствует"
            return "$TITLE_LINEAR_ACCELERATOR"
        }
    }

    fun checkMagneticField(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_MAGNETIC_FIELD) != null) {
            magneticFieldMessage = "Есть"
            return "$TITLE_MAGNETIC_FIELD"
        } else {
            magneticFieldMessage = "Отсутствует"
            return "$TITLE_MAGNETIC_FIELD"
        }
    }

    fun checkTypeOrientation(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_ORIENTATION) != null) {
            typeOrientationMessage = "Есть"
            return "$TITLE_TYPE_ORIENTATION"
        } else {
            typeOrientationMessage = "Отсутствует"
            return "$TITLE_TYPE_ORIENTATION"
        }
    }

    fun checkPressure(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_PRESSURE) != null) {
            pressureMessage = "Есть"
            return "$TITLE_PRESSURE"
        } else {
            pressureMessage = "Отсутствует"
            return "$TITLE_PRESSURE"
        }
    }

    fun checkProximity(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_PROXIMITY) != null) {
            proximityMessage = "Есть"
            return "$TITLE_PROXIMITY"
        } else {
            proximityMessage = "Отсутствует"
            return "$TITLE_PROXIMITY"
        }
    }

    fun checkRelativeHumidity(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_RELATIVE_HUMIDITY) != null) {
            relativeHumidityMessage = "Есть"
            return "$TITLE_RELATIVE_HUMIDITY"
        } else {
            relativeHumidityMessage = "Отсутствует"
            return "$TITLE_RELATIVE_HUMIDITY"
        }
    }

    fun checkRotationVector(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_ROTATION_VECTOR) != null) {
            rotationVectorMessage = "Есть"
            return "$TITLE_ROTATION_VECTOR"
        } else {
            rotationVectorMessage = "Отсутствует"
            return "$TITLE_ROTATION_VECTOR"
        }
    }

    fun checkTemperature(): String {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        if (sensorManager.getDefaultSensor(TYPE_TEMPERATURE) != null) {
            temperatureMessage = "Есть"
            return "$TITLE_TEMPERATURE"
        } else {
            temperatureMessage = "Отсутствует"
            return "$TITLE_TEMPERATURE"
        }
    }
}