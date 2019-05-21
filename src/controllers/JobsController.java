/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import icontrollers.IJobsController;
import daos.JobDAO;
import java.sql.Connection;
import java.util.List;
import models.Job;
import tools.DBConnection;
import tools.OJDBC;
import idaos.IJobDAO;


/**
 *
 * @author erik
 */
public class JobsController implements IJobsController {
    
    private IJobDAO ijdao;
    
    public JobsController(Connection connection) {
        ijdao = new JobDAO(connection);
    }

    @Override
    public List<Job> getAll() {
        return ijdao.getData("", false);
    }

    @Override
    public List<Job> getById(String id) {
        return ijdao.getData(id, true);
    }

    @Override
    public List<Job> search(String key) {
        return ijdao.getData(key, false);
    }

    @Override
    public String insert(String id, String Title, String Min_Salary, String Max_Salary) {
        String result = "";
        Job jobs = new Job(id, Title, Integer.parseInt(Min_Salary), Integer.parseInt(Max_Salary));
        if (ijdao.save(jobs, true)) {
            result = "Data Berhasil Disimpan";
        }
        else {
            result = "maaf data gagal disimpan";
        }
        return result;
    }

    @Override
    public String update(String id, String Title, String Min_Salary, String Max_Salary) {
        String result = "";
        Job jobs = new Job(id, Title, Integer.parseInt(Min_Salary), Integer.parseInt(Max_Salary));
        if (ijdao.save(jobs, false)) {
            result = "Data Berhasil Diupdate";
        }
        else {
            result = "maaf data gagal Diupdate";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "";
        if (ijdao.delete(id)) {
            result = "Data Berhasil Dihapus";
        }
        else {
            result = "maaf data gagal Dihapus";
        }
        return result;
    }
    
}
