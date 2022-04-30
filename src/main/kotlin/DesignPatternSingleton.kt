object AppAnalytics {
    private var count: Int = 0
    fun trackUser(){
        count++
        println("Trackin user $count")
    }
    fun totalTracks(){
        println("Track User called $count times")
    }
}

fun main(){
    // Screen A
    navigateToNewScreen()

    //Screen B
    navigateToNewScreen()
}
fun navigateToNewScreen(){
    val appAnalytics = AppAnalytics
    //println(appAnalytics)
    appAnalytics.trackUser()
    appAnalytics.totalTracks()

}