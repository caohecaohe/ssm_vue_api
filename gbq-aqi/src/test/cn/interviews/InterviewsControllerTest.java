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

import javax.xml.crypto.Data;
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

    @Test
    public void getPageInterviews(){
        Interviews interviews = new Interviews();
        interviews.setIname("张");
        HashMap<String,Object> hashMap = interviewsController.getPageInterviews(interviews,2,1);
        Object obje = hashMap.get("data");
        System.out.println(obje);
    }



}