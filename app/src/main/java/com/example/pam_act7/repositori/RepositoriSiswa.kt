package com.example.pam_act7.repositori

import com.example.pam_act7.Room.Siswa
import com.example.pam_act7.Room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao) : RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswaStream()

    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}