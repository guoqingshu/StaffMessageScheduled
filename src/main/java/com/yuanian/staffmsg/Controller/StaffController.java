package com.yuanian.staffmsg.Controller;

import com.yuanian.staffmsg.Pojo.Staff;
import com.yuanian.staffmsg.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;


@RestController
@CrossOrigin
public class StaffController {

    @Autowired
    private StaffService staffservice;

//    @PostMapping("msg")
//    public Staff Showinfo(@RequestParam(value="usercode") String usercode){
//        return staffservice.findStaff(Integer.parseInt(usercode));
//    }

    @PostMapping("msg/{usercode}")
    public Staff ShowMsg(@PathVariable(value = "usercode") int usercode){
        System.out.println(usercode);
        return staffservice.findStaff(usercode);
    }


    @GetMapping("insert")
    public void insertStaff() throws ParseException {
        staffservice.addStaff();
    }

//    @GetMapping("find")
//    public Staff findStaff(int usercode){
//        return staffservice.findStaff(usercode);
//    }

    @GetMapping("delete")
    public void delStaff(){
        staffservice.deleteStaff();
    }

    @PostMapping("getdata")
    public List<Staff> gerDate(@RequestParam(value="startTime") String starttime,
                               @RequestParam(value="lastTime") String lasttime){

//        System.out.println(starttime);
//        System.out.println(lasttime);
        return staffservice.showAll(starttime,lasttime);
    }

}
