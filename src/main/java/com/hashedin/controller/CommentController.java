package com.hashedin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hashedin.model.Comment;


@Controller
public class CommentController
{

    @RequestMapping(method = RequestMethod.GET, value = "/comments")
    public ModelAndView getView(@ModelAttribute("comments") Comment comment)
    {
    	
    	
        return new ModelAndView("addComment");
    }


    @RequestMapping(method = RequestMethod.POST, value = "/comments")
    public ModelAndView add(Model model, @ModelAttribute("comments") Comment comment)
    {
    	System.out.println("hiiiiiiiiiiiiiiiiiii");
        return new ModelAndView("commentAdded", "comment", comment);
    }
}
