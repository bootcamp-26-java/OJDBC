/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;
import java.util.List;
import models.Job;
/**
 *
 * @author erik
 */
public interface IJobDAO {
    /**
     * method yang digunakan untuk mengambil semua data dari tabel Job
     * @return 
     */
//    public List<Job> getAll();
//    
//    /**
//     * method yang digunakan untuk mendapatkan dan meyeleksi data dari tabel Job
//     * @return 
//     */
//    public List<Job> getByID(String id);
//   
//    /**
//     * method yang digunakan untuk memasukkan data ke dalam tabel Job
//     * @param j
//     * @return 
//     */
    public boolean delete (String id);

//    public List<Job> search(String key);
//    
    
    public List<Job> getData(Object key, boolean IsGetById);
    
    /**
     * method yang digunakan untuk menghapus satu baris data sesuai id masukkan
     * @param j
     * @return 
     */
    
    public boolean save (Job j, boolean IsInsert);
    
    /**
     * method yang digunakan untuk mengganti nilai data di tabel Job
     * @param j
     * @return 
     */
    
    
    
}
