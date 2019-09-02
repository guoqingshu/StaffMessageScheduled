package com.yuanian.staffmsg.Service;

import com.yuanian.staffmsg.Mapper.StaffMapper;
import com.yuanian.staffmsg.Pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class StaffService {

    @Autowired
    private StaffMapper staffmapper;

    public void addStaff() throws ParseException {
        Staff s=new Staff();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        s.setUsercode(10013);
        s.setUsername("王五");
        s.setDepartment("华北技术开发部");
        Date date=sdf.parse("2019-08-19");
        s.setHiredate(new java.sql.Date(new Date().getTime()));
        System.out.println(s);
        staffmapper.add(s);
    }

    public void addStaffMsg(Staff staff){
//        Staff staff=new Staff();
        staffmapper.add(staff);

    }

    public Staff findStaff(int usercode){
        return staffmapper.selectByUsercode(usercode);
    }

    public List<Staff> showAll(String starttime,String lasttime){

        List<Staff> list=new ArrayList<>();
        list=staffmapper.selectByHiredate(starttime,lasttime);
       // System.out.println(list);
        return list;

    }

    public void deleteStaff(){
       staffmapper.deleteByUsercode(1002);
    }

//    public Staff upStaff(){
//
//    }
}
