package com.ssm.gbq.dao.impl;

import com.ssm.gbq.dao.InterviewsDao;
import com.ssm.gbq.mapper.InterviewsMapper;
import com.ssm.gbq.model.Interviews;
import com.ssm.gbq.model.Teacher;
import gbq.ssm.utils.PageBounds;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InterviewsDaoImpl implements InterviewsDao {

    @Autowired
    private InterviewsMapper interviewsMapper;

    public String getTestIname() {
        return interviewsMapper.selectTest();
    }

    public List<Interviews> getAllInterviews() {
        return null;
    }

    public Interviews getInterviewsById(Integer id) {
        return interviewsMapper.selectInterviewsById(id);
    }

    public void updateInterviews(Interviews interviews) {
        interviewsMapper.updateInterviews(interviews);
    }

    public PageBounds<Interviews> getPageInterviews(Interviews interviews, Integer pageSize, Integer currentPage) {
        final int totalSize = interviewsMapper.selectInterviewsCount();
        PageBounds<Interviews> pageBounds = new PageBounds<Interviews>(currentPage, totalSize, pageSize);
        List<Interviews> list = interviewsMapper.selectInterviewsPage(currentPage, pageSize);
        pageBounds.setPageList(list);
        return pageBounds;
    }

    public void delInterviews(Integer id) {
        interviewsMapper.delInterviewsById(id);
    }

    public void addInterviews(Interviews interviews) {
        interviewsMapper.addInterviews(interviews);
    }


}
