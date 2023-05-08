package dev.redfox.networkaccessstorage.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.redfox.networkaccessstorage.networking.NasRepository
import javax.inject.Inject

@HiltViewModel
class NasViewModel @Inject constructor(private val nasRepository: NasRepository):  ViewModel() {
}