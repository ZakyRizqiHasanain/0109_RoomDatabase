package com.example.roomdatabase.repositori

import androidx.constraintlayout.helper.widget.Flow
import com.example.roomdatabase.room.Siswa

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}