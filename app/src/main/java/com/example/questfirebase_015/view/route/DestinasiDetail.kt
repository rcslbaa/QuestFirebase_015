package com.example.questfirebase_015.view.route

import com.example.questfirebase_015.view.route.DestinasiNavigasi
import com.example.questfirebase_015.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}