package com.ssm.gbq.controller;


import com.ssm.gbq.model.Interviews;
import com.ssm.gbq.service.InterviewsService;
import gbq.ssm.utils.PageBounds;
import io.swagger.models.auth.In;
import org.apache.shiro.crypto.hash.Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/interviews")
public class InterviewsController {

    @Autowired
    private InterviewsService interviewsService;

    /**
     * 分页查询所有信息
     * @param interviews
     * @param pageSize
     * @param currentPage
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getPageInterviews",method = RequestMethod.POST)
    public HashMap<String,Object> getPageInterviews(Interviews interviews,Integer pageSize,Integer currentPage){

        HashMap<String,Object> result = new HashMap<String,Object>();
        PageBounds<Interviews> pageBounds = interviewsService.getAllInterviews(interviews,currentPage,pageSize);
        result.put("data", pageBounds);
        return result;
    }

    /**
     * 根据id删除信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delInterviews" ,method = RequestMethod.POST)
    public HashMap<String,Object> delInterviews(Integer id){
        HashMap<String,Object> result = new HashMap<String,Object>();
        interviewsService.delInterviewsById(id);
        return result;
    }

    /**
     * 修改信息
     * @param interviews
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/updateInterviews",method = RequestMethod.POST)
    public HashMap<String,Object> updataInterviews(Interviews interviews){
        HashMap<String,Object> result = new HashMap<String,Object>();
        interviewsService.updateInterviews(interviews);
        return result;
    }

    /**
     * 增加信息
     * @param interviews
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insertInterviews",method = RequestMethod.POST)
    public HashMap<String,Object> insertInterviews(Interviews interviews){
        HashMap<String,Object> result = new HashMap<String,Object>();
        interviewsService.addInterviews(interviews);
        return result;
    }

    @ResponseBody
    @RequestMapping(value="/test")
    public void test(){
        for (int i = 0;i<10;i++) {
            System.out.println("+++++++++++++控制层测试方法++++++++++++++");
        }
    }
    @ResponseBody
    @RequestMapping(value="/getTest")
    public String getTest(){
        String testname = interviewsService.getTestIname();
        return testname;
    }



}
