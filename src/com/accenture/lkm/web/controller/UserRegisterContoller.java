package com.accenture.lkm.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.StoryBean;
import com.accenture.lkm.business.bean.UserBean;
import com.accenture.lkm.service.UserService;

@Controller
@SessionAttributes({"loginBean","storyBean"})
public class UserRegisterContoller {

	@Autowired
	private UserService us;
	
	@RequestMapping(value = "/register.html")
	public ModelAndView loadCompliantForm() {
		return new ModelAndView("registerPage","loginBean",new UserBean());
	}
	
	@RequestMapping(value ="/processRegistration.html", method = RequestMethod.POST)
	public ModelAndView processCompliantForm(@Valid @ModelAttribute("loginBean")UserBean bean,BindingResult result) throws Exception {
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("registerPage");
		}
		else {
			us.registerUserDetails(bean);
			mv.setViewName("Success");
			mv.addObject("message", ""+bean.getUserName()+" is successful registered, You can login now.");
		}
		return mv;
	}
	
	@RequestMapping(value="/login.html")
	public ModelAndView loginForm()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("loginBean",new UserBean());
		mav.setViewName("LoginPage");
		return mav;
	}
	@RequestMapping(value="/loginprocess.html")
	public ModelAndView loginProcess(@ModelAttribute("loginBean") UserBean loginBean)
	{
		List<UserBean>userList=new ArrayList<>();
		userList=us.getAllUserDetails();
		ModelAndView mav=new ModelAndView();
		for(UserBean ub:userList)
		{
			
			if(ub.getUserName().equals(loginBean.getUserName()))
			{
				if(ub.getPassword().equals(loginBean.getPassword()))
				{
				   
					mav.addObject("message","Welcome "+loginBean.getUserName());
					mav.addObject("storyBean",new StoryBean());
					//System.out.println(us.getUserById(1).getUserName());
					//The below line gives ID
					//System.out.println(ub.getUserId());
					mav.setViewName("LoginSuccess");
					return mav;
				}
			}
		}
		mav.addObject("message1","Enter valid Credentials");
		mav.addObject("loginBean",new UserBean());
		mav.setViewName("LoginPage");
		return mav;
	}
	
	
	
	@RequestMapping(value="/processStory.html")
	public ModelAndView story(@ModelAttribute("storyBean")  @Valid StoryBean storyBean,@ModelAttribute("loginBean") UserBean loginBean,BindingResult result)
	{
		ModelAndView mav=new ModelAndView();
		//System.out.println(loginBean.getUserName());
		if(result.hasErrors())
		{
	
			mav.setViewName("loginSuccess");
	
		}
		else {
		List<UserBean>userList=new ArrayList<>();
		userList=us.getAllUserDetails();
		for(UserBean ub:userList)
		{
			
			if(ub.getUserName().equals(loginBean.getUserName()))
			{
				if(ub.getPassword().equals(loginBean.getPassword()))
				{
					storyBean.setUserId(ub.getUserId());
				}
			}
		}
		
		us.registerStoryDetails(storyBean);
		
		mav.addObject("message", "Congratulations!! "+ loginBean.getUserName()+ " your story is saved.");
		mav.setViewName("Success");
		//System.out.println(storyBean.getStoryId());
		
	}
		return mav;
	}
	
	
	
	@RequestMapping("/allstories.html")
	public ModelAndView getAllStories()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("storyList",us.getAllStories());
		mav.setViewName("allStories");
		return mav;
	}
	
	
	@RequestMapping("/storypage.html")
	public ModelAndView getStoryPage(@RequestParam("id") int id)
	{
		System.out.println(id); 
		
	ModelAndView mav=new ModelAndView();
		List<StoryBean>lst=us.getAllStories();
		String s="";
		for(StoryBean sb:lst)
		{
			if(sb.getStoryId()==id)
			{
				s=sb.getStory();
				mav.addObject("title",sb.getStoryName());
			}
		}
		
		mav.addObject("message",s);
		mav.addObject("storiespage","BACK");
		mav.setViewName("Success");
		return mav;
	}
	
	
	
	
	
	
	
	
	
//	@ModelAttribute("types")
//	public Map<Integer,String> getAllCompliantTypes(){
//		return compliantService.getAllCompliantTypes();
//	}
//	
//	//Error Handler:
//	@ExceptionHandler(value=Exception.class)
//	public ModelAndView handleAllExceptions(Exception exception){	
//		ModelAndView  modelAndView = new ModelAndView();
//		modelAndView.setViewName("GeneralizedExceptionHandlerPage");
//		modelAndView.addObject("message", exception.getMessage());
//		modelAndView.addObject("exception", exception);
//		return modelAndView;
//	}
	
}
