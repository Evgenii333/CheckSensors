package e.simakov.checksensors

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import e.simakov.checksensors.adapter.UserAdapter
import e.simakov.checksensors.databinding.ActivityMainBinding
import e.simakov.checksensors.model.UserModel

class MainActivity : SensorDiscoveryAssistant() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    fun initial(){
        recyclerView = binding.rvUser
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()

        val sensorMagnetometer = UserModel(checkMagnetometer(), magnetometerMessage)
        val userAccelerometer = UserModel(checkAccelerometer(), accelerometerMessage)
        val userAmbientTemperature = UserModel(checkAmbientTemperature(), ambientTemperatureMessage)
        val userGravity = UserModel(checkGravity(), gravityMessage)
        val userGyroscope = UserModel(checkGyroscope(), gyroscopeMessage)
        val userLight = UserModel(checkLight(), lightMessage)
        val userLinearAccelerator = UserModel(checkLinearAccelerator(), linearAcceleratorMessage)
        val userMagneticField = UserModel(checkMagneticField(), magneticFieldMessage)
        val userTypeOrientation = UserModel(checkTypeOrientation(), typeOrientationMessage)
        val userPressure = UserModel(checkPressure(), pressureMessage)
        val userProximity = UserModel(checkProximity(), proximityMessage)
        val userRelativeHumidity = UserModel(checkRelativeHumidity(), relativeHumidityMessage)
        val userRotationVector = UserModel(checkRotationVector(), rotationVectorMessage)
        val userTemperature = UserModel(checkTemperature(), temperatureMessage)

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