package abika.sinau.myfirstkoin

import androidx.lifecycle.ViewModel


/**
 * @author by Abika Chairul Yusri on 5/26/2022
 */
class MyViewModel(
    private val repository: MyRepositoryImpl
) : ViewModel() {

    fun doCall() {
        repository.doNetworkCall()
    }
}