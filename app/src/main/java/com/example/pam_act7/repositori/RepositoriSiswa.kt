package com.example.pam_act7.repositori

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import com.example.pam_act7.Room.Siswa
import com.example.pam_act7.Room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
    //Edit 1 : tambah 3 fugngsi berikut
    fun getSiswaStream(id: Int): Flow<Siswa?>

    suspend fun  deleteSiswa(siswa: Siswa)

    suspend fun  updateSiswa(siswa: Siswa)
}
class OfflineRepositoriSiswa(private val siswaDao: SiswaDao): RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
    //edit 2 : tambah 3 fungsi berikut
    override fun getSiswaStream(id: Int): Flow<Siswa?> = siswaDao.getSiswa(id)
    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)
    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)
}