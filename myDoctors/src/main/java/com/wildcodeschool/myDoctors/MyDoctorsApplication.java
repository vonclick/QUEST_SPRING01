package com.wildcodeschool.myDoctors;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Controller
@SpringBootApplication
public class MyDoctorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDoctorsApplication.class, args);
	}

	
	
/*    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<p><a href='/doctor/01'> zera</a> </p>"+"</br>"+"<p><a href = '/doctor/02'>doctor2</a></p>";
    }
   
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<p>Bienvenue sur le site Doctor, cliquer <a href='/doctor'> ICI</a> pour y acceder </p>"+"</br>";
    }

    
    @RequestMapping("/doctor")
    @ResponseBody
    public String indexDoctors() {
        return "<p><a href='/doctor/03'>doctor3</a></p>"+"</br>"
              +"<p><a href='/doctor/06'>doctor6</a></p>"+"</br>"
              +"<p><a href='/doctor/09'>doctor9</a></p>"+"</br>"
              +"<p><a href='/doctor/12'>doctor12</a></p>";
    }

    
    @RequestMapping("/")
    @ResponseBody
    public String indexDoctors() {
        return "<p><a href='/doctor/03'>doctor3</a></p>"
              +"<p><a href='/doctor/06'>doctor6</a></p>"
              +"<p><a href='/doctor/09'>doctor9</a></p>"
              +"<p><a href='/doctor/12'>doctor12</a></p>";
    }   
*/

    
    
    @RequestMapping("/")
    @ResponseBody
    public String indexDoctors() {
        return "<p><ul></p>"
        		+"<p><li><a href='/doctor/03'>doctor3</a></li></p>"
        		+"<p><li><a href='/doctor/06'>doctor6</a></li></p>"
        		+"<p><li><a href='/doctor/09'>doctor9</a></li></p>"
        		+"<p><li><a href='/doctor/09'>doctor12</a></li></p>"    
               +"<p></ul></p>";
    }    
   
    
    
	
    @RequestMapping("/doctor/03")
    @ResponseBody
    public String doctor3() {
        return "<p>Jon Pertwee</p>";
    }
    
    @RequestMapping("/doctor/06")
    @ResponseBody
    public String doctor6() {
        return "Colin Baker";
    }
    
    @RequestMapping("/doctor/09")
    @ResponseBody
    public String doctor9() {
        return "Christopher Eccleston";
    }
    
    @RequestMapping("/doctor/12")
    @ResponseBody
    public String doctor12() {
        return "Peter Capaldi";
    }

    
    
    
    
    
	
}
