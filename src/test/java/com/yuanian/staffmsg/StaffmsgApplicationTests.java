package com.yuanian.staffmsg;


import com.yuanian.staffmsg.Controller.StaffController;
import com.yuanian.staffmsg.Service.StaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StaffmsgApplicationTests {


//    ScheduleTask scheduleTask;
    @Autowired
    private StaffService staffService;
    private StaffController staffcontroller;

    @Test
    public void contextLoads(){
//        scheduleTask.reportCurrentByCron();
//        for(int i=0;;i++){
//    }
     //  staffService.showAll();

    }

}
