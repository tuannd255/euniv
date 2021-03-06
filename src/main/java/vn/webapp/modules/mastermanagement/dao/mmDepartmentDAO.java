/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.webapp.modules.mastermanagement.dao;

import java.util.List;

import vn.webapp.modules.mastermanagement.model.mmDepartment;

public interface mmDepartmentDAO {

    public List<mmDepartment> loadDepartmentList();
    
    public mmDepartment loadDepartmentByCode(String departmentCode);
    
    public mmDepartment loadADepartmentByCodes(String departmentCode, String falcutyCode);
    
}
