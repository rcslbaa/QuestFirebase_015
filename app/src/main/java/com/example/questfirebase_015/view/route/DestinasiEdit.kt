package com.example.questfirebase_015.view.route

import com.example.questfirebase_015.view.route.DestinasiNavigasi
import com.example.questfirebase_015.R

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}