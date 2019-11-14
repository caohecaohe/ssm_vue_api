package com.ssm.gbq.dao;

import com.ssm.gbq.model.Interviews;
import gbq.ssm.utils.PageBounds;

import java.util.List;

public interface InterviewsDao {

    String getTestIname();

    /**
     * 查询所有面试信息
     * @author tian
     */
    List<Interviews> getAllInterviews();

    /**
     * 按ID查询面试信息
     * @author tian
     */
    Interviews getInterviewsById(Integer id);

    /**
     * 修改面试信息
     * @author tain
     */
    void updateInterviews(Interviews interviews);

    /**
     * 分页查询
     * @author tian
     */
    PageBounds<Interviews> getPageInterviews(Interviews interviews , Integer pageSize, Integer currentPage);

    /**
     * 删除面试信息
     * @author tian
     */
    void delInterviews(Integer id);

    /**
     * 增加面试信息
     * @param interviews
     */
    void addInterviews(Interviews interviews);
}
