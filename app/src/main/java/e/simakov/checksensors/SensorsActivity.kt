package e.simakov.checksensors

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import e.simakov.checksensors.adapter.SensorAdapter
import e.simakov.checksensors.databinding.ActivityMainBinding
import e.simakov.checksensors.databinding.ActivitySensorBinding
import e.simakov.checksensors.model.SensorModel

class SensorsActivity : SensorDiscoveryAssistant() {

    lateinit var binding: ActivitySensorBinding
    lateinit var adapter: SensorAdapter
    lateinit var recyclerView: RecyclerView

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

        val sensorMagnetometer = SensorModel(checkMagnetometer(), magnetometerMessage)
        val userAccelerometer = SensorModel(checkAccelerometer(), accelerometerMessage)
        val userAmbientTemperature = SensorModel(checkAmbientTemperature(), ambientTemperatureMessage)
        val userGravity = SensorModel(checkGravity(), gravityMessage)
        val userGyroscope = SensorModel(checkGyroscope(), gyroscopeMessage)
        val userLight = SensorModel(checkLight(), lightMessage)
        val userLinearAccelerator = SensorModel(checkLinearAccelerator(), linearAcceleratorMessage)
        val userMagneticField = SensorModel(checkMagneticField(), magneticFieldMessage)
        val userTypeOrientation = SensorModel(checkTypeOrientation(), typeOrientationMessage)
        val userPressure = SensorModel(checkPressure(), pressureMessage)
        val userProximity = SensorModel(checkProximity(), proximityMessage)
        val userRelativeHumidity = SensorModel(checkRelativeHumidity(), relativeHumidityMessage)
        val userRotationVector = SensorModel(checkRotationVector(), rotationVectorMessage)
        val userTemperature = SensorModel(checkTemperature(), temperatureMessage)

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
        userList.add(userTemperature)

        return userList

    }

}