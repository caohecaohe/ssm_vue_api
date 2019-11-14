package com.ssm.gbq.service.impl;

import com.ssm.gbq.dao.InterviewsDao;
import com.ssm.gbq.dao.impl.InterviewsDaoImpl;
import com.ssm.gbq.model.Interviews;
import com.ssm.gbq.service.InterviewsService;
import gbq.ssm.utils.PageBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewsServiceImpl implements InterviewsService {

    @Autowired
    private InterviewsDao interviewsDao;

    public String getTestIname() {
        return interviewsDao.getTestIname();
    }

    public PageBounds<Interviews> getAllInterviews(Interviews interviews, Integer pageSize, Integer currentPage) {
        return interviewsDao.getPageInterviews(interviews,currentPage,pageSize);
    }

    public void updateInterviews(Interviews interviews) {

    }

    public void delInterviewsById(Integer id) {

    }

    public Interviews getInterviewsById(Interviews id) {
        return null;
    }

    public void addInterviews(Interviews interviews) {
        interviewsDao.addInterviews(interviews);
    }


}
