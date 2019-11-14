package com.ssm.gbq.service;

import com.ssm.gbq.model.Interviews;
import gbq.ssm.utils.PageBounds;

import java.util.List;


public interface InterviewsService {


    String getTestIname();

    /**
     * 获取所有面试信息列表
     */
    PageBounds<Interviews> getAllInterviews(Interviews interviews, Integer pageSize,Integer currentPage);

    /**
     *修改信息
     */
    void updateInterviews(Interviews interviews);

    /**
     * 删除信息
     */
    void delInterviewsById(Integer id);

    /**
     * 根据ID查询信息
     */
    Interviews getInterviewsById(Interviews id);

    /**
     * 增加面试信息
     * @param interviews
     */
    void addInterviews(Interviews interviews);
}
