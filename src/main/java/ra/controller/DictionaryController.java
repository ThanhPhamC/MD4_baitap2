package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("DictionaryController")
public class DictionaryController {
    public static ArrayList<String> list1= new ArrayList<>();
    public static ArrayList<String> list2= new ArrayList<>();
    @PostMapping("result")
    public ModelAndView showResult(String valueInput){
        ModelAndView mav= new ModelAndView("search");
        String result=null;
        list1.add("xin chao");
        list1.add("tim kiem");
        list1.add("co");
        list1.add("khong");
        list2.add("hello");
        list2.add("search");
        list2.add("yes");
        list2.add("no");

        boolean check =false;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).equals(valueInput)){
                result=list1.get(i);
                check=true;
                break;
            }
        }
        if (!check){
            result= "khong tim thay";
        }
        mav.addObject("result", result);
        return mav;
    }
}
