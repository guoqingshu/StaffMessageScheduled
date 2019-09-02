package com.yuanian.staffmsg.Schedule;


import com.yuanian.staffmsg.Mapper.StaffMapper;
import com.yuanian.staffmsg.Pojo.Staff;
import com.yuanian.staffmsg.Service.StaffService;
import com.yuanian.staffmsg.Utils.GetUrl;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import net.sf.json.JSONObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component
@Configurable
@EnableScheduling
public class ScheduleTask{
    @Autowired
    private StaffService staffservice;

    @Autowired
    StaffMapper staffMapper;

    @Scheduled(cron = "* * 1 * * ?")
    public void reportCurrentByCron() throws ParseException {
        GetUrl gu=new GetUrl();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String content= gu.result();
        System.out.println(content);
        //System.out.println(content);
       // JSONObject json=JSONObject.fromObject(content);
        List<Staff> list=new ArrayList<>();
        JSONArray msg=JSONArray.fromObject(content);
        for(int i=0;i<msg.size();i++){
            JSONObject json = msg.getJSONObject(i);
            Staff staff=new Staff();
            Date date=sdf.parse(json.getString("hiredate"));
            staff.setUsername(json.getString("username"));
            staff.setUsercode(Integer.parseInt(json.getString("usercode")));
            staff.setDepartment(json.getString("department"));
            staff.setHiredate(new java.sql.Date(date.getTime()));
            list.add(staff);
            staffservice.addStaffMsg(staff);
        }
        System.out.println(list);
    }
}