package com.example.roomdatabase.uicontroller

import com.example.roomdatabase.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_sisaw"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}