package abika.sinau.myfirstkoin


/**
 * @author by Abika Chairul Yusri on 5/26/2022
 */
class MyRepositoryImpl(
    private val api: MyApi
) : MyRepository {

    override fun doNetworkCall() {
        api.callApi()
    }
}