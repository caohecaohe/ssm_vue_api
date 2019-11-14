package com.ssm.gbq.mapper;

import com.ssm.gbq.model.Interviews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InterviewsMapper {

    String selectTest();

    List<Interviews> selectInterviewsPage(@Param("currentPage")Integer currentPage,@Param("pageSize")Integer pageSize);

    int selectInterviewsCount();

    Interviews selectInterviewsById(@Param("id") Integer id);

    void delInterviewsById(@Param("id") Integer id);

    void updateInterviews(Interviews interviews);

    void addInterviews(Interviews interviews);
}
