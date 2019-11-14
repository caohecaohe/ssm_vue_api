package cn.interviews;

import com.ssm.gbq.controller.InterviewsController;
import com.ssm.gbq.controller.TeacherController;
import com.ssm.gbq.model.Interviews;
import gbq.ssm.utils.PageBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.List;


public class InterviewsControllerTest extends BaseTest{

    @Autowired
    private InterviewsController interviewsController;

    @Test
    public void test() {
        interviewsController.test();
    }

    @Test
    public void getTestIname() {
        String test = interviewsController.getTest();
        for (int i=0;i<10;i++){
            System.out.println(test);
        }
    }

//    @Test
//    public void getPageInterviews(){
//        PageBounds<Interviews> pageBounds = interviewsController.getPageInterviews(null,2,3);
//        List<Interviews>  list = pageBounds.getPageList();
//        System.out.println(list);
//    }



}