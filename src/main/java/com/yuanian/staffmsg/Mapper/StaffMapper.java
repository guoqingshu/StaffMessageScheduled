package com.yuanian.staffmsg.Mapper;


import com.yuanian.staffmsg.Pojo.Staff;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface StaffMapper {

    //增
    @Insert("insert into staffmsg(usercode,username,department,hiredate) values(#{usercode},#{username},#{department},#{hiredate})")
    int add(Staff staff);

    //查-根据usercode查
    @Select("select *  from staffmsg where usercode=#{usercode}")
    public Staff selectByUsercode(int usercode);

    //查-根据hiredate查
    @Select("select * from staffmsg where hiredate >= #{starttime} and hiredate < #{lasttime}")
    List<Staff> selectByHiredate(String starttime,String  lasttime);

    //删
    @Delete("delete from staffmsg where usercode=#{usercode}")
    int deleteByUsercode(int usercode);

    //改
    @Update("update staffmsg set username=#{username},department=#{department},hiredate=#{hiredate} where usercode=#{usercode}")
    public Staff updateStaff(int usercode);
}
