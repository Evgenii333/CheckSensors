package e.simakov.checksensors.test.page

interface MainActivityPage {

    enum class ViewId{

    }

    enum class ViewText{

    }

    fun checkViewIdVisible(id: ViewId)

    fun checkViewTextVisible(id: ViewText)
}